package com.charlottewiltshire0.todo.api.dto

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.Column
import java.time.Instant

class TagDto {
    val tag_id: Long? = null

    var name: String? = null

    @JsonProperty(value = "created_at")
    var created_at: Instant? = null

    var updated_at: Long? = null
}