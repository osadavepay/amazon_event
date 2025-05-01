
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
 * The OrderItem schema
 * <p>
 * Information about every order item.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OrderItemId",
    "SellerSKU",
    "SupplySourceId",
    "OrderItemStatus",
    "Quantity",
    "QuantityShipped",
    "IsBuyerRequestedCancel",
    "ItemEarliestDeliveryDate",
    "ItemLatestDeliveryDate"
})
@Generated("jsonschema2pojo")
public class OrderItem {

    /**
     * The OrderItemId schema
     * <p>
     * The Amazon-defined order item identifier.
     * (Required)
     * 
     */
    @JsonProperty("OrderItemId")
    @JsonPropertyDescription("The Amazon-defined order item identifier.")
    private String orderItemId;
    /**
     * The SellerSKU schema
     * <p>
     * The seller-specific SKU for an item.
     * (Required)
     * 
     */
    @JsonProperty("SellerSKU")
    @JsonPropertyDescription("The seller-specific SKU for an item.")
    private String sellerSKU;
    /**
     * The SupplySourceId schema
     * <p>
     * The unique identifier of the supply source. Will be null when there is no related information.
     * (Required)
     * 
     */
    @JsonProperty("SupplySourceId")
    @JsonPropertyDescription("The unique identifier of the supply source. Will be null when there is no related information.")
    private String supplySourceId;
    /**
     * The OrderItemStatus schema
     * <p>
     * The current status of the order item. This field Will have a non-null value when items' statuses are different.
     * 
     */
    @JsonProperty("OrderItemStatus")
    @JsonPropertyDescription("The current status of the order item. This field Will have a non-null value when items' statuses are different.")
    private OrderItem.OrderItemStatus orderItemStatus;
    /**
     * The Quantity schema
     * <p>
     * The number of items in the order.
     * (Required)
     * 
     */
    @JsonProperty("Quantity")
    @JsonPropertyDescription("The number of items in the order.")
    private int quantity;
    /**
     * The QuantityShipped schema
     * <p>
     * The number of items shipped.
     * 
     */
    @JsonProperty("QuantityShipped")
    @JsonPropertyDescription("The number of items shipped.")
    private int quantityShipped;
    /**
     * The IsBuyerRequestedCancel schema
     * <p>
     * True when the buyer has requested cancelation.
     * 
     */
    @JsonProperty("IsBuyerRequestedCancel")
    @JsonPropertyDescription("True when the buyer has requested cancelation.")
    private boolean isBuyerRequestedCancel;
    /**
     * The ItemEarliestDeliveryDate schema
     * <p>
     * The start of the time period during which you have committed to fulfill the order.
     * 
     */
    @JsonProperty("ItemEarliestDeliveryDate")
    @JsonPropertyDescription("The start of the time period during which you have committed to fulfill the order.")
    private String itemEarliestDeliveryDate;
    /**
     * The ItemLatestDeliveryDate schema
     * <p>
     * The end of the time period during which you have committed to fulfill the order.
     * 
     */
    @JsonProperty("ItemLatestDeliveryDate")
    @JsonPropertyDescription("The end of the time period during which you have committed to fulfill the order.")
    private String itemLatestDeliveryDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The OrderItemId schema
     * <p>
     * The Amazon-defined order item identifier.
     * (Required)
     * 
     */
    @JsonProperty("OrderItemId")
    public String getOrderItemId() {
        return orderItemId;
    }

    /**
     * The OrderItemId schema
     * <p>
     * The Amazon-defined order item identifier.
     * (Required)
     * 
     */
    @JsonProperty("OrderItemId")
    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * The SellerSKU schema
     * <p>
     * The seller-specific SKU for an item.
     * (Required)
     * 
     */
    @JsonProperty("SellerSKU")
    public String getSellerSKU() {
        return sellerSKU;
    }

