package com.ikenna.vshop.model.users;

import com.sun.istack.NotNull;
import lombok.*;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String email;

    @NotNull
    private String password;

    @NotNull
    private String fullName;

    @NotNull
    private String billingAddress;

    @NotNull
    private String defaultShippingAddress;

    @NotNull
    private String country;

    @NotNull
    private String phone;

    @NotNull
    private Boolean subscribed;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Roles.class)
    private Roles roles;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Gender.class)
    private Gender gender;
}
