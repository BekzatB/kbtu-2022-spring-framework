package com.example.lab_5

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class CoffeeOrderComponent() {

    @Autowired
    private var coffeeOrderController: CoffeeOrderController? = null

    init {
        println()
        println(this.javaClass.name + " has been instantiated.")
        println(" --> Was passed a reference to a dependency: $coffeeOrderController")
        println()
    }
}