    /**
     * The SellerSKU schema
     * <p>
     * The seller-specific SKU for an item.
     * (Required)
     * 
     */
    @JsonProperty("SellerSKU")
    public void setSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
    }

    /**
     * The SupplySourceId schema
     * <p>
     * The unique identifier of the supply source. Will be null when there is no related information.
     * (Required)
     * 
     */
    @JsonProperty("SupplySourceId")
    public String getSupplySourceId() {
        return supplySourceId;
    }

    /**
     * The SupplySourceId schema
     * <p>
     * The unique identifier of the supply source. Will be null when there is no related information.
     * (Required)
     * 
     */
    @JsonProperty("SupplySourceId")
    public void setSupplySourceId(String supplySourceId) {
        this.supplySourceId = supplySourceId;
    }

    /**
     * The OrderItemStatus schema
     * <p>
     * The current status of the order item. This field Will have a non-null value when items' statuses are different.
     * 
     */
    @JsonProperty("OrderItemStatus")
    public OrderItem.OrderItemStatus getOrderItemStatus() {
        return orderItemStatus;
    }

    /**
     * The OrderItemStatus schema
     * <p>
     * The current status of the order item. This field Will have a non-null value when items' statuses are different.
     * 
     */
    @JsonProperty("OrderItemStatus")
    public void setOrderItemStatus(OrderItem.OrderItemStatus orderItemStatus) {
        this.orderItemStatus = orderItemStatus;
    }

    /**
     * The Quantity schema
     * <p>
     * The number of items in the order.
     * (Required)
     * 
     */
    @JsonProperty("Quantity")
    public int getQuantity() {
        return quantity;
    }

    /**
     * The Quantity schema
     * <p>
     * The number of items in the order.
     * (Required)
     * 
     */
    @JsonProperty("Quantity")
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * The QuantityShipped schema
     * <p>
     * The number of items shipped.
     * 
     */
    @JsonProperty("QuantityShipped")
    public int getQuantityShipped() {
        return quantityShipped;
    }

    /**
     * The QuantityShipped schema
     * <p>
     * The number of items shipped.
     * 
     */
    @JsonProperty("QuantityShipped")
    public void setQuantityShipped(int quantityShipped) {
        this.quantityShipped = quantityShipped;
    }

    /**
     * The IsBuyerRequestedCancel schema
     * <p>
     * True when the buyer has requested cancelation.
     * 
     */
    @JsonProperty("IsBuyerRequestedCancel")
    public boolean isIsBuyerRequestedCancel() {
        return isBuyerRequestedCancel;
    }

    /**
     * The IsBuyerRequestedCancel schema
     * <p>
     * True when the buyer has requested cancelation.
     * 
     */
    @JsonProperty("IsBuyerRequestedCancel")
    public void setIsBuyerRequestedCancel(boolean isBuyerRequestedCancel) {
        this.isBuyerRequestedCancel = isBuyerRequestedCancel;
    }

    /**
     * The ItemEarliestDeliveryDate schema
     * <p>
     * The start of the time period during which you have committed to fulfill the order.
     * 
     */
    @JsonProperty("ItemEarliestDeliveryDate")
    public String getItemEarliestDeliveryDate() {
        return itemEarliestDeliveryDate;
    }

    /**
     * The ItemEarliestDeliveryDate schema
     * <p>
     * The start of the time period during which you have committed to fulfill the order.
     * 
     */
    @JsonProperty("ItemEarliestDeliveryDate")
    public void setItemEarliestDeliveryDate(String itemEarliestDeliveryDate) {
        this.itemEarliestDeliveryDate = itemEarliestDeliveryDate;
    }

    /**
     * The ItemLatestDeliveryDate schema
     * <p>
     * The end of the time period during which you have committed to fulfill the order.
     * 
     */
    @JsonProperty("ItemLatestDeliveryDate")
    public String getItemLatestDeliveryDate() {
        return itemLatestDeliveryDate;
    }

    /**
     * The ItemLatestDeliveryDate schema
     * <p>
     * The end of the time period during which you have committed to fulfill the order.
     * 
     */
    @JsonProperty("ItemLatestDeliveryDate")
    public void setItemLatestDeliveryDate(String itemLatestDeliveryDate) {
        this.itemLatestDeliveryDate = itemLatestDeliveryDate;
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
        sb.append(OrderItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("orderItemId");
        sb.append('=');
        sb.append(((this.orderItemId == null)?"<null>":this.orderItemId));
        sb.append(',');
        sb.append("sellerSKU");
        sb.append('=');
        sb.append(((this.sellerSKU == null)?"<null>":this.sellerSKU));
        sb.append(',');
        sb.append("supplySourceId");
        sb.append('=');
        sb.append(((this.supplySourceId == null)?"<null>":this.supplySourceId));
        sb.append(',');
        sb.append("orderItemStatus");
        sb.append('=');
        sb.append(((this.orderItemStatus == null)?"<null>":this.orderItemStatus));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(this.quantity);
        sb.append(',');
        sb.append("quantityShipped");
        sb.append('=');
        sb.append(this.quantityShipped);
        sb.append(',');
        sb.append("isBuyerRequestedCancel");
        sb.append('=');
        sb.append(this.isBuyerRequestedCancel);
        sb.append(',');
        sb.append("itemEarliestDeliveryDate");
        sb.append('=');
        sb.append(((this.itemEarliestDeliveryDate == null)?"<null>":this.itemEarliestDeliveryDate));
        sb.append(',');
        sb.append("itemLatestDeliveryDate");
        sb.append('=');
        sb.append(((this.itemLatestDeliveryDate == null)?"<null>":this.itemLatestDeliveryDate));
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
        result = ((result* 31)+((this.itemLatestDeliveryDate == null)? 0 :this.itemLatestDeliveryDate.hashCode()));
        result = ((result* 31)+ this.quantity);
        result = ((result* 31)+ this.quantityShipped);
        result = ((result* 31)+((this.orderItemStatus == null)? 0 :this.orderItemStatus.hashCode()));
        result = ((result* 31)+((this.itemEarliestDeliveryDate == null)? 0 :this.itemEarliestDeliveryDate.hashCode()));
        result = ((result* 31)+((this.orderItemId == null)? 0 :this.orderItemId.hashCode()));
        result = ((result* 31)+((this.supplySourceId == null)? 0 :this.supplySourceId.hashCode()));
        result = ((result* 31)+((this.sellerSKU == null)? 0 :this.sellerSKU.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+(this.isBuyerRequestedCancel? 1 : 0));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrderItem) == false) {
            return false;
        }
        OrderItem rhs = ((OrderItem) other);
        return (((((((((((this.itemLatestDeliveryDate == rhs.itemLatestDeliveryDate)||((this.itemLatestDeliveryDate!= null)&&this.itemLatestDeliveryDate.equals(rhs.itemLatestDeliveryDate)))&&(this.quantity == rhs.quantity))&&(this.quantityShipped == rhs.quantityShipped))&&((this.orderItemStatus == rhs.orderItemStatus)||((this.orderItemStatus!= null)&&this.orderItemStatus.equals(rhs.orderItemStatus))))&&((this.itemEarliestDeliveryDate == rhs.itemEarliestDeliveryDate)||((this.itemEarliestDeliveryDate!= null)&&this.itemEarliestDeliveryDate.equals(rhs.itemEarliestDeliveryDate))))&&((this.orderItemId == rhs.orderItemId)||((this.orderItemId!= null)&&this.orderItemId.equals(rhs.orderItemId))))&&((this.supplySourceId == rhs.supplySourceId)||((this.supplySourceId!= null)&&this.supplySourceId.equals(rhs.supplySourceId))))&&((this.sellerSKU == rhs.sellerSKU)||((this.sellerSKU!= null)&&this.sellerSKU.equals(rhs.sellerSKU))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&(this.isBuyerRequestedCancel == rhs.isBuyerRequestedCancel));
    }


    /**
     * The OrderItemStatus schema
     * <p>
     * The current status of the order item. This field Will have a non-null value when items' statuses are different.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum OrderItemStatus {

        UNSHIPPED("Unshipped"),
        SHIPPED("Shipped");
        private final String value;
        private final static Map<String, OrderItem.OrderItemStatus> CONSTANTS = new HashMap<String, OrderItem.OrderItemStatus>();

        static {
            for (OrderItem.OrderItemStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        OrderItemStatus(String value) {
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
        public static OrderItem.OrderItemStatus fromValue(String value) {
            OrderItem.OrderItemStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
