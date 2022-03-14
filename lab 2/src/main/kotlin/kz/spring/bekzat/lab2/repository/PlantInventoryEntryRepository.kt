package kz.spring.bekzat.lab2.repository

import kz.spring.bekzat.lab2.entities.PlantInventoryEntry
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface PlantInventoryEntryRepository : JpaRepository<PlantInventoryEntry?, Long?> {
    fun findByNameContaining(str: String?): List<PlantInventoryEntry?>?

    @Query("select p from PlantInventoryEntry p where LOWER(p.name) like ?1")
    fun finderMethod(name: String?): List<PlantInventoryEntry?>?

    @Query(value = "select * from plant_inventory_entry where LOWER(name) like ?1", nativeQuery = true)
    fun finderMethodV2(name: String?): List<PlantInventoryEntry?>?
}
