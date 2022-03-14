package com.example.sis_2

class ChickenSandwich : MenuItem {
    private var sandwichToppingsList: Toppings
    var isSpicy: Boolean? = null
        private set

    constructor(theSandwichOption: BurgerTopping?) {
        sandwichToppingsList = Toppings()
        sandwichToppingsList.add(theSandwichOption)
    }

    constructor() {
        isSpicy = true
        sandwichToppingsList = Toppings()
        sandwichToppingsList.add(BurgerTopping.SPICY)
    }

    constructor(isSpicy: Boolean?) {
        this.isSpicy = isSpicy
        sandwichToppingsList = Toppings()
        sandwichToppingsList.add(BurgerTopping.SPICY)
    }

    override fun price(): Int {
        return sandwichToppingsList.price()
    }

    override fun display() {
        System.out.println("ChickenSandwich: " + sandwichToppingsList.toString())
    }

    fun addTopping(topping: BurgerTopping?) {
        sandwichToppingsList.add(topping)
    }

    override fun toString(): String {
        return "ChickenSandwich {" +
                "burgerOption=" + sandwichToppingsList.toString() +
                '}'
    }
}
