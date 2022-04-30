package cn.coderwe.yuque.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 文档基本信息，一般用在列表场景。
 *
 * @author : CoderWe
 * @date : 2022-05-01 02:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doc {

    /**
     * 文档编号
     */
    private Long id;

    /**
     * 文档路径
     */
    private String slug;

    /**
     * 标题
     */
    private String title;

    /**
     * 简介
     */
    private String description;

    /**
     * 文档创建人 user_id
     */
    @JsonProperty("user_id")
    private Long userId;

    /**
     * 仓库编号，就是 repo_id
     */
    @JsonProperty("book_id")
    private Long bookId;

    /**
     * 描述了正文的格式 [asl, markdown]
     */
    private String format;

    /**
     * 是否公开 [1 - 公开, 0 - 私密]
     */
    @JsonProperty("public")
    private Integer isPublic;

    /**
     * 状态 [0 - 草稿, 1 - 发布]
     */
    private Long status;

    /**
     * 未知字段
     */
    @JsonProperty("view_status")
    private Long viewStatus;

    /**
     * 未知字段
     */
    @JsonProperty("read_status")
    private Long readStatus;

    /**
     * 赞数量
     */
    @JsonProperty("likes_count")
    private Long likesCount;

    /**
     * 未知字段
     */
    @JsonProperty("read_count")
    private Long readCount;

    /**
     * 评论数量
     */
    @JsonProperty("comments_count")
    private Long commentsCount;

    /**
     * 文档内容更新时间
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
     * 未知字段
     */
    @JsonProperty("published_at")
    private String publishedAt;

    /**
     * 未知字段
     */
    @JsonProperty("first_published_at")
    private String firstPublishedAt;

    /**
     * 未知字段
     */
    @JsonProperty("draft_version")
    private Integer draftVersion;

    /**
     * 最后编辑人的id
     */
    @JsonProperty("last_editor_id")
    private Long lastEditorId;

    /**
     * 未知字段
     */
    @JsonProperty("word_count")
    private Integer wordCount;

    /**
     * 未知字段
     */
    private String cover;

    /**
     * 未知字段
     */
    @JsonProperty("custom_description")
    private String customDescription;

    /**
     * 最近一次的编辑人
     */
    @JsonProperty("last_editor")
    private User lastEditor;

    /**
     * 未知字段
     */
    private Book book;

    /**
     * 可能是当前实体的版本
     */
    @JsonProperty("_serializer")
    private String serializer;
}
