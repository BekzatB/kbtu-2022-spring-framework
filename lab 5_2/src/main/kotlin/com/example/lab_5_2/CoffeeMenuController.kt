package com.example.lab_5_2

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/coffee")
class CoffeeMenuController {

    @GetMapping("/menu/sizes")
    fun getCoffeeSizes(): String {
        return "small"
    }

}
