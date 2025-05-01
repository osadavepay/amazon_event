
package com.example.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * The Summary schema
 * <p>
 * Information about the order and order items that had the change.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MarketplaceId",
    "OrderStatus",
    "PurchaseDate",
    "DestinationPostalCode",
    "FulfillmentType",
    "OrderType",
    "NumberOfItemsShipped",
    "NumberOfItemsUnshipped",
    "EarliestDeliveryDate",
    "LatestDeliveryDate",
    "EarliestShipDate",
    "LatestShipDate",
    "CancelNotifyDate",
    "OrderPrograms",
    "ShippingPrograms",
    "EasyShipShipmentStatus",
    "ElectronicInvoiceStatus",
    "OrderItems"
})
@Generated("jsonschema2pojo")
public class Summary {

    /**
     * The MarketplaceId schema
     * <p>
     * The Amazon marketplace identifier of the order.
     * (Required)
     * 
     */
    @JsonProperty("MarketplaceId")
    @JsonPropertyDescription("The Amazon marketplace identifier of the order.")
    private String marketplaceId;
    /**
     * The OrderStatus schema
     * <p>
     * The current order status.
     * (Required)
     * 
     */
    @JsonProperty("OrderStatus")
    @JsonPropertyDescription("The current order status.")
    private Summary.OrderStatus orderStatus;
    /**
     * The PurchaseDate schema
     * <p>
     * The purchase date of the order, in ISO-8601 date/time format. It will be null when there is no related information.
     * (Required)
     * 
     */
    @JsonProperty("PurchaseDate")
    @JsonPropertyDescription("The purchase date of the order, in ISO-8601 date/time format. It will be null when there is no related information.")
    private String purchaseDate;
    /**
     * The DestinationPostalCode schema
     * <p>
     * The destination postal code. It will be null when there is no related information.
     * (Required)
     * 
     */
    @JsonProperty("DestinationPostalCode")
    @JsonPropertyDescription("The destination postal code. It will be null when there is no related information.")
    private String destinationPostalCode;
    /**
     * The FulfillmentType schema
     * <p>
     * Fulfillment type of the affected order, MFN or AFN.
     * (Required)
     * 
     */
    @JsonProperty("FulfillmentType")
    @JsonPropertyDescription("Fulfillment type of the affected order, MFN or AFN.")
    private Summary.FulfillmentType fulfillmentType;
    /**
     * The OrderType schema
     * <p>
     * The type of the order.
     * (Required)
     * 
     */
    @JsonProperty("OrderType")
    @JsonPropertyDescription("The type of the order.")
    private Summary.OrderType orderType;
    /**
     * The NumberOfItemsShipped schema
     * <p>
     * The number of items shipped.
     * 
     */
    @JsonProperty("NumberOfItemsShipped")
    @JsonPropertyDescription("The number of items shipped.")
    private int numberOfItemsShipped;
    /**
     * The NumberOfItemsUnshipped schema
     * <p>
     * The number of items unshipped.
     * 
     */
    @JsonProperty("NumberOfItemsUnshipped")
    @JsonPropertyDescription("The number of items unshipped.")
    private int numberOfItemsUnshipped;
    /**
     * The EarliestDeliveryDate schema
     * <p>
     * The start of the time period during which you committed to fulfill the order, in ISO-8601 date/time format. Returned only for seller-fulfilled orders.
     * 
     */
    @JsonProperty("EarliestDeliveryDate")
    @JsonPropertyDescription("The start of the time period during which you committed to fulfill the order, in ISO-8601 date/time format. Returned only for seller-fulfilled orders.")
    private String earliestDeliveryDate;
    /**
     * The LatestDeliveryDate schema
     * <p>
     * The end of the time period during which you committed to fulfill the order, in ISO-8601 date/time format. Returned only for seller-fulfilled orders that do not have a PendingAvailability, Pending, or Canceled status.
     * 
     */
    @JsonProperty("LatestDeliveryDate")
    @JsonPropertyDescription("The end of the time period during which you committed to fulfill the order, in ISO-8601 date/time format. Returned only for seller-fulfilled orders that do not have a PendingAvailability, Pending, or Canceled status.")
    private String latestDeliveryDate;
    /**
     * The EarliestShipDate schema
     * <p>
     * The start of the time period during which you committed to ship the order, in ISO-8601 date/time format.
     * 
     */
    @JsonProperty("EarliestShipDate")
    @JsonPropertyDescription("The start of the time period during which you committed to ship the order, in ISO-8601 date/time format.")
    private String earliestShipDate;
    /**
     * The LatestShipDate schema
     * <p>
     * The end of the time period during which you committed to ship the order, in ISO-8601 date/time format.
     * 
     */
    @JsonProperty("LatestShipDate")
    @JsonPropertyDescription("The end of the time period during which you committed to ship the order, in ISO-8601 date/time format.")
    private String latestShipDate;
    /**
     * The CancelNotifyDate schema
     * <p>
     * The end of the time period during which you must notify the seller of possible cancellation, in ISO-8601 date/time format.
     * 
     */
    @JsonProperty("CancelNotifyDate")
    @JsonPropertyDescription("The end of the time period during which you must notify the seller of possible cancellation, in ISO-8601 date/time format.")
    private String cancelNotifyDate;
    /**
     * The OrderPrograms schema
     * <p>
     * The order programs in which this order participates.
     * 
     */
    @JsonProperty("OrderPrograms")
    @JsonPropertyDescription("The order programs in which this order participates.")
    private List<OrderProgram> orderPrograms = new ArrayList<OrderProgram>();
    /**
     * The ShippingPrograms schema
     * <p>
     * The shipping programs in which this order participates.
     * 
     */
    @JsonProperty("ShippingPrograms")
    @JsonPropertyDescription("The shipping programs in which this order participates.")
    private List<ShippingProgram> shippingPrograms = new ArrayList<ShippingProgram>();
    /**
     * The EasyShipShipmentStatus schema
     * <p>
     * The status of the Amazon Easy Ship order. This property is included only for Amazon Easy Ship orders.
     * 
     */
    @JsonProperty("EasyShipShipmentStatus")
    @JsonPropertyDescription("The status of the Amazon Easy Ship order. This property is included only for Amazon Easy Ship orders.")
    private Summary.EasyShipShipmentStatus easyShipShipmentStatus;
    /**
     * The ElectronicInvoiceStatus schema
     * <p>
     * The status of the electronic invoice.
     * 
     */
    @JsonProperty("ElectronicInvoiceStatus")
    @JsonPropertyDescription("The status of the electronic invoice.")
    private Summary.ElectronicInvoiceStatus electronicInvoiceStatus;
    /**
     * The OrderItems schema
     * <p>
     * Information about order items included in this order. For OrderItemLevel notifications, one payload includes one item, while for OrderLevel notifications, one payload includes all items.
     * (Required)
     * 
     */
    @JsonProperty("OrderItems")
    @JsonPropertyDescription("Information about order items included in this order. For OrderItemLevel notifications, one payload includes one item, while for OrderLevel notifications, one payload includes all items.")
    private List<OrderItem> orderItems = new ArrayList<OrderItem>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The MarketplaceId schema
     * <p>
     * The Amazon marketplace identifier of the order.
     * (Required)
     * 
     */
    @JsonProperty("MarketplaceId")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    /**
     * The MarketplaceId schema
     * <p>
     * The Amazon marketplace identifier of the order.
     * (Required)
     * 
     */
    @JsonProperty("MarketplaceId")
    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    /**
     * The OrderStatus schema
     * <p>
     * The current order status.
     * (Required)
     * 
     */
    @JsonProperty("OrderStatus")
    public Summary.OrderStatus getOrderStatus() {
        return orderStatus;
    }

