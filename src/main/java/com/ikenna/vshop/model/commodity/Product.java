package com.ikenna.vshop.model.commodity;

import com.ikenna.vshop.model.enums.ItemCategory;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;

    @NotNull
    private String sku;

    @NotNull
    private String product_name;

    @NotNull
    private Long price;

    @NotNull
    private String weight;

    @NotNull
    private String description;

    @NotNull
    private String thumbnail;

    @NotNull
    private String image;

    @Enumerated(EnumType.STRING)
    private ItemCategory category;

    @NotNull
    private LocalDateTime create_date;

    @NotNull
    private String stock;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = ProductCategory.class)
    private ProductCategory productCategory;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<ProductOption> productOption;

}
