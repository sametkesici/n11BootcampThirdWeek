package com.bahadirmemis.springboot.mongodb.service;

import com.bahadirmemis.springboot.mongodb.entity.Category;
import com.bahadirmemis.springboot.mongodb.repository.CategoryRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {

  private final CategoryRepository categoryRepository;

  public List<Category> findAll(){
    return categoryRepository.findAll();
  }

  public Category findById(String id){

    Optional<Category> optional = categoryRepository.findById(id);

    Category category = null;
    if (optional.isPresent()){
      category = optional.get();
    }

    return category;
  }

  public void deleteById(String id){
    categoryRepository.deleteById(id);
  }

  public Category save(Category category){
    return categoryRepository.save(category);
  }

}
