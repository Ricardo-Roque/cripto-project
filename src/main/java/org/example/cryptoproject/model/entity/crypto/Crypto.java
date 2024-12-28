package org.example.cryptoproject.model.entity.crypto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.cryptoproject.model.entity.shared.BaseEntity;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Crypto extends BaseEntity {

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String symbol;

    @Column
    BigDecimal currentPrice;

}
