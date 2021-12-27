package com.bahadirmemis.springboot.mongodb.controller;

import com.bahadirmemis.springboot.mongodb.dto.ProductDetailDto;
import com.bahadirmemis.springboot.mongodb.entity.Product;
import com.bahadirmemis.springboot.mongodb.service.ProductService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products/")
@RequiredArgsConstructor
public class ProductController {


  private final ProductService productService;

  @GetMapping("")
  public MappingJacksonValue findAllUrunList() {

    List<Product> productList = productService.findAll();

    MappingJacksonValue mapping = new MappingJacksonValue(productList);

    return mapping;

  }

  @GetMapping("/{id}")
  public MappingJacksonValue findUrunById(@PathVariable String id){

    Product product = productService.findById(id);

    WebMvcLinkBuilder linkToUrun = WebMvcLinkBuilder.linkTo(
        WebMvcLinkBuilder.methodOn(this.getClass())
                         .findAllUrunList()
    );

    EntityModel entityModel = EntityModel.of(product);

    entityModel.add(linkToUrun.withRel("tum-urunler"));

    MappingJacksonValue mapping = new MappingJacksonValue(entityModel);

    return mapping;

    //        return productService.findById(id);
  }

  @PostMapping("")
  public ResponseEntity<Object> saveUrun(/**@Valid*/@RequestBody Product product){
    product = productService.save(product);

    return new ResponseEntity<>(product, HttpStatus.CREATED);
  }

  @DeleteMapping("{id}")
  public void deleteUrun(@PathVariable String id){
    productService.delete(id);
  }


}
