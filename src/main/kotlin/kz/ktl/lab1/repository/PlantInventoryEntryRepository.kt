package kz.ktl.lab1.repository

import kz.ktl.lab1.entities.PlantInventoryEntry
import org.springframework.data.jpa.repository.JpaRepository

interface PlantInventoryEntryRepository : JpaRepository<PlantInventoryEntry, Long> {
}