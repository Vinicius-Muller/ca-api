package com.example.ca.dtos.locals;

public class LocalsDto {
  private String name;
  private String kind;
  private String status;

  public LocalsDto(String name, String kind, String status) {
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
