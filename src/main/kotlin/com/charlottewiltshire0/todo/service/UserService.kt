package com.charlottewiltshire0.todo.service

import com.charlottewiltshire0.todo.model.User
import com.charlottewiltshire0.todo.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {
    fun save(user: User): User? {
        val found = userRepository.findByGmail(user.gmail)

        return if (found != null) {
            val savedUser = userRepository.save(user)
            savedUser
        } else null
    }

    fun existsByGmail(gmail: String?): Boolean {
        return userRepository.findByGmail(gmail) != null
    }

    fun existsByUsername(username: String?): Boolean {
        return userRepository.findByUsername(username) != null
    }
}