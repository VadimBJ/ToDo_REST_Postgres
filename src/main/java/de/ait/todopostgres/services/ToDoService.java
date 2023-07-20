package de.ait.todopostgres.services;

import de.ait.todopostgres.domains.ToDo;
import de.ait.todopostgres.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

  @Autowired
  private ToDoRepository toDoRepository;

  public List<ToDo> findAll() {
    return toDoRepository.findAll();
  }

  public ToDo findById(Long id) {
    return toDoRepository.findById(id).orElse(null);
  }

  public ToDo add(ToDo toDo) {
    System.out.println(toDo);
    return toDoRepository.save(toDo);
  }

  public ToDo deleteById(Long id) {
    ToDo todo = findById(id);
    toDoRepository.deleteById(id);
    return todo;
  }

  public ToDo updateToDo(Long id, ToDo newToDo) {
    ToDo toDo = findById(id);
    toDo.setTitle(newToDo.getTitle());
    toDo.setDescription(newToDo.getDescription());
    toDoRepository.save(toDo);
    return toDo;
  }
}
