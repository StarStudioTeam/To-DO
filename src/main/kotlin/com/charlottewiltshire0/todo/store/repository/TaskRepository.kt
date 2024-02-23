package com.charlottewiltshire0.todo.store.repository

import com.charlottewiltshire0.todo.store.entities.TaskEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TaskRepository: JpaRepository<TaskEntity, Long> {
}