package com.example.lab_5_2

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers


@WebMvcTest(CoffeeMenuController::class)
class CoffeeMenuWebTest {
    @Autowired
    private lateinit var mockMvc: MockMvc


    @Test
    fun fromCoffeeSizesEndpointReturns200Ok() {
        mockMvc!!.perform(MockMvcRequestBuilders.get("/api/coffee/menu/sizes"))
            .andExpect(MockMvcResultMatchers.status().isOk)
    }
}
