
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
 * The OrderChangeTrigger schema
 * <p>
 * Details about what caused this ORDER_CHANGE notification to be sent.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TimeOfOrderChange",
    "ChangeReason"
})
@Generated("jsonschema2pojo")
public class OrderChangeTrigger {

    /**
     * The TimeOfOrderChange schema
     * <p>
     * The time of the change that caused this notification, in ISO-8601 date/time format. Will be null when there is no related timestamp.
     * (Required)
     * 
     */
    @JsonProperty("TimeOfOrderChange")
    @JsonPropertyDescription("The time of the change that caused this notification, in ISO-8601 date/time format. Will be null when there is no related timestamp.")
    private String timeOfOrderChange;
    /**
     * The ChangeReason schema
     * <p>
     * The reason this ORDER_CHANGE notification was sent.
     * (Required)
     * 
     */
    @JsonProperty("ChangeReason")
    @JsonPropertyDescription("The reason this ORDER_CHANGE notification was sent.")
    private String changeReason;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The TimeOfOrderChange schema
     * <p>
     * The time of the change that caused this notification, in ISO-8601 date/time format. Will be null when there is no related timestamp.
     * (Required)
     * 
     */
    @JsonProperty("TimeOfOrderChange")
    public String getTimeOfOrderChange() {
        return timeOfOrderChange;
    }

    /**
     * The TimeOfOrderChange schema
     * <p>
     * The time of the change that caused this notification, in ISO-8601 date/time format. Will be null when there is no related timestamp.
     * (Required)
     * 
     */
    @JsonProperty("TimeOfOrderChange")
    public void setTimeOfOrderChange(String timeOfOrderChange) {
        this.timeOfOrderChange = timeOfOrderChange;
    }

    /**
     * The ChangeReason schema
     * <p>
     * The reason this ORDER_CHANGE notification was sent.
     * (Required)
     * 
     */
    @JsonProperty("ChangeReason")
    public String getChangeReason() {
        return changeReason;
    }

    /**
     * The ChangeReason schema
     * <p>
     * The reason this ORDER_CHANGE notification was sent.
     * (Required)
     * 
     */
    @JsonProperty("ChangeReason")
    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
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
        sb.append(OrderChangeTrigger.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timeOfOrderChange");
        sb.append('=');
        sb.append(((this.timeOfOrderChange == null)?"<null>":this.timeOfOrderChange));
        sb.append(',');
        sb.append("changeReason");
        sb.append('=');
        sb.append(((this.changeReason == null)?"<null>":this.changeReason));
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
        result = ((result* 31)+((this.changeReason == null)? 0 :this.changeReason.hashCode()));
        result = ((result* 31)+((this.timeOfOrderChange == null)? 0 :this.timeOfOrderChange.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrderChangeTrigger) == false) {
            return false;
        }
        OrderChangeTrigger rhs = ((OrderChangeTrigger) other);
        return ((((this.changeReason == rhs.changeReason)||((this.changeReason!= null)&&this.changeReason.equals(rhs.changeReason)))&&((this.timeOfOrderChange == rhs.timeOfOrderChange)||((this.timeOfOrderChange!= null)&&this.timeOfOrderChange.equals(rhs.timeOfOrderChange))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
