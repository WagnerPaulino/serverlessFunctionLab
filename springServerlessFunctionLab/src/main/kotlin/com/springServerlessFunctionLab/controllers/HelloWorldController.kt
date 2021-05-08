package com.springServerlessFunctionLab.controller

import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class HelloWorldController {

    @Bean
    fun function(): (String) -> String {
        return { input: String -> "Hello " + input }
    }

    @Bean
    fun consume(): (String) -> Unit {
        return { input -> print("Hello " + input) }
    }

    @Bean
    fun supply(): () -> String {
        return { "Hello" }
    }
}
