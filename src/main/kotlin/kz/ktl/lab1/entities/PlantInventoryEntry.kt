package kz.ktl.lab1.entities

import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name= "plants")
class PlantInventoryEntry(
    @Id
    @GeneratedValue
    var id: Long? = null,
    var name: String,
    var description: String,
    @Column(precision = 8, scale = 2)
    var price: BigDecimal
)