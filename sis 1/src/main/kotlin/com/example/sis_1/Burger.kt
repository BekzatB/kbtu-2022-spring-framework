package com.example.sis_1

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

    fun addTopping(topping: BurgerTopping?) {
        burgerToppingsList.add(topping)
    }

    override fun toString(): String {
        return "Burger {" +
                "burgerOption=" + burgerToppingsList.toString() +
                '}'
    }
}
