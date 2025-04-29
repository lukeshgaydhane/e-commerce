package com.ecommerce.sb_ecom.service.impl;

import com.ecommerce.sb_ecom.model.Category;
import com.ecommerce.sb_ecom.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private List<Category> categories = new ArrayList<>();
    private Long nextId = 1L;

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public void createCategory(Category category) {
        category.setCategoryId(nextId++);
        categories.add(category);
    }

//    @Override
//    public String deleteCategoryById(Long categoryId) {
//        Category category = categories.stream()
//                .filter(c -> c.getCategoryId().equals(categoryId))
//                .findFirst()
//                        .orElseThrow(()-> new ResponseStatusException(
//                                HttpStatus.NOT_FOUND),
//                                "Resource not found!!");
//          categories.remove(category);
//        return "Category has been deleted.";
//    }
}
