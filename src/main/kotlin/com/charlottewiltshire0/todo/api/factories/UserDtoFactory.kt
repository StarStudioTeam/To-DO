package com.charlottewiltshire0.todo.api.factories

import com.charlottewiltshire0.todo.api.dto.UserDto
import com.charlottewiltshire0.todo.store.entities.UserEntity
import java.time.Instant

object UserDtoFactory {
    fun createUserDTO(userEntity: UserEntity): UserDto {
        return UserDto(
            id = userEntity.id,
            username = userEntity.username,
            gmail = userEntity.gmail,
            password = userEntity.password,
            createdAt = userEntity.created_at
        )
    }
}