    /**
     * The OrderStatus schema
     * <p>
     * The current order status.
     * (Required)
     * 
     */
    @JsonProperty("OrderStatus")
    public void setOrderStatus(Summary.OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * The PurchaseDate schema
     * <p>
     * The purchase date of the order, in ISO-8601 date/time format. It will be null when there is no related information.
     * (Required)
     * 
     */
    @JsonProperty("PurchaseDate")
    public String getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * The PurchaseDate schema
     * <p>
     * The purchase date of the order, in ISO-8601 date/time format. It will be null when there is no related information.
     * (Required)
     * 
     */
    @JsonProperty("PurchaseDate")
    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    /**
     * The DestinationPostalCode schema
     * <p>
     * The destination postal code. It will be null when there is no related information.
     * (Required)
     * 
     */
    @JsonProperty("DestinationPostalCode")
    public String getDestinationPostalCode() {
        return destinationPostalCode;
    }

    /**
     * The DestinationPostalCode schema
     * <p>
     * The destination postal code. It will be null when there is no related information.
     * (Required)
     * 
     */
    @JsonProperty("DestinationPostalCode")
    public void setDestinationPostalCode(String destinationPostalCode) {
        this.destinationPostalCode = destinationPostalCode;
    }

    /**
     * The FulfillmentType schema
     * <p>
     * Fulfillment type of the affected order, MFN or AFN.
     * (Required)
     * 
     */
    @JsonProperty("FulfillmentType")
    public Summary.FulfillmentType getFulfillmentType() {
        return fulfillmentType;
    }

    /**
     * The FulfillmentType schema
     * <p>
     * Fulfillment type of the affected order, MFN or AFN.
     * (Required)
     * 
     */
    @JsonProperty("FulfillmentType")
    public void setFulfillmentType(Summary.FulfillmentType fulfillmentType) {
        this.fulfillmentType = fulfillmentType;
    }

    /**
     * The OrderType schema
     * <p>
     * The type of the order.
     * (Required)
     * 
     */
    @JsonProperty("OrderType")
    public Summary.OrderType getOrderType() {
        return orderType;
    }

    /**
     * The OrderType schema
     * <p>
     * The type of the order.
     * (Required)
     * 
     */
    @JsonProperty("OrderType")
    public void setOrderType(Summary.OrderType orderType) {
        this.orderType = orderType;
    }

    /**
     * The NumberOfItemsShipped schema
     * <p>
     * The number of items shipped.
     * 
     */
    @JsonProperty("NumberOfItemsShipped")
    public int getNumberOfItemsShipped() {
        return numberOfItemsShipped;
    }

    /**
     * The NumberOfItemsShipped schema
     * <p>
     * The number of items shipped.
     * 
     */
    @JsonProperty("NumberOfItemsShipped")
    public void setNumberOfItemsShipped(int numberOfItemsShipped) {
        this.numberOfItemsShipped = numberOfItemsShipped;
    }

    /**
     * The NumberOfItemsUnshipped schema
     * <p>
     * The number of items unshipped.
     * 
     */
    @JsonProperty("NumberOfItemsUnshipped")
    public int getNumberOfItemsUnshipped() {
        return numberOfItemsUnshipped;
    }

    /**
     * The NumberOfItemsUnshipped schema
     * <p>
     * The number of items unshipped.
     * 
     */
    @JsonProperty("NumberOfItemsUnshipped")
    public void setNumberOfItemsUnshipped(int numberOfItemsUnshipped) {
        this.numberOfItemsUnshipped = numberOfItemsUnshipped;
    }

    /**
     * The EarliestDeliveryDate schema
     * <p>
     * The start of the time period during which you committed to fulfill the order, in ISO-8601 date/time format. Returned only for seller-fulfilled orders.
     * 
     */
    @JsonProperty("EarliestDeliveryDate")
    public String getEarliestDeliveryDate() {
        return earliestDeliveryDate;
    }

    /**
     * The EarliestDeliveryDate schema
     * <p>
     * The start of the time period during which you committed to fulfill the order, in ISO-8601 date/time format. Returned only for seller-fulfilled orders.
     * 
     */
    @JsonProperty("EarliestDeliveryDate")
    public void setEarliestDeliveryDate(String earliestDeliveryDate) {
        this.earliestDeliveryDate = earliestDeliveryDate;
    }

    /**
     * The LatestDeliveryDate schema
     * <p>
     * The end of the time period during which you committed to fulfill the order, in ISO-8601 date/time format. Returned only for seller-fulfilled orders that do not have a PendingAvailability, Pending, or Canceled status.
     * 
     */
    @JsonProperty("LatestDeliveryDate")
    public String getLatestDeliveryDate() {
        return latestDeliveryDate;
    }

    /**
     * The LatestDeliveryDate schema
     * <p>
     * The end of the time period during which you committed to fulfill the order, in ISO-8601 date/time format. Returned only for seller-fulfilled orders that do not have a PendingAvailability, Pending, or Canceled status.
     * 
     */
    @JsonProperty("LatestDeliveryDate")
    public void setLatestDeliveryDate(String latestDeliveryDate) {
        this.latestDeliveryDate = latestDeliveryDate;
    }

    /**
     * The EarliestShipDate schema
     * <p>
     * The start of the time period during which you committed to ship the order, in ISO-8601 date/time format.
     * 
     */
    @JsonProperty("EarliestShipDate")
    public String getEarliestShipDate() {
        return earliestShipDate;
    }

    /**
     * The EarliestShipDate schema
     * <p>
     * The start of the time period during which you committed to ship the order, in ISO-8601 date/time format.
     * 
     */
    @JsonProperty("EarliestShipDate")
    public void setEarliestShipDate(String earliestShipDate) {
        this.earliestShipDate = earliestShipDate;
    }

    /**
     * The LatestShipDate schema
     * <p>
     * The end of the time period during which you committed to ship the order, in ISO-8601 date/time format.
     * 
     */
    @JsonProperty("LatestShipDate")
    public String getLatestShipDate() {
        return latestShipDate;
    }

    /**
     * The LatestShipDate schema
     * <p>
     * The end of the time period during which you committed to ship the order, in ISO-8601 date/time format.
     * 
     */
    @JsonProperty("LatestShipDate")
    public void setLatestShipDate(String latestShipDate) {
        this.latestShipDate = latestShipDate;
    }

    /**
     * The CancelNotifyDate schema
     * <p>
     * The end of the time period during which you must notify the seller of possible cancellation, in ISO-8601 date/time format.
     * 
     */
    @JsonProperty("CancelNotifyDate")
    public String getCancelNotifyDate() {
        return cancelNotifyDate;
    }

    /**
     * The CancelNotifyDate schema
     * <p>
     * The end of the time period during which you must notify the seller of possible cancellation, in ISO-8601 date/time format.
     * 
     */
    @JsonProperty("CancelNotifyDate")
    public void setCancelNotifyDate(String cancelNotifyDate) {
        this.cancelNotifyDate = cancelNotifyDate;
    }

    /**
     * The OrderPrograms schema
     * <p>
     * The order programs in which this order participates.
     * 
     */
    @JsonProperty("OrderPrograms")
    public List<OrderProgram> getOrderPrograms() {
        return orderPrograms;
    }

    /**
     * The OrderPrograms schema
     * <p>
     * The order programs in which this order participates.
     * 
     */
    @JsonProperty("OrderPrograms")
    public void setOrderPrograms(List<OrderProgram> orderPrograms) {
        this.orderPrograms = orderPrograms;
    }

    /**
     * The ShippingPrograms schema
     * <p>
     * The shipping programs in which this order participates.
     * 
     */
    @JsonProperty("ShippingPrograms")
    public List<ShippingProgram> getShippingPrograms() {
        return shippingPrograms;
    }

    /**
     * The ShippingPrograms schema
     * <p>
     * The shipping programs in which this order participates.
     * 
     */
    @JsonProperty("ShippingPrograms")
    public void setShippingPrograms(List<ShippingProgram> shippingPrograms) {
        this.shippingPrograms = shippingPrograms;
    }

    /**
     * The EasyShipShipmentStatus schema
     * <p>
     * The status of the Amazon Easy Ship order. This property is included only for Amazon Easy Ship orders.
     * 
     */
    @JsonProperty("EasyShipShipmentStatus")
    public Summary.EasyShipShipmentStatus getEasyShipShipmentStatus() {
        return easyShipShipmentStatus;
    }

    /**
     * The EasyShipShipmentStatus schema
     * <p>
     * The status of the Amazon Easy Ship order. This property is included only for Amazon Easy Ship orders.
     * 
     */
    @JsonProperty("EasyShipShipmentStatus")
    public void setEasyShipShipmentStatus(Summary.EasyShipShipmentStatus easyShipShipmentStatus) {
        this.easyShipShipmentStatus = easyShipShipmentStatus;
    }

    /**
     * The ElectronicInvoiceStatus schema
     * <p>
     * The status of the electronic invoice.
     * 
     */
    @JsonProperty("ElectronicInvoiceStatus")
    public Summary.ElectronicInvoiceStatus getElectronicInvoiceStatus() {
        return electronicInvoiceStatus;
    }

    /**
     * The ElectronicInvoiceStatus schema
     * <p>
     * The status of the electronic invoice.
     * 
     */
    @JsonProperty("ElectronicInvoiceStatus")
    public void setElectronicInvoiceStatus(Summary.ElectronicInvoiceStatus electronicInvoiceStatus) {
        this.electronicInvoiceStatus = electronicInvoiceStatus;
    }

    /**
     * The OrderItems schema
     * <p>
     * Information about order items included in this order. For OrderItemLevel notifications, one payload includes one item, while for OrderLevel notifications, one payload includes all items.
     * (Required)
     * 
     */
    @JsonProperty("OrderItems")
    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    /**
     * The OrderItems schema
     * <p>
     * Information about order items included in this order. For OrderItemLevel notifications, one payload includes one item, while for OrderLevel notifications, one payload includes all items.
     * (Required)
     * 
     */
    @JsonProperty("OrderItems")
    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
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
        sb.append(Summary.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("marketplaceId");
        sb.append('=');
        sb.append(((this.marketplaceId == null)?"<null>":this.marketplaceId));
        sb.append(',');
        sb.append("orderStatus");
        sb.append('=');
        sb.append(((this.orderStatus == null)?"<null>":this.orderStatus));
        sb.append(',');
        sb.append("purchaseDate");
        sb.append('=');
        sb.append(((this.purchaseDate == null)?"<null>":this.purchaseDate));
        sb.append(',');
        sb.append("destinationPostalCode");
        sb.append('=');
        sb.append(((this.destinationPostalCode == null)?"<null>":this.destinationPostalCode));
        sb.append(',');
        sb.append("fulfillmentType");
        sb.append('=');
        sb.append(((this.fulfillmentType == null)?"<null>":this.fulfillmentType));
        sb.append(',');
        sb.append("orderType");
        sb.append('=');
        sb.append(((this.orderType == null)?"<null>":this.orderType));
        sb.append(',');
        sb.append("numberOfItemsShipped");
        sb.append('=');
        sb.append(this.numberOfItemsShipped);
        sb.append(',');
        sb.append("numberOfItemsUnshipped");
        sb.append('=');
        sb.append(this.numberOfItemsUnshipped);
        sb.append(',');
        sb.append("earliestDeliveryDate");
        sb.append('=');
        sb.append(((this.earliestDeliveryDate == null)?"<null>":this.earliestDeliveryDate));
        sb.append(',');
        sb.append("latestDeliveryDate");
        sb.append('=');
        sb.append(((this.latestDeliveryDate == null)?"<null>":this.latestDeliveryDate));
        sb.append(',');
        sb.append("earliestShipDate");
        sb.append('=');
        sb.append(((this.earliestShipDate == null)?"<null>":this.earliestShipDate));
        sb.append(',');
        sb.append("latestShipDate");
        sb.append('=');
        sb.append(((this.latestShipDate == null)?"<null>":this.latestShipDate));
        sb.append(',');
        sb.append("cancelNotifyDate");
        sb.append('=');
        sb.append(((this.cancelNotifyDate == null)?"<null>":this.cancelNotifyDate));
        sb.append(',');
        sb.append("orderPrograms");
        sb.append('=');
        sb.append(((this.orderPrograms == null)?"<null>":this.orderPrograms));
        sb.append(',');
        sb.append("shippingPrograms");
        sb.append('=');
        sb.append(((this.shippingPrograms == null)?"<null>":this.shippingPrograms));
        sb.append(',');
        sb.append("easyShipShipmentStatus");
        sb.append('=');
        sb.append(((this.easyShipShipmentStatus == null)?"<null>":this.easyShipShipmentStatus));
        sb.append(',');
        sb.append("electronicInvoiceStatus");
        sb.append('=');
        sb.append(((this.electronicInvoiceStatus == null)?"<null>":this.electronicInvoiceStatus));
        sb.append(',');
        sb.append("orderItems");
        sb.append('=');
        sb.append(((this.orderItems == null)?"<null>":this.orderItems));
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
        result = ((result* 31)+((this.latestShipDate == null)? 0 :this.latestShipDate.hashCode()));
        result = ((result* 31)+((this.orderType == null)? 0 :this.orderType.hashCode()));
        result = ((result* 31)+((this.cancelNotifyDate == null)? 0 :this.cancelNotifyDate.hashCode()));
        result = ((result* 31)+((this.purchaseDate == null)? 0 :this.purchaseDate.hashCode()));
        result = ((result* 31)+((this.easyShipShipmentStatus == null)? 0 :this.easyShipShipmentStatus.hashCode()));
        result = ((result* 31)+ this.numberOfItemsShipped);
        result = ((result* 31)+((this.orderStatus == null)? 0 :this.orderStatus.hashCode()));
        result = ((result* 31)+((this.fulfillmentType == null)? 0 :this.fulfillmentType.hashCode()));
        result = ((result* 31)+((this.earliestDeliveryDate == null)? 0 :this.earliestDeliveryDate.hashCode()));
        result = ((result* 31)+((this.orderItems == null)? 0 :this.orderItems.hashCode()));
        result = ((result* 31)+((this.earliestShipDate == null)? 0 :this.earliestShipDate.hashCode()));
        result = ((result* 31)+((this.marketplaceId == null)? 0 :this.marketplaceId.hashCode()));
        result = ((result* 31)+((this.destinationPostalCode == null)? 0 :this.destinationPostalCode.hashCode()));
        result = ((result* 31)+((this.electronicInvoiceStatus == null)? 0 :this.electronicInvoiceStatus.hashCode()));
        result = ((result* 31)+ this.numberOfItemsUnshipped);
        result = ((result* 31)+((this.latestDeliveryDate == null)? 0 :this.latestDeliveryDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shippingPrograms == null)? 0 :this.shippingPrograms.hashCode()));
        result = ((result* 31)+((this.orderPrograms == null)? 0 :this.orderPrograms.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Summary) == false) {
            return false;
        }
        Summary rhs = ((Summary) other);
        return ((((((((((((((((((((this.latestShipDate == rhs.latestShipDate)||((this.latestShipDate!= null)&&this.latestShipDate.equals(rhs.latestShipDate)))&&((this.orderType == rhs.orderType)||((this.orderType!= null)&&this.orderType.equals(rhs.orderType))))&&((this.cancelNotifyDate == rhs.cancelNotifyDate)||((this.cancelNotifyDate!= null)&&this.cancelNotifyDate.equals(rhs.cancelNotifyDate))))&&((this.purchaseDate == rhs.purchaseDate)||((this.purchaseDate!= null)&&this.purchaseDate.equals(rhs.purchaseDate))))&&((this.easyShipShipmentStatus == rhs.easyShipShipmentStatus)||((this.easyShipShipmentStatus!= null)&&this.easyShipShipmentStatus.equals(rhs.easyShipShipmentStatus))))&&(this.numberOfItemsShipped == rhs.numberOfItemsShipped))&&((this.orderStatus == rhs.orderStatus)||((this.orderStatus!= null)&&this.orderStatus.equals(rhs.orderStatus))))&&((this.fulfillmentType == rhs.fulfillmentType)||((this.fulfillmentType!= null)&&this.fulfillmentType.equals(rhs.fulfillmentType))))&&((this.earliestDeliveryDate == rhs.earliestDeliveryDate)||((this.earliestDeliveryDate!= null)&&this.earliestDeliveryDate.equals(rhs.earliestDeliveryDate))))&&((this.orderItems == rhs.orderItems)||((this.orderItems!= null)&&this.orderItems.equals(rhs.orderItems))))&&((this.earliestShipDate == rhs.earliestShipDate)||((this.earliestShipDate!= null)&&this.earliestShipDate.equals(rhs.earliestShipDate))))&&((this.marketplaceId == rhs.marketplaceId)||((this.marketplaceId!= null)&&this.marketplaceId.equals(rhs.marketplaceId))))&&((this.destinationPostalCode == rhs.destinationPostalCode)||((this.destinationPostalCode!= null)&&this.destinationPostalCode.equals(rhs.destinationPostalCode))))&&((this.electronicInvoiceStatus == rhs.electronicInvoiceStatus)||((this.electronicInvoiceStatus!= null)&&this.electronicInvoiceStatus.equals(rhs.electronicInvoiceStatus))))&&(this.numberOfItemsUnshipped == rhs.numberOfItemsUnshipped))&&((this.latestDeliveryDate == rhs.latestDeliveryDate)||((this.latestDeliveryDate!= null)&&this.latestDeliveryDate.equals(rhs.latestDeliveryDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shippingPrograms == rhs.shippingPrograms)||((this.shippingPrograms!= null)&&this.shippingPrograms.equals(rhs.shippingPrograms))))&&((this.orderPrograms == rhs.orderPrograms)||((this.orderPrograms!= null)&&this.orderPrograms.equals(rhs.orderPrograms))));
    }


    /**
     * The EasyShipShipmentStatus schema
     * <p>
     * The status of the Amazon Easy Ship order. This property is included only for Amazon Easy Ship orders.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum EasyShipShipmentStatus {

        PENDING_SCHEDULE("PendingSchedule"),
        PENDING_PICK_UP("PendingPickUp"),
        PENDING_DROP_OFF("PendingDropOff"),
        LABEL_CANCELED("LabelCanceled"),
        PICKED_UP("PickedUp"),
        DROPPED_OFF("DroppedOff"),
        AT_ORIGIN_FC("AtOriginFC"),
        AT_DESTINATION_FC("AtDestinationFC"),
        DELIVERED("Delivered"),
        REJECTED_BY_BUYER("RejectedByBuyer"),
        UNDELIVERABLE("Undeliverable"),
        RETURNING_TO_SELLER("ReturningToSeller"),
        RETURNED_TO_SELLER("ReturnedToSeller"),
        LOST("Lost"),
        OUT_FOR_DELIVERY("OutForDelivery"),
        DAMAGED("Damaged");
        private final String value;
        private final static Map<String, Summary.EasyShipShipmentStatus> CONSTANTS = new HashMap<String, Summary.EasyShipShipmentStatus>();

        static {
            for (Summary.EasyShipShipmentStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        EasyShipShipmentStatus(String value) {
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
        public static Summary.EasyShipShipmentStatus fromValue(String value) {
            Summary.EasyShipShipmentStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The ElectronicInvoiceStatus schema
     * <p>
     * The status of the electronic invoice.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ElectronicInvoiceStatus {

        NOT_REQUIRED("NotRequired"),
        NOT_FOUND("NotFound"),
        PROCESSING("Processing"),
        ERRORED("Errored"),
        ACCEPTED("Accepted");
        private final String value;
        private final static Map<String, Summary.ElectronicInvoiceStatus> CONSTANTS = new HashMap<String, Summary.ElectronicInvoiceStatus>();

        static {
            for (Summary.ElectronicInvoiceStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ElectronicInvoiceStatus(String value) {
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
        public static Summary.ElectronicInvoiceStatus fromValue(String value) {
            Summary.ElectronicInvoiceStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The FulfillmentType schema
     * <p>
     * Fulfillment type of the affected order, MFN or AFN.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum FulfillmentType {

        AFN("AFN"),
        MFN("MFN");
        private final String value;
        private final static Map<String, Summary.FulfillmentType> CONSTANTS = new HashMap<String, Summary.FulfillmentType>();

        static {
            for (Summary.FulfillmentType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        FulfillmentType(String value) {
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
        public static Summary.FulfillmentType fromValue(String value) {
            Summary.FulfillmentType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The OrderStatus schema
     * <p>
     * The current order status.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum OrderStatus {

        PENDING("Pending"),
        UNSHIPPED("Unshipped"),
        PARTIALLY_SHIPPED("PartiallyShipped"),
        SHIPPED("Shipped"),
        CANCELED("Canceled"),
        UNFULFILLABLE("Unfulfillable"),
        INVOICE_UNCONFIRMED("InvoiceUnconfirmed"),
        PENDING_AVAILABILITY("PendingAvailability");
        private final String value;
        private final static Map<String, Summary.OrderStatus> CONSTANTS = new HashMap<String, Summary.OrderStatus>();

        static {
            for (Summary.OrderStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        OrderStatus(String value) {
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
        public static Summary.OrderStatus fromValue(String value) {
            Summary.OrderStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The OrderType schema
     * <p>
     * The type of the order.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum OrderType {

        STANDARD_ORDER("StandardOrder"),
        LONG_LEAD_TIME_ORDER("LongLeadTimeOrder"),
        PREORDER("Preorder"),
        BACK_ORDER("BackOrder"),
        SOURCING_ON_DEMAND_ORDER("SourcingOnDemandOrder");
        private final String value;
        private final static Map<String, Summary.OrderType> CONSTANTS = new HashMap<String, Summary.OrderType>();

        static {
            for (Summary.OrderType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        OrderType(String value) {
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
        public static Summary.OrderType fromValue(String value) {
            Summary.OrderType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
