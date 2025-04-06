package com.example.ca.controllers.locals;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ca.dtos.locals.LocalsDto;
import com.example.ca.entities.locals.LocalsEntity;
import com.example.ca.services.locals.LocalsRepository;

@RestController
public class LocalsController {
  private final LocalsRepository localsRepository;

  public LocalsController(LocalsRepository localsRepository) {
    this.localsRepository = localsRepository;
  }

  @GetMapping("/locals")
  public List<LocalsDto> getLocals() {
    return localsRepository.findAll().stream()
        .map(entity -> new LocalsDto(entity.getName(), entity.getKind(), entity.getStatus()))
        .collect(Collectors.toList());
  }

  @PostMapping("/locals")
  public void postLocals(@RequestBody LocalsDto payload) {
    LocalsEntity newLocal = new LocalsEntity(payload.getName(), payload.getKind(), payload.getStatus());
    localsRepository.save(newLocal);
  }
}
