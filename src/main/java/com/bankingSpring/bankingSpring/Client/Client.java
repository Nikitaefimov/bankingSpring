package com.bankingSpring.bankingSpring.Client;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Client {

    @Id
    @SequenceGenerator(
            name = "client_sequence",
            sequenceName = "client_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "client_sequence"
    )
    private Long id;
    private String name;
    private Long salary;
    private String sex;

    public Client(String name, long salary, String sex) {
        this.name = name;
        this.salary = salary;
        this.sex = sex;
    }
}
