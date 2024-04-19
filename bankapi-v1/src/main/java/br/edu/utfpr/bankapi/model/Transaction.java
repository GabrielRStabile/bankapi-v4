package br.edu.utfpr.bankapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private TransactionType type;

    private double amount;

    @ManyToOne
    private Account origin;

    @ManyToOne
    private Account destination;

    private LocalDateTime createdAt;

    public Transaction() {
        this.createdAt = LocalDateTime.now();
    }
}
