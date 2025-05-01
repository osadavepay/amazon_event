
package com.example.models;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum OrderProgram {

    BUSINESS("Business"),
    PRIME("Prime"),
    PREMIUM("Premium"),
    IBA("IBA"),
    REPLACEMENT("Replacement");
    private final String value;
    private final static Map<String, OrderProgram> CONSTANTS = new HashMap<String, OrderProgram>();

    static {
        for (OrderProgram c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    OrderProgram(String value) {
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
    public static OrderProgram fromValue(String value) {
        OrderProgram constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
