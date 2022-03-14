package com.example.sis_1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToppingsTest {
    @Test
    fun noToppingsIsZeroPrice() {
        val toppings = Toppings()
        assertThat(toppings.price())
            .isZero()
    }

    @Test
    fun baconAndCheeseCosts3() {
        val toppings = Toppings()
        toppings.add(BurgerTopping.CHEESE)
        toppings.add(BurgerTopping.BACON)
        assertThat(toppings.price())
            .isEqualTo(3)
    }
}

