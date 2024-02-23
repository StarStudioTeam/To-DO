package com.charlottewiltshire0.todo.api.factories

import com.charlottewiltshire0.todo.api.dto.UserDto
import com.charlottewiltshire0.todo.store.entities.UserEntity
import org.springframework.stereotype.Component

@Component
class ProjectDtoFactory {
    fun makeProjectDto(entity: UserEntity): UserDto {
        return UserDtoвbuilder()
            .id(entity.getId())
            .name(entity.getName())
            .createdAt(entity.getCreatedAt())
            .updatedAt(entity.getUpdatedAt())
            .build()
    }
}