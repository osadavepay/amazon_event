
package com.example.models;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * The OrderChangeNotification schema
 * <p>
 * An explanation about the ORDER_CHANGE notification.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NotificationLevel",
    "SellerId",
    "AmazonOrderId",
    "OrderChangeType",
    "OrderChangeTrigger",
    "Summary"
})
@Generated("jsonschema2pojo")
public class OrderChangeNotification__1 {

    /**
     * The NotificationLevel schema
     * <p>
     * The notification level of current notification.
     * (Required)
     * 
     */
    @JsonProperty("NotificationLevel")
    @JsonPropertyDescription("The notification level of current notification.")
    private OrderChangeNotification__1 .NotificationLevel notificationLevel;
    /**
     * The SellerId schema
     * <p>
     * The selling partner identifier.
     * (Required)
     * 
     */
    @JsonProperty("SellerId")
    @JsonPropertyDescription("The selling partner identifier.")
    private String sellerId;
    /**
     * The AmazonOrderId schema
     * <p>
     * The Amazon order identifier, in 3-7-7 format.
     * (Required)
     * 
     */
    @JsonProperty("AmazonOrderId")
    @JsonPropertyDescription("The Amazon order identifier, in 3-7-7 format.")
    private String amazonOrderId;
    /**
     * The OrderChangeType schema
     * <p>
     * The type of order change that caused the notification to be sent. Possible values are BuyerRequestedChange and OrderStatusChange.
     * (Required)
     * 
     */
    @JsonProperty("OrderChangeType")
    @JsonPropertyDescription("The type of order change that caused the notification to be sent. Possible values are BuyerRequestedChange and OrderStatusChange.")
    private OrderChangeNotification__1 .OrderChangeType orderChangeType;
    /**
     * The OrderChangeTrigger schema
     * <p>
     * Details about what caused this ORDER_CHANGE notification to be sent.
     * (Required)
     * 
     */
    @JsonProperty("OrderChangeTrigger")
    @JsonPropertyDescription("Details about what caused this ORDER_CHANGE notification to be sent.")
    private OrderChangeTrigger orderChangeTrigger;
    /**
     * The Summary schema
     * <p>
     * Information about the order and order items that had the change.
     * (Required)
     * 
     */
    @JsonProperty("Summary")
    @JsonPropertyDescription("Information about the order and order items that had the change.")
    private Summary summary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The NotificationLevel schema
     * <p>
     * The notification level of current notification.
     * (Required)
     * 
     */
    @JsonProperty("NotificationLevel")
    public OrderChangeNotification__1 .NotificationLevel getNotificationLevel() {
        return notificationLevel;
    }

    /**
     * The NotificationLevel schema
     * <p>
     * The notification level of current notification.
     * (Required)
     * 
     */
    @JsonProperty("NotificationLevel")
    public void setNotificationLevel(OrderChangeNotification__1 .NotificationLevel notificationLevel) {
        this.notificationLevel = notificationLevel;
    }

    /**
     * The SellerId schema
     * <p>
     * The selling partner identifier.
     * (Required)
     * 
     */
    @JsonProperty("SellerId")
    public String getSellerId() {
        return sellerId;
    }

    /**
     * The SellerId schema
     * <p>
     * The selling partner identifier.
     * (Required)
     * 
     */
    @JsonProperty("SellerId")
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * The AmazonOrderId schema
     * <p>
     * The Amazon order identifier, in 3-7-7 format.
     * (Required)
     * 
     */
    @JsonProperty("AmazonOrderId")
    public String getAmazonOrderId() {
        return amazonOrderId;
    }

