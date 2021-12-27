package com.bahadirmemis.springboot.mongodb.controller;

import com.bahadirmemis.springboot.mongodb.convertor.SaveCustomerReviewConvertor;
import com.bahadirmemis.springboot.mongodb.dto.CustomerReviewDto;
import com.bahadirmemis.springboot.mongodb.convertor.CustomerReviewConvertor;
import com.bahadirmemis.springboot.mongodb.dto.SaveCustomerReviewDto;
import com.bahadirmemis.springboot.mongodb.entity.CustomerReview;
import com.bahadirmemis.springboot.mongodb.service.CustomerReviewService;
import com.bahadirmemis.springboot.mongodb.service.CustomerService;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mongodb/api/reviews")
public class CustomerReviewController {

  private final CustomerReviewService customerReviewService;

  private final CustomerReviewConvertor customerReviewConvertor;

  private final SaveCustomerReviewConvertor saveCustomerReviewConvertor;


  @GetMapping("")
  public List<CustomerReviewDto> findAllCustomerReviews(){
      return customerReviewConvertor.toDto(customerReviewService.findAllReviews());
  }

  @PostMapping("")
  public ResponseEntity<String> saveCustomerReview(@RequestBody SaveCustomerReviewDto customerReviewDto){

    CustomerReview customerReview = saveCustomerReviewConvertor.toEntity(customerReviewDto);
    customerReviewService.saveCustomerReview(customerReview);

    return ResponseEntity.ok("Kullanıcı yorumu basarıyla kaydedildi");
  }

  @GetMapping("/{id}")
  public CustomerReviewDto findCustomerReviewById(@PathVariable String id){
    return customerReviewConvertor.toDto(customerReviewService.getCustomerReviewById(id));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteCustomerReviewById(@PathVariable String id){
    customerReviewService.deleteCustomerReviewById(id);
    return ResponseEntity.ok("Kullanici yorumu basariyla silindi");
  }

}