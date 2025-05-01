
package com.example.models;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The root schema
 * <p>
 * The notification response schema that comprises the entire JSON document for ORDER_CHANGE notification.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NotificationVersion",
    "NotificationType",
    "PayloadVersion",
    "EventTime",
    "Payload",
    "NotificationMetadata"
})
@Generated("jsonschema2pojo")
public class OrderChangeNotification {

    /**
     * The NotificationVersion schema
     * <p>
     * The notification version.
     * (Required)
     * 
     */
    @JsonProperty("NotificationVersion")
    @JsonPropertyDescription("The notification version.")
    private String notificationVersion;
    /**
     * The NotificationType schema
     * <p>
     * The type of this notification, used to differentiate different notifications. Combined with payload version, this controls the structure of the payload object.
     * (Required)
     * 
     */
    @JsonProperty("NotificationType")
    @JsonPropertyDescription("The type of this notification, used to differentiate different notifications. Combined with payload version, this controls the structure of the payload object.")
    private String notificationType;
    /**
     * The PayloadVersion schema
     * <p>
     * The payload version of the notification.
     * (Required)
     * 
     */
    @JsonProperty("PayloadVersion")
    @JsonPropertyDescription("The payload version of the notification.")
    private String payloadVersion;
    /**
     * The EventTime schema
     * <p>
     * The time when this notification was published, in ISO-8601 date/time format.
     * (Required)
     * 
     */
    @JsonProperty("EventTime")
    @JsonPropertyDescription("The time when this notification was published, in ISO-8601 date/time format.")
    private String eventTime;
    /**
     * The Payload schema
     * <p>
     * The payload for the ORDER_CHANGE notification.
     * (Required)
     * 
     */
    @JsonProperty("Payload")
    @JsonPropertyDescription("The payload for the ORDER_CHANGE notification.")
    private Payload payload;
    /**
     * The NotificationMetadata schema
     * <p>
     * The notification metadata.
     * (Required)
     * 
     */
    @JsonProperty("NotificationMetadata")
    @JsonPropertyDescription("The notification metadata.")
    private NotificationMetadata notificationMetadata;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The NotificationVersion schema
     * <p>
     * The notification version.
     * (Required)
     * 
     */
    @JsonProperty("NotificationVersion")
    public String getNotificationVersion() {
        return notificationVersion;
    }

    /**
     * The NotificationVersion schema
     * <p>
     * The notification version.
     * (Required)
     * 
     */
    @JsonProperty("NotificationVersion")
    public void setNotificationVersion(String notificationVersion) {
        this.notificationVersion = notificationVersion;
    }

    /**
     * The NotificationType schema
     * <p>
     * The type of this notification, used to differentiate different notifications. Combined with payload version, this controls the structure of the payload object.
     * (Required)
     * 
     */
    @JsonProperty("NotificationType")
    public String getNotificationType() {
        return notificationType;
    }

    /**
     * The NotificationType schema
     * <p>
     * The type of this notification, used to differentiate different notifications. Combined with payload version, this controls the structure of the payload object.
     * (Required)
     * 
     */
    @JsonProperty("NotificationType")
    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    /**
     * The PayloadVersion schema
     * <p>
     * The payload version of the notification.
     * (Required)
     * 
     */
    @JsonProperty("PayloadVersion")
    public String getPayloadVersion() {
        return payloadVersion;
    }

    /**
     * The PayloadVersion schema
     * <p>
     * The payload version of the notification.
     * (Required)
     * 
     */
    @JsonProperty("PayloadVersion")
    public void setPayloadVersion(String payloadVersion) {
        this.payloadVersion = payloadVersion;
    }

    /**
     * The EventTime schema
     * <p>
     * The time when this notification was published, in ISO-8601 date/time format.
     * (Required)
     * 
     */
    @JsonProperty("EventTime")
    public String getEventTime() {
        return eventTime;
    }

    /**
     * The EventTime schema
     * <p>
     * The time when this notification was published, in ISO-8601 date/time format.
     * (Required)
     * 
     */
    @JsonProperty("EventTime")
    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * The Payload schema
     * <p>
     * The payload for the ORDER_CHANGE notification.
     * (Required)
     * 
     */
    @JsonProperty("Payload")
    public Payload getPayload() {
        return payload;
    }

    /**
     * The Payload schema
     * <p>
     * The payload for the ORDER_CHANGE notification.
     * (Required)
     * 
     */
    @JsonProperty("Payload")
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    /**
     * The NotificationMetadata schema
     * <p>
     * The notification metadata.
     * (Required)
     * 
     */
    @JsonProperty("NotificationMetadata")
    public NotificationMetadata getNotificationMetadata() {
        return notificationMetadata;
    }

    /**
     * The NotificationMetadata schema
     * <p>
     * The notification metadata.
     * (Required)
     * 
     */
    @JsonProperty("NotificationMetadata")
    public void setNotificationMetadata(NotificationMetadata notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrderChangeNotification.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("notificationVersion");
        sb.append('=');
        sb.append(((this.notificationVersion == null)?"<null>":this.notificationVersion));
        sb.append(',');
        sb.append("notificationType");
        sb.append('=');
        sb.append(((this.notificationType == null)?"<null>":this.notificationType));
        sb.append(',');
        sb.append("payloadVersion");
        sb.append('=');
        sb.append(((this.payloadVersion == null)?"<null>":this.payloadVersion));
        sb.append(',');
        sb.append("eventTime");
        sb.append('=');
        sb.append(((this.eventTime == null)?"<null>":this.eventTime));
        sb.append(',');
        sb.append("payload");
        sb.append('=');
        sb.append(((this.payload == null)?"<null>":this.payload));
        sb.append(',');
        sb.append("notificationMetadata");
        sb.append('=');
        sb.append(((this.notificationMetadata == null)?"<null>":this.notificationMetadata));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.notificationVersion == null)? 0 :this.notificationVersion.hashCode()));
        result = ((result* 31)+((this.payloadVersion == null)? 0 :this.payloadVersion.hashCode()));
        result = ((result* 31)+((this.payload == null)? 0 :this.payload.hashCode()));
        result = ((result* 31)+((this.notificationMetadata == null)? 0 :this.notificationMetadata.hashCode()));
        result = ((result* 31)+((this.eventTime == null)? 0 :this.eventTime.hashCode()));
        result = ((result* 31)+((this.notificationType == null)? 0 :this.notificationType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrderChangeNotification) == false) {
            return false;
        }
        OrderChangeNotification rhs = ((OrderChangeNotification) other);
        return ((((((((this.notificationVersion == rhs.notificationVersion)||((this.notificationVersion!= null)&&this.notificationVersion.equals(rhs.notificationVersion)))&&((this.payloadVersion == rhs.payloadVersion)||((this.payloadVersion!= null)&&this.payloadVersion.equals(rhs.payloadVersion))))&&((this.payload == rhs.payload)||((this.payload!= null)&&this.payload.equals(rhs.payload))))&&((this.notificationMetadata == rhs.notificationMetadata)||((this.notificationMetadata!= null)&&this.notificationMetadata.equals(rhs.notificationMetadata))))&&((this.eventTime == rhs.eventTime)||((this.eventTime!= null)&&this.eventTime.equals(rhs.eventTime))))&&((this.notificationType == rhs.notificationType)||((this.notificationType!= null)&&this.notificationType.equals(rhs.notificationType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