    /**
     * The AmazonOrderId schema
     * <p>
     * The Amazon order identifier, in 3-7-7 format.
     * (Required)
     * 
     */
    @JsonProperty("AmazonOrderId")
    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }

    /**
     * The OrderChangeType schema
     * <p>
     * The type of order change that caused the notification to be sent. Possible values are BuyerRequestedChange and OrderStatusChange.
     * (Required)
     * 
     */
    @JsonProperty("OrderChangeType")
    public OrderChangeNotification__1 .OrderChangeType getOrderChangeType() {
        return orderChangeType;
    }

    /**
     * The OrderChangeType schema
     * <p>
     * The type of order change that caused the notification to be sent. Possible values are BuyerRequestedChange and OrderStatusChange.
     * (Required)
     * 
     */
    @JsonProperty("OrderChangeType")
    public void setOrderChangeType(OrderChangeNotification__1 .OrderChangeType orderChangeType) {
        this.orderChangeType = orderChangeType;
    }

    /**
     * The OrderChangeTrigger schema
     * <p>
     * Details about what caused this ORDER_CHANGE notification to be sent.
     * (Required)
     * 
     */
    @JsonProperty("OrderChangeTrigger")
    public OrderChangeTrigger getOrderChangeTrigger() {
        return orderChangeTrigger;
    }

    /**
     * The OrderChangeTrigger schema
     * <p>
     * Details about what caused this ORDER_CHANGE notification to be sent.
     * (Required)
     * 
     */
    @JsonProperty("OrderChangeTrigger")
    public void setOrderChangeTrigger(OrderChangeTrigger orderChangeTrigger) {
        this.orderChangeTrigger = orderChangeTrigger;
    }

    /**
     * The Summary schema
     * <p>
     * Information about the order and order items that had the change.
     * (Required)
     * 
     */
    @JsonProperty("Summary")
    public Summary getSummary() {
        return summary;
    }

    /**
     * The Summary schema
     * <p>
     * Information about the order and order items that had the change.
     * (Required)
     * 
     */
    @JsonProperty("Summary")
    public void setSummary(Summary summary) {
        this.summary = summary;
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
        sb.append(OrderChangeNotification__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("notificationLevel");
        sb.append('=');
        sb.append(((this.notificationLevel == null)?"<null>":this.notificationLevel));
        sb.append(',');
        sb.append("sellerId");
        sb.append('=');
        sb.append(((this.sellerId == null)?"<null>":this.sellerId));
        sb.append(',');
        sb.append("amazonOrderId");
        sb.append('=');
        sb.append(((this.amazonOrderId == null)?"<null>":this.amazonOrderId));
        sb.append(',');
        sb.append("orderChangeType");
        sb.append('=');
        sb.append(((this.orderChangeType == null)?"<null>":this.orderChangeType));
        sb.append(',');
        sb.append("orderChangeTrigger");
        sb.append('=');
        sb.append(((this.orderChangeTrigger == null)?"<null>":this.orderChangeTrigger));
        sb.append(',');
        sb.append("summary");
        sb.append('=');
        sb.append(((this.summary == null)?"<null>":this.summary));
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
        result = ((result* 31)+((this.summary == null)? 0 :this.summary.hashCode()));
        result = ((result* 31)+((this.notificationLevel == null)? 0 :this.notificationLevel.hashCode()));
        result = ((result* 31)+((this.sellerId == null)? 0 :this.sellerId.hashCode()));
        result = ((result* 31)+((this.amazonOrderId == null)? 0 :this.amazonOrderId.hashCode()));
        result = ((result* 31)+((this.orderChangeTrigger == null)? 0 :this.orderChangeTrigger.hashCode()));
        result = ((result* 31)+((this.orderChangeType == null)? 0 :this.orderChangeType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrderChangeNotification__1) == false) {
            return false;
        }
        OrderChangeNotification__1 rhs = ((OrderChangeNotification__1) other);
        return ((((((((this.summary == rhs.summary)||((this.summary!= null)&&this.summary.equals(rhs.summary)))&&((this.notificationLevel == rhs.notificationLevel)||((this.notificationLevel!= null)&&this.notificationLevel.equals(rhs.notificationLevel))))&&((this.sellerId == rhs.sellerId)||((this.sellerId!= null)&&this.sellerId.equals(rhs.sellerId))))&&((this.amazonOrderId == rhs.amazonOrderId)||((this.amazonOrderId!= null)&&this.amazonOrderId.equals(rhs.amazonOrderId))))&&((this.orderChangeTrigger == rhs.orderChangeTrigger)||((this.orderChangeTrigger!= null)&&this.orderChangeTrigger.equals(rhs.orderChangeTrigger))))&&((this.orderChangeType == rhs.orderChangeType)||((this.orderChangeType!= null)&&this.orderChangeType.equals(rhs.orderChangeType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }


    /**
     * The NotificationLevel schema
     * <p>
     * The notification level of current notification.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum NotificationLevel {

        ORDER_ITEM_LEVEL("OrderItemLevel"),
        ORDER_LEVEL("OrderLevel");
        private final String value;
        private final static Map<String, OrderChangeNotification__1 .NotificationLevel> CONSTANTS = new HashMap<String, OrderChangeNotification__1 .NotificationLevel>();

        static {
            for (OrderChangeNotification__1 .NotificationLevel c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        NotificationLevel(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static OrderChangeNotification__1 .NotificationLevel fromValue(String value) {
            OrderChangeNotification__1 .NotificationLevel constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The OrderChangeType schema
     * <p>
     * The type of order change that caused the notification to be sent. Possible values are BuyerRequestedChange and OrderStatusChange.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum OrderChangeType {

        BUYER_REQUESTED_CHANGE("BuyerRequestedChange"),
        ORDER_STATUS_CHANGE("OrderStatusChange");
        private final String value;
        private final static Map<String, OrderChangeNotification__1 .OrderChangeType> CONSTANTS = new HashMap<String, OrderChangeNotification__1 .OrderChangeType>();

        static {
            for (OrderChangeNotification__1 .OrderChangeType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        OrderChangeType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static OrderChangeNotification__1 .OrderChangeType fromValue(String value) {
            OrderChangeNotification__1 .OrderChangeType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
