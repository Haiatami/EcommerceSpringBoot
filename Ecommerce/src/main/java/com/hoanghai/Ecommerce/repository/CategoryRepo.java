package com.hoanghai.Ecommerce.repository;

import com.hoanghai.Ecommerce.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}

