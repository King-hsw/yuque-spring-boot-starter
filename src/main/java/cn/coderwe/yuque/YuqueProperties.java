package cn.coderwe.yuque;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author : CoderWe
 * @date : 2022-05-01 00:51
 */
@Data
@ConfigurationProperties("yuque")
public class YuqueProperties {
    /**
     * X-Auth-Token
     */
    private String token;
}
