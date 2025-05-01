
package com.example.models;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum ShippingProgram {

    SHIP_DATE_SET("ShipDateSet"),
    GLOBAL_EXPRESS("GlobalExpress"),
    ISPU("ISPU"),
    ACCESS_POINT("AccessPoint"),
    TFM("TFM"),
    EASY_SHIP("EasyShip");
    private final String value;
    private final static Map<String, ShippingProgram> CONSTANTS = new HashMap<String, ShippingProgram>();

    static {
        for (ShippingProgram c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ShippingProgram(String value) {
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
    public static ShippingProgram fromValue(String value) {
        ShippingProgram constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
