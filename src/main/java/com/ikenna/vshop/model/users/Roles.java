package com.ikenna.vshop.model.users;


import com.ikenna.vshop.model.enums.Role;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long role_id;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Customer> customer = new HashSet<>();

    @Enumerated(EnumType.STRING)
    private Role role;
}
