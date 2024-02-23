package com.charlottewiltshire0.todo.api.exception

import org.springframework.boot.web.error.ErrorAttributeOptions
import org.springframework.boot.web.servlet.error.ErrorAttributes
import org.springframework.boot.web.servlet.error.ErrorController
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.context.request.WebRequest

@Controller
class CustomErrorController(private val errorAttributes: ErrorAttributes) : ErrorController {

    @RequestMapping(PATH)
    fun error(webRequest: WebRequest): ResponseEntity<ErrorDto> {
        val attributes = errorAttributes.getErrorAttributes(
            webRequest,
            ErrorAttributeOptions.of(ErrorAttributeOptions.Include.EXCEPTION, ErrorAttributeOptions.Include.MESSAGE)
        )

        return ResponseEntity
            .status(attributes["status"] as Int)
            .body(
                ErrorDto.builder()
                    .error(attributes["error"] as String)
                    .errorDescription(attributes["message"] as String)
                    .build()
            )
    }

    fun getErrorPath(): String {
        return PATH
    }

    companion object {
        private const val PATH = "/error"
    }
}
