package kz.spring.bekzat.lab2.repository

import kz.spring.bekzat.lab2.entities.PlantInventoryEntry
import org.springframework.beans.factory.annotation.Autowired
import java.time.LocalDate
import javax.persistence.EntityManager

class InventoryRepositoryImpl : CustomInventoryRepository {
    @Autowired
    var em: EntityManager? = null
    override fun findAvailablePlants(
        name: String?,
        startDate: LocalDate?,
        endDate: LocalDate?
    ): List<PlantInventoryEntry?>? {
        return em!!.createQuery(
            "select p.plantInfo from PlantInventoryItem p where p.plantInfo.name like concat('%', ?1, '%') and p not in" +
                    "(select r.plant from PlantReservation r where ?2 < r.schedule.endDate and ?3 > r.schedule.startDate)",
            PlantInventoryEntry::class.java
        )
            .setParameter(1, name)
            .setParameter(2, startDate)
            .setParameter(3, endDate)
            .resultList
    }
}
