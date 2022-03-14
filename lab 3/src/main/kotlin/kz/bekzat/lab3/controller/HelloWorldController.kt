package kz.bekzat.lab3.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
    @GetMapping("/sayhello")
    fun sayHello(): String {
        return "Hello World!"
    }
}
