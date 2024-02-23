package com.charlottewiltshire0.todo.api.factories

import com.charlottewiltshire0.todo.api.dto.TagDto
import com.charlottewiltshire0.todo.store.entities.TagEntity

object TagDtoFactory {
    fun createTagDTO(tagEntity: TagEntity): TagDto {
        return TagDto(
            tagId = tagEntity.tag_id,
            name = tagEntity.name,
            createdAt = tagEntity.created_at,
            updatedAt = tagEntity.updated_at
        )
    }
}
