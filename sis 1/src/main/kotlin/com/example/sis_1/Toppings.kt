package com.example.sis_1

class Toppings : MenuItem {
    private val toppingsList: MutableList<BurgerTopping?>

    init {
        toppingsList = ArrayList()
    }

    override fun display() {
        println("Toppings: $toppingsList")
    }

    fun add(topping: BurgerTopping?) {
        toppingsList.add(topping)
    }

    override fun price(): Int {
        if (toppingsList.isEmpty()) return 0
        var sum = 0
        for (burgerTopping in toppingsList) {
            sum += burgerTopping?.code() ?: 5
        }
        return sum
    }
}
