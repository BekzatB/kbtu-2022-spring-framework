package com.example.sis_1

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BurgerTest {
    @Test
    @Throws(Exception::class)
    fun regularBurgerCosts5() {
        val burger = Burger()
        val price = burger.price()
        Assertions.assertThat(price)
            .isEqualTo(5)
    }

    @Test
    @Throws(Exception::class)
    fun cheeseburgerCosts6() {
        val burger = Burger()
        burger.addTopping(BurgerTopping.CHEESE)
        assertThat(burger.price())
            .isEqualTo(6)
    }

    @Test
    @Throws(Exception::class)
    fun baconCheeseburgerCosts8() {
        val burger = Burger()
        burger.addTopping(BurgerTopping.CHEESE)
        burger.addTopping(BurgerTopping.BACON)
        assertThat(burger.price())
            .isEqualTo(8)
    }

    @Test
    @Throws(Exception::class)
    fun doubleCheeseburgerCosts7() {
        val burger = Burger()
        burger.addTopping(BurgerTopping.CHEESE)
        burger.addTopping(BurgerTopping.CHEESE)
        assertThat(burger.price())
            .isEqualTo(7)
    }
}