package kz.bekzat.lab3.todo

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "ToDo")
class ToDo(
    @Id
    @GeneratedValue
    var id: Long? = null, val title: String, val completed: Boolean
)
