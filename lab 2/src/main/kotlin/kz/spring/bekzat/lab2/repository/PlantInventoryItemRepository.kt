package kz.spring.bekzat.lab2.repository

import kz.spring.bekzat.lab2.entities.PlantInventoryEntry
import kz.spring.bekzat.lab2.entities.PlantInventoryItem
import org.springframework.data.jpa.repository.JpaRepository

interface PlantInventoryItemRepository : JpaRepository<PlantInventoryItem?, Long?> {
    fun findOneByPlantInfo(entry: PlantInventoryEntry?): PlantInventoryItem?
}
