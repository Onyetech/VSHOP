package com.ikenna.vshop.model.commodity;

import com.ikenna.vshop.model.enums.OrderStatus;
import com.ikenna.vshop.model.users.Customer;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProductOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_id;

    @NotNull
    private Long amount;

    @NotNull
    private String shippingAddress;

    @NotNull
    private String orderAddress;

    @NotNull
    private String orderEmail;

    @NotNull
    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;


    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Customer.class)
    private Customer customer;
}
