package cn.coderwe.yuque.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户/团队详细信息
 *
 * @author : CoderWe
 * @date : 2022-05-01 01:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetail {

    /**
     * 用户编号
     */
    private Integer id;

    /**
     * 类型 [`User`  - 用户, Group - 团队]
     */
    private String type;

    /**
     * 企业空间编号
     */
    @JsonProperty("space_id")
    private Integer spaceId;

    /**
     * 用户账户编号
     */
    @JsonProperty("account_id")
    private Integer accountId;

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
     * 仓库数量
     */
    @JsonProperty("books_count")
    private Integer booksCount;

    /**
     * 公开仓库数量
     */
    @JsonProperty("public_books_count")
    private Integer publicBooksCount;

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
     * 可能是【是否公开】
     */
    @JsonProperty("public")
    private Integer isPublic;

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

    /**
     * 可能是当前实体的版本
     */
    @JsonProperty("_serializer")
    private String serializer;
}
