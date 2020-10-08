/*
 * CoalFired product catalog
 * This API contains a catalog of CoalFired's products and pricing
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support+coalfired@practiv.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.ProductOfferingDeleteEventPayload;
import org.threeten.bp.OffsetDateTime;

/**
 * The notification data structure
 */
@ApiModel(description = "The notification data structure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-08T14:44:14.902+13:00[Pacific/Auckland]")
public class ProductOfferingDeleteEvent {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_EVENT_ID = "eventId";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private String eventId;

  public static final String SERIALIZED_NAME_EVENT_TIME = "eventTime";
  @SerializedName(SERIALIZED_NAME_EVENT_TIME)
  private OffsetDateTime eventTime;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_CORRELATION_ID = "correlationId";
  @SerializedName(SERIALIZED_NAME_CORRELATION_ID)
  private String correlationId;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private String priority;

  public static final String SERIALIZED_NAME_TIME_OCURRED = "timeOcurred";
  @SerializedName(SERIALIZED_NAME_TIME_OCURRED)
  private OffsetDateTime timeOcurred;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private ProductOfferingDeleteEventPayload event;


  public ProductOfferingDeleteEvent id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identifier of the Process flow
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the Process flow")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ProductOfferingDeleteEvent href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Reference of the ProcessFlow
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference of the ProcessFlow")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public ProductOfferingDeleteEvent eventId(String eventId) {
    
    this.eventId = eventId;
    return this;
  }

   /**
   * The identifier of the notification.
   * @return eventId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The identifier of the notification.")

  public String getEventId() {
    return eventId;
  }


  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  public ProductOfferingDeleteEvent eventTime(OffsetDateTime eventTime) {
    
    this.eventTime = eventTime;
    return this;
  }

   /**
   * Time of the event occurrence.
   * @return eventTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time of the event occurrence.")

  public OffsetDateTime getEventTime() {
    return eventTime;
  }


  public void setEventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }


  public ProductOfferingDeleteEvent eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * The type of the notification.
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the notification.")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public ProductOfferingDeleteEvent correlationId(String correlationId) {
    
    this.correlationId = correlationId;
    return this;
  }

   /**
   * The correlation id for this event.
   * @return correlationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The correlation id for this event.")

  public String getCorrelationId() {
    return correlationId;
  }


  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }


  public ProductOfferingDeleteEvent domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * The domain of the event.
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The domain of the event.")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


  public ProductOfferingDeleteEvent title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of the event.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of the event.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ProductOfferingDeleteEvent description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * An explnatory of the event.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An explnatory of the event.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ProductOfferingDeleteEvent priority(String priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * A priority.
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A priority.")

  public String getPriority() {
    return priority;
  }


  public void setPriority(String priority) {
    this.priority = priority;
  }


  public ProductOfferingDeleteEvent timeOcurred(OffsetDateTime timeOcurred) {
    
    this.timeOcurred = timeOcurred;
    return this;
  }

   /**
   * The time the event occured.
   * @return timeOcurred
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time the event occured.")

  public OffsetDateTime getTimeOcurred() {
    return timeOcurred;
  }


  public void setTimeOcurred(OffsetDateTime timeOcurred) {
    this.timeOcurred = timeOcurred;
  }


  public ProductOfferingDeleteEvent event(ProductOfferingDeleteEventPayload event) {
    
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductOfferingDeleteEventPayload getEvent() {
    return event;
  }


  public void setEvent(ProductOfferingDeleteEventPayload event) {
    this.event = event;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOfferingDeleteEvent productOfferingDeleteEvent = (ProductOfferingDeleteEvent) o;
    return Objects.equals(this.id, productOfferingDeleteEvent.id) &&
        Objects.equals(this.href, productOfferingDeleteEvent.href) &&
        Objects.equals(this.eventId, productOfferingDeleteEvent.eventId) &&
        Objects.equals(this.eventTime, productOfferingDeleteEvent.eventTime) &&
        Objects.equals(this.eventType, productOfferingDeleteEvent.eventType) &&
        Objects.equals(this.correlationId, productOfferingDeleteEvent.correlationId) &&
        Objects.equals(this.domain, productOfferingDeleteEvent.domain) &&
        Objects.equals(this.title, productOfferingDeleteEvent.title) &&
        Objects.equals(this.description, productOfferingDeleteEvent.description) &&
        Objects.equals(this.priority, productOfferingDeleteEvent.priority) &&
        Objects.equals(this.timeOcurred, productOfferingDeleteEvent.timeOcurred) &&
        Objects.equals(this.event, productOfferingDeleteEvent.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, eventId, eventTime, eventType, correlationId, domain, title, description, priority, timeOcurred, event);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingDeleteEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeOcurred: ").append(toIndentedString(timeOcurred)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

