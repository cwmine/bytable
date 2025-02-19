/*
 * databus-server
 * databus-server APIs
 *
 * The version of the OpenAPI document: 1.6.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.apitable.starter.databus.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.apitable.starter.databus.client.model.CommentMsg;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Comments
 */
@JsonPropertyOrder({
  Comments.JSON_PROPERTY_COMMENT_ID,
  Comments.JSON_PROPERTY_COMMENT_MSG,
  Comments.JSON_PROPERTY_CREATED_AT,
  Comments.JSON_PROPERTY_REVISION,
  Comments.JSON_PROPERTY_UNIT_ID,
  Comments.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Comments {
  public static final String JSON_PROPERTY_COMMENT_ID = "commentId";
  private String commentId;

  public static final String JSON_PROPERTY_COMMENT_MSG = "commentMsg";
  private CommentMsg commentMsg;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private Long createdAt;

  public static final String JSON_PROPERTY_REVISION = "revision";
  private Integer revision;

  public static final String JSON_PROPERTY_UNIT_ID = "unitId";
  private String unitId;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private Long updatedAt;

  public Comments() {
  }

  public Comments commentId(String commentId) {
    
    this.commentId = commentId;
    return this;
  }

   /**
   * Get commentId
   * @return commentId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCommentId() {
    return commentId;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCommentId(String commentId) {
    this.commentId = commentId;
  }


  public Comments commentMsg(CommentMsg commentMsg) {
    
    this.commentMsg = commentMsg;
    return this;
  }

   /**
   * Get commentMsg
   * @return commentMsg
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMMENT_MSG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CommentMsg getCommentMsg() {
    return commentMsg;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT_MSG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCommentMsg(CommentMsg commentMsg) {
    this.commentMsg = commentMsg;
  }


  public Comments createdAt(Long createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * minimum: 0
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }


  public Comments revision(Integer revision) {
    
    this.revision = revision;
    return this;
  }

   /**
   * Get revision
   * minimum: 0
   * @return revision
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REVISION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRevision() {
    return revision;
  }


  @JsonProperty(JSON_PROPERTY_REVISION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRevision(Integer revision) {
    this.revision = revision;
  }


  public Comments unitId(String unitId) {
    
    this.unitId = unitId;
    return this;
  }

   /**
   * Get unitId
   * @return unitId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNIT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUnitId() {
    return unitId;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnitId(String unitId) {
    this.unitId = unitId;
  }


  public Comments updatedAt(Long updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * minimum: 0
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comments comments = (Comments) o;
    return Objects.equals(this.commentId, comments.commentId) &&
        Objects.equals(this.commentMsg, comments.commentMsg) &&
        Objects.equals(this.createdAt, comments.createdAt) &&
        Objects.equals(this.revision, comments.revision) &&
        Objects.equals(this.unitId, comments.unitId) &&
        Objects.equals(this.updatedAt, comments.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentId, commentMsg, createdAt, revision, unitId, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comments {\n");
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    commentMsg: ").append(toIndentedString(commentMsg)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

