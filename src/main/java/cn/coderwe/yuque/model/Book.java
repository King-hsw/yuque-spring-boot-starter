package cn.coderwe.yuque.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 一般在列表的场景返回的仓库信息
 *
 * @author : CoderWe
 * @date : 2022-05-01 02:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    /**
     * 仓库编号
     */
    private Long id;

    /**
     * 类型 [Book - 文档]
     */
    private String type;

    /**
     * 仓库路径
     */
    private String slug;

    /**
     * 名称
     */
    private String name;

    /**
     * 所属的团队/用户编号
     */
    @JsonProperty("user_id")
    private Long userId;

    /**
     * 介绍
     */
    private String description;

    /**
     * 创建人 User Id
     */
    @JsonProperty("creator_id")
    private Long creatorId;

    /**
     * 公开状态 [1 - 公开, 0 - 私密]
     */
    @JsonProperty("public")
    private Long isPublic;

    /**
     * 文档数量
     */
    @JsonProperty("items_count")
    private Long itemsCount;

    /**
     * 喜欢数量
     */
    @JsonProperty("likes_count")
    private Long likesCount;

    /**
     * 订阅数量
     */
    @JsonProperty("watches_count")
    private Long watchesCount;

    /**
     * 可能是内容更新时间
     */
    @JsonProperty("content_updated_at")
    private Date contentUpdatedAt;

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
     * 仓库完整路径 user.login/book.slug
     */
    private String namespace;

    /**
     * 仓库归属人
     */
    private User user;

    /**
     * 可能是当前实体的版本
     */
    @JsonProperty("_serializer")
    private String serializer;

}
