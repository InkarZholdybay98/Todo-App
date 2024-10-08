package com.example.todoApp.entity;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TodoItem {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  private String todoTitle;

  private boolean done;

}
