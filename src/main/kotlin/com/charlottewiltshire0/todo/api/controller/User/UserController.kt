package com.charlottewiltshire0.todo.api.controller.User

//import com.charlottewiltshire0.todo.store.entities.UserEntity
//import com.charlottewiltshire0.todo.service.UserService
//import org.springframework.http.ResponseEntity
//import org.springframework.web.bind.annotation.PostMapping
//import org.springframework.web.bind.annotation.RequestBody
//import org.springframework.web.bind.annotation.RequestMapping
//import org.springframework.web.bind.annotation.RestController

//@RestController
//@RequestMapping("/api/v1/user")
//class UserController(
//    private val userService: UserService
//) {
//
//    @PostMapping("register")
//    fun register(@RequestBody body: UserRequest): ResponseEntity<*> {
//        // Проверяем, существует ли пользователь с таким именем
//        if (userService.existsByGmail(body.gmail) && !userService.existsByUsername(body.username)) {
//            return ResponseEntity.ok(BaseResponse(false, message = "User with username or gmail: ${body.username}/${body.gmail} already exists"))
//        }
//
//        val userEntity = UserEntity()
//        userEntity.username = body.username
//        userEntity.gmail = body.gmail
//        userEntity.password = body.password
////        userService.save(user)
//
//        val response = UserResponse(
//            id = userEntity.id,
//            username = userEntity.username,
//            gmail = userEntity.gmail,
//        )
//        return ResponseEntity.ok(this.userService.save(userEntity))
//    }
//}
//
