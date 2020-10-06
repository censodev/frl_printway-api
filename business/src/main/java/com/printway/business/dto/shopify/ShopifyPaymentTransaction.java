package com.printway.business.dto.shopify;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ShopifyPaymentTransaction {
    @JsonProperty("id")
    private String code;

    private String type;

    @JsonProperty(value = "source_type")
    private String sourceType;

    private double amount;

    private double fee;

    private double net;

    @JsonProperty(value = "source_order_id")
    private String orderCode;
}