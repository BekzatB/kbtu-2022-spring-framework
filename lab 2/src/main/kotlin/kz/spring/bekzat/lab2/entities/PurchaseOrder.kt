package kz.spring.bekzat.lab2.entities

import lombok.Data
import java.math.BigDecimal
import java.time.LocalDate
import javax.persistence.*

@Entity
@Data
class PurchaseOrder (
    @Id
    @GeneratedValue
    var id: Long? = null,

    @OneToMany
    var reservations: List<PlantReservation>? = null,

    @ManyToOne
    var plant: PlantInventoryEntry? = null,
    var issueDate: LocalDate? = null,
    var paymentSchedule: LocalDate? = null,

    @Column(precision = 8, scale = 2)
    var total: BigDecimal? = null,

    @Enumerated(EnumType.STRING)
    var status: POStatus? = null,

    @Embedded
    var rentalPeriod: BusinessPeriod? = null
)
