package com.example.sis_2

import com.example.sis_2.MenuItem

class Dessert : MenuItem {
    override fun price(): Int {
        return 1
    }

    override fun display() {
        println("Dessert")
    }
}
