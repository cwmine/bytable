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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AutomationRobotIntroductionPO
 */
@JsonPropertyOrder({
  AutomationRobotIntroductionPO.JSON_PROPERTY_DESCRIPTION,
  AutomationRobotIntroductionPO.JSON_PROPERTY_IS_ACTIVE,
  AutomationRobotIntroductionPO.JSON_PROPERTY_NAME,
  AutomationRobotIntroductionPO.JSON_PROPERTY_PROPS,
  AutomationRobotIntroductionPO.JSON_PROPERTY_RESOURCE_ID,
  AutomationRobotIntroductionPO.JSON_PROPERTY_ROBOT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutomationRobotIntroductionPO {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_IS_ACTIVE = "isActive";
  private Integer isActive;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROPS = "props";
  private String props;

  public static final String JSON_PROPERTY_RESOURCE_ID = "resourceId";
  private String resourceId;

  public static final String JSON_PROPERTY_ROBOT_ID = "robotId";
  private String robotId;

  public AutomationRobotIntroductionPO() {
  }

  public AutomationRobotIntroductionPO description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public AutomationRobotIntroductionPO isActive(Integer isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * minimum: 0
   * @return isActive
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getIsActive() {
    return isActive;
  }


  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsActive(Integer isActive) {
    this.isActive = isActive;
  }


  public AutomationRobotIntroductionPO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public AutomationRobotIntroductionPO props(String props) {
    
    this.props = props;
    return this;
  }

   /**
   * Get props
   * @return props
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProps() {
    return props;
  }


  @JsonProperty(JSON_PROPERTY_PROPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProps(String props) {
    this.props = props;
  }


  public AutomationRobotIntroductionPO resourceId(String resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getResourceId() {
    return resourceId;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  public AutomationRobotIntroductionPO robotId(String robotId) {
    
    this.robotId = robotId;
    return this;
  }

   /**
   * Get robotId
   * @return robotId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROBOT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRobotId() {
    return robotId;
  }


  @JsonProperty(JSON_PROPERTY_ROBOT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRobotId(String robotId) {
    this.robotId = robotId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomationRobotIntroductionPO automationRobotIntroductionPO = (AutomationRobotIntroductionPO) o;
    return Objects.equals(this.description, automationRobotIntroductionPO.description) &&
        Objects.equals(this.isActive, automationRobotIntroductionPO.isActive) &&
        Objects.equals(this.name, automationRobotIntroductionPO.name) &&
        Objects.equals(this.props, automationRobotIntroductionPO.props) &&
        Objects.equals(this.resourceId, automationRobotIntroductionPO.resourceId) &&
        Objects.equals(this.robotId, automationRobotIntroductionPO.robotId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isActive, name, props, resourceId, robotId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomationRobotIntroductionPO {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
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

