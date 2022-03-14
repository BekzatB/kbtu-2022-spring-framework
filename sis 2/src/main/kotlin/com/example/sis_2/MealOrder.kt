package com.example.sis_2

open class MealOrder {
    private val items: MutableList<MenuItem> = ArrayList()

    constructor() {}
    constructor(burgerOption: BurgerTopping?) {
        addBurger(burgerOption)
    }

    fun addDrink(drinkSize: String?) {
        items.add(Drink(drinkSize!!))
    }

    fun addFries(friesSize: String?) {
        items.add(Fries(friesSize!!))
    }

    open fun addItem(menuItem: MenuItem?) {
        items.add(menuItem!!)
    }

    fun addBurger(burgerOption: BurgerTopping?) {
        items.add(Burger(burgerOption))
    }

    constructor(
        burger: BurgerTopping?,
        drink: DrinkOption
    ) {
        addBurger(burger)
        addDrink(drink.name.toLowerCase())
    }

    open fun price(): Int {
        // loop over all items and sum their price
        var price = 0
        for (item in items) {
            price = price + item.price()
        }
        return price
    }

    fun display() {
        for (item in items) {
            item.display()
        }
        println(price())
    }

    companion object {
        fun createBurgerOnlyOrder(burgerOption: BurgerTopping?): MealOrder {
            return MealOrder(burgerOption)
        }

        @JvmStatic
        fun main(args: Array<String>) {
            val drinkOrder = MealOrder()
            drinkOrder.addDrink(Drink.DRINK_LARGE)
            drinkOrder.display()
            val burgerOrder = createBurgerOnlyOrder(null)
            burgerOrder.display()
        }
    }
}

