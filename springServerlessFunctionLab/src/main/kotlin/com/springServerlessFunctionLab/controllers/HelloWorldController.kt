package com.springServerlessFunctionLab.controller

import java.util.function.Consumer
import java.util.function.Supplier
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class HelloWorldController {

    @Bean
    fun supply(): Supplier<String> {
        return Supplier { "Hello" }
    }
}
