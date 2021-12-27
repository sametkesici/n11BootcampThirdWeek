package com.bahadirmemis.springboot.mongodb.repository;

import com.bahadirmemis.springboot.mongodb.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer,String> {

}
