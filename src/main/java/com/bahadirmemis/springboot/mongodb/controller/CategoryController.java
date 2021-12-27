package com.bahadirmemis.springboot.mongodb.controller;


import com.bahadirmemis.springboot.mongodb.entity.Category;
import com.bahadirmemis.springboot.mongodb.service.CategoryService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/categories/")
public class CategoryController {


  private final CategoryService categoryService;

  @GetMapping("")
  public List<Category> findAll() {
    return categoryService.findAll();
  }

  @GetMapping("/{id}")
  public Category findById(@PathVariable String id) {
    return categoryService.findById(id);
  }

  @PostMapping("")
  public ResponseEntity<Object> save(@RequestBody Category category) {

    category = categoryService.save(category);

    return new ResponseEntity<>(category, HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable String id) {
    categoryService.deleteById(id);
  }



}