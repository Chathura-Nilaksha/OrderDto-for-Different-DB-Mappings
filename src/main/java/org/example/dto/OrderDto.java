package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class OrderDto {
    //@Embedded-chat has not inserted this.
    private CustomerAndOrderData customerAndOrderData;
    private Boolean isSaveShippingDataInDB;
    private Boolean isSaveBillingDataInDB;
    private String cardType;
    private List<CartItemDto> cartItems;
    private Double grandTotal;
}

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class OrderDto {
//
//    private CustomerAndOrderData customerAndOrderData;
//    private Boolean isSaveShippingDataInDB;
//    private Boolean isSaveBillingDataInDB;
//    private String cardType;
//    private List<CartItemDto> cartItems;
//    private Double grandTotal;
//}

