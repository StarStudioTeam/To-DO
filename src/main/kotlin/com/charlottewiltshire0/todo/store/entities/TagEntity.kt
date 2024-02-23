package com.charlottewiltshire0.todo.store.entities

import jakarta.persistence.*
import java.time.Instant

@Entity
@Table(name = "tag")
data class TagEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val tag_id: Long,

    @Column(length = 50, unique = true, nullable = false)
    var name: String,

    @Column(nullable = false)
    var created_at: Instant = Instant.now(),

    @Column(nullable = false)
    var updated_at: Long
)