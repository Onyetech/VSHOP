package com.ikenna.vshop.model.commodity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProductOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_option_id;

    @NotNull
    private String option;


    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Product.class)
    private Product product;


    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = ProductCategory.class)
    private ProductCategory productCategory;
}
