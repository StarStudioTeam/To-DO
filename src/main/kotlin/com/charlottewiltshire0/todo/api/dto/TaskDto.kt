package com.charlottewiltshire0.todo.api.dto

import com.charlottewiltshire0.todo.store.entities.Priority
import com.charlottewiltshire0.todo.store.entities.Status
import java.time.Instant

data class TaskDto(
    val id: Long,
    val title: String,
    val description: String?,
    val createdAt: Instant,
    val dueDate: Long,
    val completedAt: Long?,
    val status: Status,
    val priority: Priority,
    val userIds: List<Long>,
    val tagIds: List<Long>
)
