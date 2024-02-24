package com.charlottewiltshire0.todo.store.repository

import com.charlottewiltshire0.todo.store.entities.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<UserEntity, Long> {
    fun findByGmail(gmail: String?): UserEntity?
    fun findByUsername(username: String?): UserEntity?
}