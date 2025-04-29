package com.ecommerce.sb_ecom.service;

import com.ecommerce.sb_ecom.model.Category;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(@RequestBody Category category);

//    String deleteCategoryById(Long categoryId);
}
