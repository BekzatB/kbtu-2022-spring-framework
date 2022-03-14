package kz.bekzat.lab3.repository

import kz.bekzat.lab3.todo.ToDo
import org.springframework.data.jpa.repository.JpaRepository

interface ToDoRepository : JpaRepository<ToDo?, String?>
