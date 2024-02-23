package com.charlottewiltshire0.todo.api.controller.Task

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/tasks")
class TaskController(
) {

    @PostMapping()
    fun createTask(@RequestParam title: String) {

    }
}