package kz.spring.bekzat.lab2.entities

import lombok.Data
import javax.persistence.*

@Entity
@Data
class PlantReservation(
    @Id
    @GeneratedValue
    var id: Long? = null,

    @Embedded
    var schedule: BusinessPeriod? = null,

    @ManyToOne
    var rental: PurchaseOrder? = null,

    @ManyToOne
    var plant: PlantInventoryItem? = null
)
