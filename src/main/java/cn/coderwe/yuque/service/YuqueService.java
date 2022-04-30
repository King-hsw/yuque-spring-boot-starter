package cn.coderwe.yuque.service;

import cn.coderwe.yuque.model.Book;
import cn.coderwe.yuque.model.Doc;
import cn.coderwe.yuque.model.DocDetail;
import cn.coderwe.yuque.model.UserDetail;

import java.util.List;

/**
 * @author : CoderWe
 * @date : 2022-05-01 01:03
 */
public interface YuqueService {
    /**
     * 获取认证的用户的个人信息
     *
     * @return {@link UserDetail}
     * @author hongsw
     * @date 2022/5/1 01:20
     **/
    UserDetail getUser();

    /**
     * 获取认证的用户/团队的知识库列表
     *
     * @return {@link List<Book>}
     * @author hongsw
     * @date 2022/5/1 02:13
     **/
    List<Book> listBook();

    /**
     * 获取一个仓库的文档列表
     *
     * @param id {@link int}
     * @return {@link List<Doc>}
     * @author hongsw
     * @date 2022/5/1 02:25
     **/
    List<Doc> listDoc(int id);

    /**
     * 获取单篇文档的详细信息
     *
     * @param repoId {@link int} 知识库id
     * @param slug   {@link java.lang.String}  文档路径
     * @return {@link Doc}
     * @author hongsw
     * @date 2022/5/1 03:08
     **/
    DocDetail getDoc(int repoId, String slug);
}
