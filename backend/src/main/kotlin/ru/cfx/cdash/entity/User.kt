package ru.cfx.cdash.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.math.BigDecimal
import java.time.Instant

@Entity
@Table(name = "users")
class User (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(nullable = false, unique = true, columnDefinition = "varchar(64)")
    val username: String,
    @Column(nullable = false, columnDefinition = "varchar(512)")
    val password: String,
    @Column(nullable = false, precision = 10, scale = 2)
    val balance: BigDecimal = BigDecimal.ZERO,
    @Column(nullable = false, name = "created_at")
    val createdAt: Instant = Instant.now(),
    @Column(nullable = false, name = "updated_at")
    val updatedAt: Instant = Instant.now()
)