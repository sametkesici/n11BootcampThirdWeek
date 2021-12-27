package com.bahadirmemis.springboot.mongodb.service;

import com.bahadirmemis.springboot.mongodb.dto.ProductDetailDto;
import com.bahadirmemis.springboot.mongodb.entity.Product;
import com.bahadirmemis.springboot.mongodb.repository.ProductRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

  private final ProductRepository productRepository;

  public List<Product> findAll(){
    return productRepository.findAll();
  }

  public Product findById(String id){

    Optional<Product> optional = productRepository.findById(id);

    Product product = null;
    if (optional.isPresent()){
      product = optional.get();
    }
    return product;
  }

  public Product save(Product product){
    return productRepository.save(product);
  }

  public void delete(String id){
    productRepository.deleteById(id);
  }

  public List<Product> findAllProductByCategoryId(String categoryId) {
    return productRepository.findAllByCategoryId(categoryId);
  }

}
