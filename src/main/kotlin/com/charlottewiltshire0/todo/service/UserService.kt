package com.charlottewiltshire0.todo.service

//import com.charlottewiltshire0.todo.store.entities.UserEntity
//import com.charlottewiltshire0.todo.store.entities.repository.UserRepository
//import org.springframework.stereotype.Service
//
//@Service
//class UserService(
//    private val userRepository: UserRepository
//) {
//    fun save(userEntity: UserEntity): UserEntity? {
//        val found = userRepository.findByGmail(userEntity.gmail)
//
//        return if (found == null) {
//            val savedUser = userRepository.save(userEntity)
//            savedUser
//        } else null
//    }
//
//    fun existsByGmail(gmail: String?): Boolean {
//        return userRepository.findByGmail(gmail) != null
//    }
//
//    fun existsByUsername(username: String?): Boolean {
//        return userRepository.findByUsername(username) != null
//    }
//}