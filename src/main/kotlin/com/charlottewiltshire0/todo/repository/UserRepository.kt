package com.charlottewiltshire0.todo.repository

import com.charlottewiltshire0.todo.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {
    fun findByGmail(gmail: String?): User?
    fun findByUsername(username: String?): User?
}