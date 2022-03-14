package com.example.sis_2

import java.util.*
import java.util.stream.Collectors

object MealKioskConsole {
    @JvmStatic
    fun main(args: Array<String>) {
        while (true) {
            println("What toppings do you want on your Burger? none, cheese, bacon, avocado")
            val scanner = Scanner(System.`in`)
            val input = scanner.nextLine()
            println("What drink size do you want ? regular, large")
            val scanner2 = Scanner(System.`in`)
            val input2 = scanner2.nextLine()
            val order = MealOrder()
            order.addItem(getTopping(input.lowercase(Locale.getDefault())))
            order.addItem(Drink(getDrink(input2.lowercase(Locale.getDefault()))))
            order.display()
        }
    }

    private fun getDrink(input: String): String {
        return if (input == "regular") {
            Drink.DRINK_REGULAR
        } else Drink.DRINK_LARGE
    }

    private fun getTopping(input: String): Burger {
        val toppings = Toppings()
        val burger = Burger()
        val inputs = Arrays.asList(*input.split(", ".toRegex()).toTypedArray())
        val uniqueInputs = inputs.stream().distinct().collect(Collectors.toList())
        for (item in uniqueInputs) {
            when (item) {
                "none" -> toppings.add(null)
                "cheese" -> toppings.add(BurgerTopping.CHEESE)
                "bacon" -> toppings.add(BurgerTopping.BACON)
                "avocado" -> toppings.add(BurgerTopping.AVOCADO)
            }
        }
        burger.setBurgerToppingsList(toppings)
        return burger
    }
}
