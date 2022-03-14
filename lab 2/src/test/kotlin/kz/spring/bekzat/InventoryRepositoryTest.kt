package kz.spring.bekzat

import kz.spring.bekzat.lab2.Lab2Application
import kz.spring.bekzat.lab2.entities.BusinessPeriod
import kz.spring.bekzat.lab2.entities.PlantReservation
import kz.spring.bekzat.lab2.repository.InventoryRepository
import kz.spring.bekzat.lab2.repository.PlantInventoryEntryRepository
import kz.spring.bekzat.lab2.repository.PlantInventoryItemRepository
import kz.spring.bekzat.lab2.repository.PlantReservationRepository
import org.assertj.core.api.Assertions
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.DirtiesContext
import org.springframework.test.context.jdbc.Sql
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import java.time.LocalDate

@RunWith(SpringJUnit4ClassRunner::class)
@SpringBootTest(classes = [Lab2Application::class])
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY)
class InventoryRepositoryTest {
    @Autowired
    var plantInventoryEntryRepo: PlantInventoryEntryRepository? = null

    @Autowired
    var plantInventoryItemRepo: PlantInventoryItemRepository? = null

    @Autowired
    var plantReservationRepo: PlantReservationRepository? = null

    @Autowired
    var inventoryRepo: InventoryRepository? = null
    @Test
    fun queryPlantCatalog() {
        Assertions.assertThat(plantInventoryEntryRepo!!.count()).isEqualTo(0L)
    }

    @Test
    fun queryByName() {
        Assertions.assertThat(plantInventoryEntryRepo!!.findByNameContaining("Mini")?.size).isEqualTo(0)
        val p1 = plantInventoryEntryRepo!!.findById(1L).orElse(null)
        val p2 = plantInventoryEntryRepo!!.findById(2L).orElse(null)
        Assertions.assertThat(p1).isNull()
        Assertions.assertThat(p1).isNull()
        val res1 = plantInventoryEntryRepo!!.finderMethod("Mini")
        Assertions.assertThat(res1).doesNotContain(p1, p2)
    }

    @Test
    fun findAvailableTest() {
        val entry = plantInventoryEntryRepo!!.findById(1L).orElse(null)
        val item = plantInventoryItemRepo!!.findOneByPlantInfo(entry)
        Assertions.assertThat(
            inventoryRepo!!.findAvailablePlants(
                "Mini",
                LocalDate.of(2020, 2, 20),
                LocalDate.of(2020, 2, 25)
            )
        ).doesNotContain(null)
    }
}