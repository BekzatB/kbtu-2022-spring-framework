package com.example.lab_5

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CoffeeOrderService {

    @Autowired
    private var coffeeOrderComponent: CoffeeOrderComponent? = null

    @Autowired
    private var anotherCoffeeOrderComponent: AnotherCoffeeOrderComponent? = null

    init {
        println()
        println(this.javaClass.name + " has been instantiated. ")
        println(" --> Was passed a reference to two dependencies: $coffeeOrderComponent")
        println(" --> and: $anotherCoffeeOrderComponent")
        println()
    }

    fun name(): String {
        return "I'm Coffee Central Service"
    }
}
