package org.example.cryptoproject.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.cryptoproject.model.entity.shared.BaseEntity;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(indexes = {
        @Index(name = "idx_user_identifier_email", columnList = "identifier, email")
})
public class User extends BaseEntity {

    @Column(nullable = false, unique = true)
    String identifier;

    @Column(nullable = false)
    String name;

    @Column(nullable = false, unique = true)
    String email;

    @Column()
    String encryptedPassword;

    @Column(unique = true)
    String hashedRefreshToken;

    @OneToOne
    Wallet wallet;

}
