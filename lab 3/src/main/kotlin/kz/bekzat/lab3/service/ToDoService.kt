package kz.bekzat.lab3.service

import kz.bekzat.lab3.exception.EntityNotFoundException
import kz.bekzat.lab3.repository.ToDoRepository
import kz.bekzat.lab3.todo.ToDo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ToDoService {
    @Autowired
    private lateinit var toDoRepository: ToDoRepository

    fun findAll(): MutableList<ToDo?> {
        return toDoRepository.findAll()
    }

    fun findById(id: String): ToDo? {
        return toDoRepository.findById(id).orElseThrow { EntityNotFoundException() }
    }

    fun save(toDo: ToDo): ToDo? {
        return toDoRepository.save(toDo)
    }

    fun deleteById(id: String) {
        toDoRepository.deleteById(id)
    }
}