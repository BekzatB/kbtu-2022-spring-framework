package com.example.sis_2

import org.slf4j.LoggerFactory

class Drink : MenuItem {
    private var size = "" // regular or large

    constructor() {}
    constructor(drinkSize: String) {
        validateSize(drinkSize)
        size = drinkSize
    }

    private fun validateSize(drinkSize: String) {
        if (drinkSize.equals(DRINK_LARGE, ignoreCase = true) || drinkSize.equals(DRINK_REGULAR, ignoreCase = true)) {
            return
        }
        throw DrinkSizeNotValidException("Drink size `$drinkSize` not recognized.")
    }

    override fun price(): Int {
        var price = 0
        if (size == DRINK_REGULAR) {
            price = 1
        } else if (size == DRINK_LARGE) {
            price = 2
        }
        return price
    }

    override fun display() {
        println(toString())
    }

    override fun toString(): String {
        return "Drink Size: $size"
    }

    companion object {
        const val DRINK_REGULAR = "regular"
        const val DRINK_LARGE = "large"
        private val LOGGER = LoggerFactory.getLogger(Drink::class.java)
    }
}
