
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
 * The NotificationMetadata schema
 * <p>
 * The notification metadata.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ApplicationId",
    "SubscriptionId",
    "PublishTime",
    "NotificationId"
})
@Generated("jsonschema2pojo")
public class NotificationMetadata {

    /**
     * The ApplicationId schema
     * <p>
     * The identifier for the application that uses the notifications.
     * (Required)
     * 
     */
    @JsonProperty("ApplicationId")
    @JsonPropertyDescription("The identifier for the application that uses the notifications.")
    private String applicationId;
    /**
     * The SubscriptionId schema
     * <p>
     * A unique identifier for the subscription which resulted in this notification.
     * (Required)
     * 
     */
    @JsonProperty("SubscriptionId")
    @JsonPropertyDescription("A unique identifier for the subscription which resulted in this notification.")
    private String subscriptionId;
    /**
     * The PublishTime schema
     * <p>
     * The date and time (in UTC) that the notification was sent, in ISO-8601 date/time format.
     * (Required)
     * 
     */
    @JsonProperty("PublishTime")
    @JsonPropertyDescription("The date and time (in UTC) that the notification was sent, in ISO-8601 date/time format.")
    private String publishTime;
    /**
     * The NotificationId schema
     * <p>
     * A unique identifier for this notification instance.
     * (Required)
     * 
     */
    @JsonProperty("NotificationId")
    @JsonPropertyDescription("A unique identifier for this notification instance.")
    private String notificationId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The ApplicationId schema
     * <p>
     * The identifier for the application that uses the notifications.
     * (Required)
     * 
     */
    @JsonProperty("ApplicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * The ApplicationId schema
     * <p>
     * The identifier for the application that uses the notifications.
     * (Required)
     * 
     */
    @JsonProperty("ApplicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The SubscriptionId schema
     * <p>
     * A unique identifier for the subscription which resulted in this notification.
     * (Required)
     * 
     */
    @JsonProperty("SubscriptionId")
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * The SubscriptionId schema
     * <p>
     * A unique identifier for the subscription which resulted in this notification.
     * (Required)
     * 
     */
    @JsonProperty("SubscriptionId")
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * The PublishTime schema
     * <p>
     * The date and time (in UTC) that the notification was sent, in ISO-8601 date/time format.
     * (Required)
     * 
     */
    @JsonProperty("PublishTime")
    public String getPublishTime() {
        return publishTime;
    }

    /**
     * The PublishTime schema
     * <p>
     * The date and time (in UTC) that the notification was sent, in ISO-8601 date/time format.
     * (Required)
     * 
     */
    @JsonProperty("PublishTime")
    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * The NotificationId schema
     * <p>
     * A unique identifier for this notification instance.
     * (Required)
     * 
     */
    @JsonProperty("NotificationId")
    public String getNotificationId() {
        return notificationId;
    }

    /**
     * The NotificationId schema
     * <p>
     * A unique identifier for this notification instance.
     * (Required)
     * 
     */
    @JsonProperty("NotificationId")
    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
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
        sb.append(NotificationMetadata.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("applicationId");
        sb.append('=');
        sb.append(((this.applicationId == null)?"<null>":this.applicationId));
        sb.append(',');
        sb.append("subscriptionId");
        sb.append('=');
        sb.append(((this.subscriptionId == null)?"<null>":this.subscriptionId));
        sb.append(',');
        sb.append("publishTime");
        sb.append('=');
        sb.append(((this.publishTime == null)?"<null>":this.publishTime));
        sb.append(',');
        sb.append("notificationId");
        sb.append('=');
        sb.append(((this.notificationId == null)?"<null>":this.notificationId));
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
        result = ((result* 31)+((this.publishTime == null)? 0 :this.publishTime.hashCode()));
        result = ((result* 31)+((this.notificationId == null)? 0 :this.notificationId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.applicationId == null)? 0 :this.applicationId.hashCode()));
        result = ((result* 31)+((this.subscriptionId == null)? 0 :this.subscriptionId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NotificationMetadata) == false) {
            return false;
        }
        NotificationMetadata rhs = ((NotificationMetadata) other);
        return ((((((this.publishTime == rhs.publishTime)||((this.publishTime!= null)&&this.publishTime.equals(rhs.publishTime)))&&((this.notificationId == rhs.notificationId)||((this.notificationId!= null)&&this.notificationId.equals(rhs.notificationId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.applicationId == rhs.applicationId)||((this.applicationId!= null)&&this.applicationId.equals(rhs.applicationId))))&&((this.subscriptionId == rhs.subscriptionId)||((this.subscriptionId!= null)&&this.subscriptionId.equals(rhs.subscriptionId))));
    }

}
