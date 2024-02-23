package com.charlottewiltshire0.todo.api.factories

import com.charlottewiltshire0.todo.api.dto.TaskDto
import com.charlottewiltshire0.todo.store.entities.TaskEntity

object TaskDtoFactory {
    fun createTaskDTO(taskEntity: TaskEntity): TaskDto {
        return TaskDto(
            id = taskEntity.id,
            title = taskEntity.title,
            description = taskEntity.description,
            createdAt = taskEntity.created_at,
            dueDate = taskEntity.due_date,
            completedAt = taskEntity.completed_at,
            status = taskEntity.status,
            priority = taskEntity.priority,
            userIds = listOf(taskEntity.user.id),
            tagIds = taskEntity.tags.map { it.tag_id }
        )
    }
}
