package com.example.sis_1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MealOrderTest {
    @Test
    @Throws(Exception::class)
    fun emptyMealIsZeroPrice() {
        val mealOrder = MealOrder()
        assertThat(mealOrder.price())
            .isZero()
    }

    @Test
    @Throws(Exception::class)
    fun mealWithCheeseBurgerIs1() {
        val mealOrder = MealOrder(BurgerTopping.CHEESE)
        assertThat(mealOrder.price())
            .isEqualTo(1)
    }

    @Test
    @Throws(Exception::class)
    fun mealWithRegularBurgerLargeDrinkCosts7() {
        val mealOrder = MealOrder(null, DrinkOption.LARGE)
        assertThat(mealOrder.price())
            .isEqualTo(7)
    }
}
