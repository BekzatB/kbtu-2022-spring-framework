package com.example.sis_1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FriesTest {
    @Test
    fun smallFriesAre3() {
        val fries = Fries(Fries.REGULAR)
        assertThat(fries.price())
            .isEqualTo(3)
    }

    @Test
    fun largeFriesAre5() {
        val fries = Fries(Fries.LARGE)
        assertThat(fries.price())
            .isEqualTo(5)
    }
}
