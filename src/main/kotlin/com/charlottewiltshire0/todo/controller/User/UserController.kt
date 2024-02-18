package com.charlottewiltshire0.todo.controller.User

import com.charlottewiltshire0.todo.exception.UserAlreadyExistException
import com.charlottewiltshire0.todo.model.User
import com.charlottewiltshire0.todo.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/user")
class UserController(
    private val userService: UserService
) {

    @PostMapping("register")
    fun register(@RequestBody body: UserRequest): ResponseEntity<*> {
        // Проверяем, существует ли пользователь с таким именем
        if (userService.existsByGmail(body.gmail) && !userService.existsByUsername(body.username)) {
            return ResponseEntity.ok(BaseResponse(false, message = "User with username or gmail: ${body.username}/${body.gmail} already exists"))
        }

        val user = User()
        user.username = body.username
        user.gmail = body.gmail
        user.password = body.password
        userService.save(user)

        val response = UserResponse(
            id = user.id,
            username = user.username,
            gmail = user.gmail,
            created_at = user.created_at
        )
        return ResponseEntity.ok(response)
    }
}

