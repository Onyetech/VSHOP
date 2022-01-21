package com.ikenna.vshop.model.commodity;

import com.ikenna.vshop.model.users.Customer;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FavouriteProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long favourite_id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Product.class)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Customer.class)
    private Customer customer;
}
