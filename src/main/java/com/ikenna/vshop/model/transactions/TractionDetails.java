package com.ikenna.vshop.model.transactions;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class TractionDetails {

        @Id
        @Column( nullable = false)
        private Long id;

    }

