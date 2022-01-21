package com.ikenna.vshop.model.users;


import com.ikenna.vshop.model.enums.UserGender;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gender_id;

    @Enumerated(EnumType.STRING)
    private UserGender gender;
}
