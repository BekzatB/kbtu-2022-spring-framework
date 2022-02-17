package kz.ktl.lab1.controller

import kz.ktl.lab1.entities.PlantInventoryEntry
import kz.ktl.lab1.repository.PlantInventoryEntryRepository
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import java.math.BigDecimal

@Controller
class PlantInventoryEntryController {

    @Autowired
    lateinit var repo: PlantInventoryEntryRepository

    val logger = KotlinLogging.logger {}

    @GetMapping("/plants")
    fun list(model: Model): String {
        println("${repo.findAll()}")
        logger.debug("$$$")
        model.addAttribute("plants", repo.findAll())
        return "plants/list"
    }

    @GetMapping(value = ["/plants/form"])
    fun form(model: Model): String {
        model.addAttribute("plants", createPlantObject())
        logger.info("$$$")
        return "plants/create"
    }

    @PostMapping(value = ["/plants"])
    fun create(plant: PlantInventoryEntry): String {
        logger.info("${plant.name}")
        repo.save(plant)
        return "redirect:/plants"
    }

    private fun createPlantObject(): PlantInventoryEntry {
        return PlantInventoryEntry(
            name = "DEFAULT",
            description = "DEFAULT",
            price = BigDecimal(0)
        )
    }
}

