package com.example.lab_5

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration

@Configuration
class CoffeeOrderConfiguration {
    @Autowired
    private var coffeeOrderService: CoffeeOrderService? = null
    init {
        println()
        println(this.javaClass.name + " has been instantiated.")
        println(" --> Was passed a reference to a dependency: $coffeeOrderService")
        println()
    }
}
