package cn.coderwe.yuque;

import cn.coderwe.yuque.service.YuqueService;
import cn.coderwe.yuque.service.impl.YuqueServiceImpl;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author : CoderWe
 * @date : 2022-05-01 00:54
 */
@Configuration
@EnableConfigurationProperties(YuqueProperties.class)
public class YuqueAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean(RestTemplate.class)
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public YuqueService yuqueService() {
        return new YuqueServiceImpl();
    }

}
