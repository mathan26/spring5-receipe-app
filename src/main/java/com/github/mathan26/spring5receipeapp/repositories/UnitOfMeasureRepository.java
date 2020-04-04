package com.github.mathan26.spring5receipeapp.repositories;

import com.github.mathan26.spring5receipeapp.domain.Category;
import com.github.mathan26.spring5receipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
