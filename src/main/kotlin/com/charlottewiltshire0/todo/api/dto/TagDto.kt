package com.charlottewiltshire0.todo.api.dto

import java.time.Instant

data class TagDto (
    val tagId: Long,
    val name: String,
    val createdAt: Instant,
    val updatedAt: Long
)
