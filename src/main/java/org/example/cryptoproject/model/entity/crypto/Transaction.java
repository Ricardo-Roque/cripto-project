package org.example.cryptoproject.model.entity.crypto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.cryptoproject.model.entity.Wallet;
import org.example.cryptoproject.model.entity.shared.BaseEntity;
import org.example.cryptoproject.model.enums.TransactionType;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Transaction extends BaseEntity {

    @Column(nullable = false)
    Double quantity;

    @Column(nullable = false)
    Double pricePaid;

    @Column(nullable = false)
    Double totalAmount;

    @Column(nullable = false)
    LocalDateTime transactionDate;

    @Column
    Double tax;

    @Column
    String notes;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    TransactionType transactionType;

    @ManyToOne
    @JoinColumn(name = "wallet_id", nullable = false)
    Wallet wallet;

    @ManyToOne
    @JoinColumn(name = "crypto_id", nullable = false)
    Crypto crypto;

    // TODO: implementar esse método na camada de serviço
    public void calculateTotalAmount() {
        this.totalAmount = this.quantity * this.pricePaid;
    }
}
