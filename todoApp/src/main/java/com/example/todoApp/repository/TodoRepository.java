package com.example.todoApp.repository;

import org.springframework.stereotype.Repository;
import com.example.todoApp.entity.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TodoRepository extends JpaRepository<TodoItem , Long> {
  
}
