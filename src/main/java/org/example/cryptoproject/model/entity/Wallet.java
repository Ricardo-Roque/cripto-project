package org.example.cryptoproject.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.cryptoproject.model.entity.crypto.WalletCrypto;
import org.example.cryptoproject.model.entity.shared.BaseEntity;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Wallet extends BaseEntity {

    @Column
    String name;

    @Column
    Double balance;

    @OneToMany(mappedBy = "wallet")
    private List<WalletCrypto> walletCryptos;

    @OneToOne
    User walletOwner;
}
