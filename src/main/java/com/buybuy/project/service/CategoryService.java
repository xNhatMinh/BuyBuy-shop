package com.buybuy.project.service;

import com.buybuy.project.payload.CategoryDTO;
import com.buybuy.project.payload.CategoryResponse;

//interface here to promote loose coupling and modularity
public interface CategoryService {
    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
