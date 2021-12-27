package com.bahadirmemis.springboot.mongodb.repository;

import com.bahadirmemis.springboot.mongodb.entity.CustomerReview;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerReviewRepository extends MongoRepository<CustomerReview,String> {

}
