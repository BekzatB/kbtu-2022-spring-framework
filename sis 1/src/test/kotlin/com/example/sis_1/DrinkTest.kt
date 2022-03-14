package com.example.sis_1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DrinkTest {
    @Test
    @Throws(Exception::class)
    fun drinkSizeOfRegularReturns1() {
        val drink = Drink(Drink.DRINK_REGULAR)
        assertThat(drink.price())
            .isEqualTo(1)
    }

    @Test
    @Throws(Exception::class)
    fun drinkSizeOfLargeReturns2() {
        val drink = Drink(Drink.DRINK_LARGE)
        assertThat(drink.price())
            .isEqualTo(2)
    }
}
