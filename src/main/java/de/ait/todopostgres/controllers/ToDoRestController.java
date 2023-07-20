package de.ait.todopostgres.controllers;

import de.ait.todopostgres.domains.ToDo;
import de.ait.todopostgres.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class ToDoRestController {

  @Autowired
  private ToDoService toDoService;

  @GetMapping()
  public List<ToDo> findAll() {
    return toDoService.findAll();
  }

  @GetMapping("/{id}")
  public ToDo findById(@PathVariable Long id) {
    return toDoService.findById(id);
  }

  @PostMapping("/add")
  public ToDo addToDo(@RequestBody ToDo toDo) {
    return toDoService.add(toDo);
  }

  @PutMapping("/update/{id}")
  public ToDo ubdateToDo(@PathVariable Long id, @RequestBody ToDo toDo) {
    return toDoService.updateToDo(id, toDo);
  }

  @DeleteMapping("/delete/{id}")
  public ToDo deleteToDo(@PathVariable Long id) {
    return toDoService.deleteById(id);
  }

}
