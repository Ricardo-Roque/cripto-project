package org.example.cryptoproject.model.entity.shared;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    @Column(nullable = false)
    private Integer version;

    @CreationTimestamp
    @Column(nullable = false)
    private Date createdAt;

    @UpdateTimestamp
    @Column(nullable = false)
    private Date updatedAt;
}
