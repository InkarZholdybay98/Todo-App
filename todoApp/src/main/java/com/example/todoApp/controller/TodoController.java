package com.example.todoApp.controller;

import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.todoApp.entity.TodoItem;
import com.example.todoApp.repository.TodoRepository;

@RestController
@RequestMapping("/api/todo")
public class TodoController {
  
  @Autowired
  private TodoRepository todoRepo;

  @GetMapping
  public List<TodoItem> getTodos(){
    return todoRepo.findAll();
  }

  @PostMapping
  public TodoItem saveTodo(@Valid @NotNull @RequestBody TodoItem todoItem){
    return todoRepo.save(todoItem);
  }

  @PutMapping
  public TodoItem changeTodoDone(@Valid @NotNull @RequestBody TodoItem todoItem){
    return todoRepo.save(todoItem);
  }

  @DeleteMapping("/{id}")
  public void deleteTodo(@PathVariable Long id){
    todoRepo.deleteById(id);
  }

}
