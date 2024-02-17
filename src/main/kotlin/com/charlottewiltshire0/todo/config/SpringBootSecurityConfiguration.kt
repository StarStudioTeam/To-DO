package com.charlottewiltshire0.todo.config

import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.web.SecurityFilterChain

@Configuration
class SpringBootSecurityConfiguration {
    @Bean
    @Throws(Exception::class)
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
        http.csrf().disable()
        return http.build()
    }
}

