package com.charlottewiltshire0.todo.store.entities

import jakarta.persistence.*
import java.time.Instant

@Entity
@Table(name = "task")
data class TaskEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(length = 100, nullable = false, unique = true)
    var title: String,

    var description: String?,

    @Column(nullable = false)
    var created_at: Instant = Instant.now(),

    var due_date: Long,

    var completed_at: Long?,

    @Enumerated(EnumType.STRING)
    @Column
    var status: Status,

    @Enumerated(EnumType.STRING)
    @Column
    var priority: Priority,

    @ManyToOne
    @JoinColumn(name = "user_id")
    var user: UserEntity,

    @ManyToMany
    @JoinTable(
        name = "task_tag",
        joinColumns = [JoinColumn(name = "task_id")],
        inverseJoinColumns = [JoinColumn(name = "tag_id")]
    )
    var tags: List<TagEntity>
)


enum class Status {
    open, completed
}

enum class Priority {
    low, medium, high
}