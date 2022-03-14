package com.example.lab_4

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController

@RestController
class CoffeeOrderController {

    @Autowired
    private var coffeeOrderService: CoffeeOrderService? = null

    init {
        println()
        println(this.javaClass.name + " has been instantiated.")
        println(" --> Was passed a reference to a dependency: $coffeeOrderService")
        println()
    }
}
