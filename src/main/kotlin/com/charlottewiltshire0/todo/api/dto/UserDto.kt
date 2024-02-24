package com.charlottewiltshire0.todo.api.dto

import java.time.Instant

data class UserDto(
    val id: Long,
    val username: String,
    val gmail: String,
    val password: String,
    val createdAt: Instant
)
