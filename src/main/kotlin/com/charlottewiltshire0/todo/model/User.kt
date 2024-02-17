package com.charlottewiltshire0.todo.model

import jakarta.persistence.*
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

@Entity
@Table(name = "users")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @Column(unique = true, length = 50, nullable = false)
    var username: String? = null

    @Column(unique = true, length = 100, nullable = false)
    var gmail: String? = null

    @Column(length = 100, nullable = false)
    var password: String = ""
        get() = field
        set(value) {
            val passwordEncoder = BCryptPasswordEncoder()
            field = passwordEncoder.encode(value)
        }
    @Column(nullable = false, updatable = false)
    var created_at: String = ""
        get() = field
        set(value) {
            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
            field = value ?: LocalDateTime.now().format(formatter)
        }
}