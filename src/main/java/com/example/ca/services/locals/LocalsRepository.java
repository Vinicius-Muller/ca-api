package com.example.ca.services.locals;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ca.entities.locals.LocalsEntity;

public interface LocalsRepository extends JpaRepository<LocalsEntity, Long> {
}
