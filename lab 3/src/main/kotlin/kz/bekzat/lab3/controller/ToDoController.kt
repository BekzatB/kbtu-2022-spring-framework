package kz.bekzat.lab3.controller

import kz.bekzat.lab3.service.ToDoService
import kz.bekzat.lab3.todo.ToDo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/todo")
class ToDoController {
    @Autowired
    private val toDoService: ToDoService? = null

    @GetMapping
    fun findAll(): List<ToDo?>? {
        return toDoService?.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: String): ToDo? {
        return toDoService?.findById(id)
    }

    @PostMapping
    fun create(@RequestBody toDo: ToDo) {
        toDoService?.save(toDo)
    }

    @PutMapping("/{id}")
    fun update(@RequestBody toDo: ToDo) {
        toDoService?.save(toDo)
    }

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: String) {
        toDoService?.deleteById(id)
    }
}
