package com.example.sis_1

class Fries(private val size: String) : MenuItem {
    override fun display() {
        println("Fries, size $size")
    }

    override fun price(): Int {
        var price = 0
        if (size == REGULAR) {
            price = 3
        } else if (size == LARGE) {
            price = 5
        }
        return price
    }

    companion object {
        const val REGULAR = "regular"
        const val LARGE = "large"
    }
}
