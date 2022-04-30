package cn.coderwe.yuque.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 文档详细信息
 *
 * @author : CoderWe
 * @date : 2022-05 01-03:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocDetail {

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
     * 仓库编号，就是 repo_id
     */
    @JsonProperty("book_id")
    private Long bookId;

    /**
     * 仓库信息
     */
    private Book book;

    /**
     * 文档创建人 user_id
     */
    @JsonProperty("user_id")
    private Long userId;

    /**
     * 文档创建人信息
     */
    private User user;

    /**
     * 描述了正文的格式 [asl, markdown]
     */
    private String format;

    /**
     * 正文 Markdown 源代码
     */
    private String body;

    /**
     * 草稿 Markdown 源代码
     */
    @JsonProperty("body_draft")
    private String bodyDraft;

    /**
     * 转换过后的正文 HTML
     */
    @JsonProperty("body_html")
    private String bodyHtml;

    /**
     * 语雀 lake 格式的文档内容
     */
    @JsonProperty("body_lake")
    private String bodyLake;

    /**
     * 未知字段
     */
    @JsonProperty("body_draft_lake")
    private String bodyDraftLake;

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
     * 删除时间
     */
    @JsonProperty("deleted_at")
    private Date deletedAt;

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
    @JsonProperty("word_count")
    private Integer wordCount;

    /**
     * 未知字段
     */
    private String cover;

    /**
     * 简介
     */
    private String description;

    /**
     * 未知字段
     */
    @JsonProperty("custom_description")
    private String customDescription;

    /**
     * 未知字段
     */
    private Integer hits;

    /**
     * 可能是当前实体的版本
     */
    @JsonProperty("_serializer")
    private String serializer;
}
