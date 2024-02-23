package com.charlottewiltshire0.todo.api.dto

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.Instant

class UserDto {
    val id: Long? = null

    var username: String? = null

    var gmail: String? = null

    var password: String? = null

    @JsonProperty(value = "created_at")
    var created_at: Instant? = null
}