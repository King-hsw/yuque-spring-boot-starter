package cn.coderwe.yuque.service.impl;

import cn.coderwe.yuque.YuqueProperties;
import cn.coderwe.yuque.model.Book;
import cn.coderwe.yuque.model.Doc;
import cn.coderwe.yuque.model.DocDetail;
import cn.coderwe.yuque.model.UserDetail;
import cn.coderwe.yuque.service.YuqueService;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author : CoderWe
 * @date : 2022-05-01 01:19
 */
@Service
public class YuqueServiceImpl implements YuqueService {

    @Resource
    private YuqueProperties properties;

    @Resource
    private RestTemplate restTemplate;

    /**
     * 获取认证的用户的个人信息
     *
     * @return {@link UserDetail}
     * @author hongsw
     * @date 2022/5/1 01:20
     **/
    @Override
    public UserDetail getUser() {
        ParameterizedTypeReference<Map<String, UserDetail>> typeReference =
                new ParameterizedTypeReference<Map<String, UserDetail>>() {
                };
        ResponseEntity<Map<String, UserDetail>> exchange = restTemplate.exchange(
                "https://www.yuque.com/api/v2/user",
                HttpMethod.GET,
                getStringHttpEntity(),
                typeReference
        );
        return Objects.requireNonNull(exchange.getBody()).get("data");
    }

    /**
     * 获取某个用户/团队的知识库列表
     *
     * @return {@link List < Book >}
     * @author hongsw
     * @date 2022/5/1 02:13
     **/
    @Override
    public List<Book> listBook() {
        ParameterizedTypeReference<Map<String, List<Book>>> typeReference =
                new ParameterizedTypeReference<Map<String, List<Book>>>() {
                };
        ResponseEntity<Map<String, List<Book>>> exchange = restTemplate.exchange(
                "https://www.yuque.com/api/v2/users/{id}/repos",
                HttpMethod.GET,
                getStringHttpEntity(),
                typeReference,
                getUser().getId());
        return Objects.requireNonNull(exchange.getBody()).get("data");
    }

    /**
     * 获取一个仓库的文档列表
     *
     * @param id {@link int} 仓库id
     * @return {@link List< Doc >}
     * @author hongsw
     * @date 2022/5/1 02:25
     **/
    @Override
    public List<Doc> listDoc(int id) {
        ParameterizedTypeReference<Map<String, List<Doc>>> typeReference =
                new ParameterizedTypeReference<Map<String, List<Doc>>>() {
                };
        ResponseEntity<Map<String, List<Doc>>> exchange = restTemplate.exchange(
                "https://www.yuque.com/api/v2/repos/{id}/docs",
                HttpMethod.GET,
                getStringHttpEntity(),
                typeReference,
                id);
        return Objects.requireNonNull(exchange.getBody()).get("data");
    }

    /**
     * 获取单篇文档的详细信息
     *
     * @param repoId {@link int} 知识库id
     * @param slug   {@link String}  文档路径
     * @return {@link Doc}
     * @author hongsw
     * @date 2022/5/1 03:08
     **/
    @Override
    public DocDetail getDoc(int repoId, String slug) {
        ParameterizedTypeReference<Map<String, DocDetail>> typeReference =
                new ParameterizedTypeReference<Map<String, DocDetail>>() {
                };
        ResponseEntity<Map<String, DocDetail>> exchange = restTemplate.exchange(
                "https://www.yuque.com/api/v2/repos/{repoId}/docs/{slug}",
                HttpMethod.GET,
                getStringHttpEntity(),
                typeReference,
                repoId, slug);
        return Objects.requireNonNull(exchange.getBody()).get("data");
    }

    /**
     * 拼接专属的响应头
     *
     * @return {@link HttpEntity<String>}
     * @author hongsw
     * @date 2022/5/1 02:19
     **/
    private HttpEntity<?> getStringHttpEntity() {
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.set("Content-Type", "application/json");
        requestHeaders.set("X-Auth-Token", properties.getToken());
        return new HttpEntity<String>(requestHeaders);
    }
}
