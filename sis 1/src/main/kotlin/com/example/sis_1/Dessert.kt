package com.example.sis_1

class Dessert : MenuItem {
    override fun price(): Int {
        return 1
    }

    override fun display() {
        println("Dessert")
    }
}
