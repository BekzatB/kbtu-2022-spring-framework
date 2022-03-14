package com.example.sis_2

import com.example.sis_2.BurgerTopping
import com.example.sis_2.MenuItem
import com.example.sis_2.Toppings

class Burger : MenuItem {
    private var burgerToppingsList: Toppings

    constructor(theBurgerOption: BurgerTopping?) {
        burgerToppingsList = Toppings()
        burgerToppingsList.add(theBurgerOption)
    }

    constructor() {
        burgerToppingsList = Toppings()
        burgerToppingsList.add(null)
    }

    override fun price(): Int {
        return burgerToppingsList.price()
    }

    override fun display() {
        System.out.println("Burger: " + burgerToppingsList.toString())
    }

    fun setBurgerToppingsList(burgerToppingsList: Toppings?) {
        this.burgerToppingsList = burgerToppingsList!!
    }


    fun addTopping(topping: BurgerTopping?) {
        burgerToppingsList.add(topping)
    }

    override fun toString(): String {
        return "Burger {" +
                "burgerOption=" + burgerToppingsList.toString() +
                '}'
    }
}
