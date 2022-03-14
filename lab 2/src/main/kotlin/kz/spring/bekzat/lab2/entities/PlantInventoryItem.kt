package kz.spring.bekzat.lab2.entities

import lombok.Data
import javax.persistence.*

@Entity
@Data
class PlantInventoryItem (
    @Id
    @GeneratedValue
    var id: Long? = null,
    var serialNumber: String? = null,

    @Enumerated(EnumType.STRING)
    var equipmentCondition: EquipmentCondition? = null,

    @ManyToOne
    var plantInfo: PlantInventoryEntry? = null
    )
