package com.github.mathan26.spring5receipeapp.repositories;

import com.github.mathan26.spring5receipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
