package com.charlottewiltshire0.todo.model

import jakarta.persistence.*

@Entity
@Table(name = "tag")
class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val tag_id: Long? = null

    @Column(length = 50, unique = true, nullable = false)
    var name: String? = null

    @Column(nullable = false)
    var created_at: Long? = null

    @Column(nullable = false)
    var updated_at: Long? = null
}