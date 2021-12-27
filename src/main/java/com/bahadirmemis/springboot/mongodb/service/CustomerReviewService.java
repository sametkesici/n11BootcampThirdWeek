package com.bahadirmemis.springboot.mongodb.service;

import com.bahadirmemis.springboot.mongodb.entity.CustomerReview;
import com.bahadirmemis.springboot.mongodb.repository.CustomerReviewRepository;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerReviewService {

  public final CustomerReviewRepository customerReviewRepository;

  public List<CustomerReview> findAllReviews(){
      return customerReviewRepository.findAll();
  }

  public void saveCustomerReview(CustomerReview customerReview) {
     customerReviewRepository.save(customerReview);
  }

  public CustomerReview getCustomerReviewById(String id) {
    return customerReviewRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id + " bu id ile yorum bulunanamıstır."));
  }

  public void deleteCustomerReviewById(String id){
    customerReviewRepository.delete(getCustomerReviewById(id));
  }

}
