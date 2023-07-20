package de.ait.todopostgres.repository;

import de.ait.todopostgres.domains.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
