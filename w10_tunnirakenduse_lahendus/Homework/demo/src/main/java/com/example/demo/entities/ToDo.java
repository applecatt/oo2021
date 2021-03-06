package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class ToDo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @NotBlank(message = "Must enter an action")
  private String name;

  
  private Boolean done;

  public ToDo() {
  }

  public ToDo(String name, Boolean done) {
    this.name = name;
    this.done = done;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDone(Boolean done) {
    this.done = done;
  }

  public String getName() {
    return name;
  }

  public Boolean getDone() {
    return done;
  }

  @Override
  public String toString() {
    return "ToDo{" + "id=" + id + ", name=" + name + ", done=" + done + '}';
  }
}