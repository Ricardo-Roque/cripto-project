package org.example.cryptoproject.model.entity.crypto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.cryptoproject.model.entity.Wallet;
import org.example.cryptoproject.model.entity.shared.BaseEntity;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class WalletCrypto extends BaseEntity {

    @Column
    Double quantity;

    @ManyToOne
    @JoinColumn(name = "wallet_id", nullable = false)
    Wallet wallet;

    @ManyToOne
    @JoinColumn(name = "crypto_id", nullable = false)
    Crypto crypto;
}