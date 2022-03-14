package com.example.sis_2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChickenSandwichTest {
    @Test
    @Throws(Exception::class)
    fun regularSandwichCosts6() {
        val chickenSandwich = ChickenSandwich()
        assertThat(chickenSandwich.price())
            .isEqualTo(6)
    }

    @Test
    @Throws(Exception::class)
    fun sandwichIsSpicy() {
        val chickenSandwich = ChickenSandwich()
        assertThat(chickenSandwich.isSpicy)
            .isTrue()
    }

    @Test
    @Throws(Exception::class)
    fun sandwichIsNotSpicy() {
        val chickenSandwich = ChickenSandwich(false)
        assertThat(chickenSandwich.isSpicy)
            .isFalse()
    }

    @Test
    @Throws(Exception::class)
    fun cheeseSandwichCosts7() {
        val chickenSandwich = ChickenSandwich()
        chickenSandwich.addTopping(BurgerTopping.CHEESE)
        assertThat(chickenSandwich.price())
            .isEqualTo(7)
    }
}