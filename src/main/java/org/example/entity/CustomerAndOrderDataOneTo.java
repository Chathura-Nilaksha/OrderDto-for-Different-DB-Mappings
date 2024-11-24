package org.example.entity;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerAndOrderDataOneTo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private String customerEmail;

    @Column(name = "shipping_address")
    private String shippingAddress;

    @Column(name = "billing_address")
    private String billingAddress;

    @OneToOne(mappedBy = "customerAndOrderData", cascade = CascadeType.ALL)
    private OrderEntityOneTo order;


}
//C-below are Hibernate Validator annotations to
//              enforce constraints( bala karanava) in DTOs or entities:
//    @NotNull
//    @Size(max = 100)
//    private String customerName;
//
//    @Email
//    private String customerEmail;

// OP-1
//See both CustomerAndOrderData and orderEntity together
//@Embeddable
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class CustomerAndOrderData { //OP1
//    private String customerName;
//    private String customerEmail;
//    private String shippingAddress;
//    private String billingAddress;
//
//    // Add any other fields used in the front end
//}below must be in orderEntity with relationship //OP1
//@Embedded
//private CustomerAndOrderDataEntity customerAndOrderData;

// OP-2
//See both CustomerAndOrderDataEntity and orderEntity together
//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class CustomerAndOrderDataEntity { //OP2
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "customer_name", nullable = false)
//    private String customerName;
//
//    @Column(name = "customer_email", nullable = false)
//    private String customerEmail;
//
//    @Column(name = "shipping_address")
//    private String shippingAddress;
//
//    @Column(name = "billing_address")
//    private String billingAddress;
//
//    @OneToOne(mappedBy = "customerAndOrderData", cascade = CascadeType.ALL)
//    private OrderEntityEmbd order;
//}below must be in orderEntity with relationship // OP2
//@OneToOne(cascade = CascadeType.ALL)
//@JoinColumn(name = "customer_and_order_data_id", referencedColumnName = "id")
//private CustomerAndOrderDataEntity customerAndOrderData;


// Mapping Between DTO and Entity
//
//        Whether you use the embedded or separate table approach, you need to map between the DTO and the entity.
//        Example: Using MapStruct
//
//@Mapper(componentModel = "spring")
//public interface CustomerAndOrderDataMapper {
//
//    CustomerAndOrderData toDto(CustomerAndOrderDataEntity entity);
//
//    CustomerAndOrderDataEntity toEntity(CustomerAndOrderData dto);
//}
//
//    For OrderMapper, include mapping for CustomerAndOrderData:
//
//@Mapper(componentModel = "spring", uses = CustomerAndOrderDataMapper.class)
//public interface OrderMapper {
//    OrderDto toDto(OrderEntityEmbd entity);
//    OrderEntityEmbd toEntity(OrderDto dto);
//}

