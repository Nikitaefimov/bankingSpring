package com.bankingSpring.bankingSpring.Client;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

@Entity
@Table
@AllArgsConstructor
public class Client {

    @Id
    @SequenceGenerator(
            name = "client_sequence",
            sequenceName = "client_sequence",
            allocationSize = 1
    )
    private Long id;

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "client_sequence"
    )

    private String name;
    private Long salary;
    private String sex;
}
