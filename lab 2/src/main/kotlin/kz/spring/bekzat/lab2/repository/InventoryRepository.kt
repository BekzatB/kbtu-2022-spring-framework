package kz.spring.bekzat.lab2.repository

import kz.spring.bekzat.lab2.entities.PlantInventoryEntry
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface InventoryRepository : JpaRepository<PlantInventoryEntry?, Long?>, CustomInventoryRepository
