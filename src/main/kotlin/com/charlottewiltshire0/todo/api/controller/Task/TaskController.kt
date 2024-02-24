package com.charlottewiltshire0.todo.api.controller.Task

import com.charlottewiltshire0.todo.api.exception.BadRequestException
import com.charlottewiltshire0.todo.store.repository.TaskRepository
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/tasks")
class TaskController(
    private val taskRepository: TaskRepository
) {

    @PostMapping()
    fun createTask(@RequestParam title: String) {
        //TODO: Make check if title already exists
//        taskRepository.findByTitle(title).takeIf {
//            throw BadRequestException("Title \"$title\" already exists.")
//        }

        throw BadRequestException("SsdS")
    }
}