package ru.cfx.cdash.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.Instant

/*

1. id
2. header
3. body
4. created_at
5. updated_at

 */


@Entity
@Table(name = "text_fragments")
class TextFragment(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @Column(columnDefinition = "varchar(512)")
    val header: String?,
    @Column(columnDefinition = "text")
    val body: String,
    @Column(nullable = false, name = "created_at")
    val createdAt: Instant = Instant.now(),
    @Column(nullable = false, name = "updated_at")
    val updatedAt: Instant = Instant.now(),
)