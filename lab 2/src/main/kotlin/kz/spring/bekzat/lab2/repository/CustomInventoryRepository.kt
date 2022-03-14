package kz.spring.bekzat.lab2.repository

import kz.spring.bekzat.lab2.entities.PlantInventoryEntry
import java.time.LocalDate

interface CustomInventoryRepository {
    fun findAvailablePlants(name: String?, startDate: LocalDate?, endDate: LocalDate?): List<PlantInventoryEntry?>?
}
