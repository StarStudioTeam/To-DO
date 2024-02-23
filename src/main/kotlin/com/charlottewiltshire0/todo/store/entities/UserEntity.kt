package com.charlottewiltshire0.todo.store.entities

import jakarta.persistence.*
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import java.time.Instant



@Entity
@Table(name = "users")
data class UserEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(unique = true, length = 50, nullable = false)
    var username: String,

    @Column(unique = true, length = 100, nullable = false)
    var gmail: String,

    @Column(length = 100, nullable = false)
    var password: String,

    @Column(nullable = false, updatable = false)
    var created_at: Instant = Instant.now()
)