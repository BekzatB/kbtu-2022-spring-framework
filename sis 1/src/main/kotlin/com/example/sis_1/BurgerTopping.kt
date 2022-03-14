package com.example.sis_1

enum class BurgerTopping(private val code: Int) {
    BACON(2), CHEESE(1), AVOCADO(3);

    fun code(): Int {
        return code
    }
}

