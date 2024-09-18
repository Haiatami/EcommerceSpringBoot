package com.hoanghai.Ecommerce.service.interf;

import com.hoanghai.Ecommerce.dto.CategoryDto;
import com.hoanghai.Ecommerce.dto.Response;

public interface CategoryService {

    Response createCategory(CategoryDto categoryRequest);
    Response updateCategory(Long categoryId, CategoryDto categoryRequest);
    Response getAllCategories();
    Response getCategoryById(Long categoryId);
    Response deleteCategory(Long categoryId);
}
