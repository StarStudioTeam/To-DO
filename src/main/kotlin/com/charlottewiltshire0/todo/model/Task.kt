package com.charlottewiltshire0.todo.model

import jakarta.persistence.*

@Entity
@Table(name = "task")
class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @Column(length = 100, nullable = false)
    var title: String? = null

    @Column
    var description: String? = null

    @Column(nullable = false)
    var created_at: Long? = null

    @Column
    var due_date: Long? = null

    @Column
    var completed_at: Long? = null

    @Enumerated(EnumType.STRING)
    @Column
    var status: Status? = null

    @Enumerated(EnumType.STRING)
    @Column
    var priority: Priority? = null

    @Column(unique = true)
    var user_id: Long? = null

    @Column
    var tag_id: Long? = null
}

enum class Status {
    open, completed
}

enum class Priority {
    low, medium, high
}