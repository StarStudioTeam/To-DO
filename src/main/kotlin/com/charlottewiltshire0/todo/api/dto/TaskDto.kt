package com.charlottewiltshire0.todo.api.dto

import com.charlottewiltshire0.todo.store.entities.Priority
import com.charlottewiltshire0.todo.store.entities.Status
import com.charlottewiltshire0.todo.store.entities.TagEntity
import com.charlottewiltshire0.todo.store.entities.UserEntity
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.Instant

class TaskDto {
    val id: Long? = null

    var title: String? = null

    var description: String? = null

    @JsonProperty(value = "created_at")
    var created_at: Instant? = null

    var due_date: Long? = null

    var completed_at: Long? = null

    var status: Status? = null

    var priority: Priority? = null

    var user_id: Array<UserEntity>? = null

    var tag_id: Array<TagEntity>? = null
}