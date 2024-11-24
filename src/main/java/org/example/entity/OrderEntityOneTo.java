package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntityOneTo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_and_order_data_id", referencedColumnName = "id")
    private CustomerAndOrderDataOneTo customerAndOrderData;

    @Column(name = "is_save_shipping_data")
    private Boolean isSaveShippingDataInDB;

    @Column(name = "is_save_billing_data")
    private Boolean isSaveBillingDataInDB;

    @Column(name = "card_type")
    private String cardType;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartItemEntity> cartItems;

    @Column(name = "grand_total")
    private Double grandTotal;
}
