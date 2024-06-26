package teamchallenge.server.services;

import teamchallenge.server.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getCategories(List<String> categories);

    List<Category> getCategories();

    void createCategory(String name);

    Category getCategoryById(Long category);
}
