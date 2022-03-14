package kz.spring.bekzat.lab2.entities

import lombok.Data
import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Data
@Table(name = "plant_inventory_entry")
class PlantInventoryEntry (
    @Id
    @GeneratedValue
    var id: Long? = null,
    var name: String? = null,
    var description: String? = null,

    @Column(precision = 8, scale = 2)
    var price: BigDecimal? = null
    )
