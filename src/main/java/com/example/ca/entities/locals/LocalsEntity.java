package com.example.ca.entities.locals;

import jakarta.persistence.*;

@Entity
@Table(name = "locals")
public class LocalsEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String kind;
  private String status;

  public LocalsEntity() {
  }

  public LocalsEntity(String name, String kind, String status) {
    this.name = name;
    this.kind = kind;
    this.status = status;
  }

  public String getName() {
    return name;
  }

  public String getKind() {
    return kind;
  }

  public String getStatus() {
    return status;
  }
}
