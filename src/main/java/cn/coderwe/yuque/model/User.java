package cn.coderwe.yuque.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 一般在列表的场景返回的用户信息。
 *
 * @author : CoderWe
 * @date : 2022-05-01 02:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
     * 用户编号
     */
    private Integer id;

    /**
     * 类型 [`User`  - 用户, Group - 团队]
     */
    private String type;


    /**
     * 用户个人路径
     */
    private String login;

    /**
     * 昵称
     */
    private String name;

    /**
     * 头像 URL
     */
    @JsonProperty("avatar_url")
    private String avatarUrl;

    /**
     * 多少人关注我
     */
    @JsonProperty("followers_count")
    private Integer followersCount;

    /**
     * 我关注多少人
     */
    @JsonProperty("following_count")
    private Integer followingCount;

    /**
     * 介绍
     */
    private String description;

    /**
     * 创建时间
     */
    @JsonProperty("created_at")
    private Date createdAt;

    /**
     * 更新时间
     */
    @JsonProperty("updated_at")
    private Date updatedAt;
}
