package kz.ktl.lab1.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HomeController {

    @RequestMapping("/")
    fun getHomePage(model: Model): String {
        model.addAttribute("myVar", "Say hello to the people")
        return "index"
    }
}