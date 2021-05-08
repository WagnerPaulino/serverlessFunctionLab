package com.springServerlessFunctionLab.controller

import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class HelloWorldController {

    @Bean
    open fun function(): (String) -> String {
        return { input: String -> "Hello " + input }
    }

    @Bean
    open fun consume(): (String) -> Unit {
        return { input -> print("Hello " + input) }
    }

    @Bean
    open fun supply(): () -> String {
        return { "Hello" }
    }
}
