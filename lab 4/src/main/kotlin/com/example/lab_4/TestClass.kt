package com.example.lab_4

import org.springframework.beans.factory.annotation.Autowired

class TestClass @Autowired constructor(component: CoffeeOrderComponent) {
    init {
        println()
        println(this.javaClass.name + " has been instantiated. ")
        println(" --> Was passed a reference to two dependencies: $component")
    }
}
