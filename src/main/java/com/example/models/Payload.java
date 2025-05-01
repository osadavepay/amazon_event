
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
 * The Payload schema
 * <p>
 * The payload for the ORDER_CHANGE notification.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OrderChangeNotification"
})
@Generated("jsonschema2pojo")
public class Payload {

    /**
     * The OrderChangeNotification schema
     * <p>
     * An explanation about the ORDER_CHANGE notification.
     * (Required)
     * 
     */
    @JsonProperty("OrderChangeNotification")
    @JsonPropertyDescription("An explanation about the ORDER_CHANGE notification.")
    private OrderChangeNotification__1 orderChangeNotification;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The OrderChangeNotification schema
     * <p>
     * An explanation about the ORDER_CHANGE notification.
     * (Required)
     * 
     */
    @JsonProperty("OrderChangeNotification")
    public OrderChangeNotification__1 getOrderChangeNotification() {
        return orderChangeNotification;
    }

    /**
     * The OrderChangeNotification schema
     * <p>
     * An explanation about the ORDER_CHANGE notification.
     * (Required)
     * 
     */
    @JsonProperty("OrderChangeNotification")
    public void setOrderChangeNotification(OrderChangeNotification__1 orderChangeNotification) {
        this.orderChangeNotification = orderChangeNotification;
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
        sb.append(Payload.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("orderChangeNotification");
        sb.append('=');
        sb.append(((this.orderChangeNotification == null)?"<null>":this.orderChangeNotification));
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
        result = ((result* 31)+((this.orderChangeNotification == null)? 0 :this.orderChangeNotification.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Payload) == false) {
            return false;
        }
        Payload rhs = ((Payload) other);
        return (((this.orderChangeNotification == rhs.orderChangeNotification)||((this.orderChangeNotification!= null)&&this.orderChangeNotification.equals(rhs.orderChangeNotification)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
