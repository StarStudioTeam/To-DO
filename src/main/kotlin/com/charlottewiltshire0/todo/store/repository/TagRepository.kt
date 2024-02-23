package com.charlottewiltshire0.todo.store.repository

import com.charlottewiltshire0.todo.store.entities.TagEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TagRepository: JpaRepository<TagEntity, Long> {
}