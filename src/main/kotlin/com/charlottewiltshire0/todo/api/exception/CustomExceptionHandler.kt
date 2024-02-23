package com.charlottewiltshire0.todo.api.exception

import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

@ControllerAdvice
class CustomExceptionHandler : ResponseEntityExceptionHandler() {

    private val log = LoggerFactory.getLogger(CustomExceptionHandler::class.java)

    @ExceptionHandler(Exception::class)
    fun exception(ex: Exception, request: WebRequest): ResponseEntity<Any>? {
        log.error("Exception during execution of application", ex)
        return handleException(ex, request)
    }
}
