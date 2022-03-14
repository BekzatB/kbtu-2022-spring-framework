package com.example.sis_1

class SpecialMealOrder : MealOrder() {
    init {
        addBurger(BurgerTopping.CHEESE)
        addDrink(Drink.DRINK_LARGE)
        addFries(Fries.LARGE)
    }

    override fun price(): Int {
        return 9
    }
}
