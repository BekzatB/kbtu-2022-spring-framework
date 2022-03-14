package kz.spring.bekzat.lab2.entities

import lombok.AccessLevel
import lombok.AllArgsConstructor
import lombok.NoArgsConstructor
import lombok.Value
import java.time.LocalDate
import javax.persistence.Embeddable

@Embeddable
@Value
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@AllArgsConstructor(staticName = "of")
class BusinessPeriod (
    var startDate: LocalDate? = null,
    var endDate: LocalDate? = null
)