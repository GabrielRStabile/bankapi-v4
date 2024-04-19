package br.edu.utfpr.bankapi.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String phoneNumber;

    private double balance;

    private double limit;
}
