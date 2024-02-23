package com.charlottewiltshire0.todo.store.entities

import jakarta.persistence.*
import java.time.Instant

@Entity
@Table(name = "task")
data class TaskEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(length = 100, nullable = false)
    var title: String,

    var description: String,

    @Column(nullable = false)
    var created_at: Instant = Instant.now(),

    var due_date: Long,

    var completed_at: Long,

    @Enumerated(EnumType.STRING)
    @Column
    var status: Status,

    @Enumerated(EnumType.STRING)
    @Column
    var priority: Priority,

    @OneToMany
    @JoinColumn(name = "user_id")
    @Column(unique = true)
    var user_id: Array<UserEntity>,

    @OneToMany
    @JoinColumn(name = "tag_id")
    var tag_id: Array<TagEntity>,
)

enum class Status {
    open, completed
}

enum class Priority {
    low, medium, high
}