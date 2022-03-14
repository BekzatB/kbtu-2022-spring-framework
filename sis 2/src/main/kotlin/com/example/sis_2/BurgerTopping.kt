package com.example.sis_2

enum class BurgerTopping(private val code: Int) {
    BACON(2), CHEESE(1), AVOCADO(3),SPICY(6);

    fun code(): Int {
        return code
    }
}

