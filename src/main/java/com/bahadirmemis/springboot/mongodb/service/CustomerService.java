package com.bahadirmemis.springboot.mongodb.service;

import com.bahadirmemis.springboot.mongodb.dto.CustomerDto;
import com.bahadirmemis.springboot.mongodb.entity.Customer;
import com.bahadirmemis.springboot.mongodb.repository.CustomerRepository;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import javax.swing.text.html.parser.Entity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

  public final CustomerRepository customerRepository;

  public Customer saveCustomer(Customer customer) {
   return customerRepository.save(customer);
  }

  public List<Customer> findCustomers(){
    return customerRepository.findAll();
  }

  public Customer getCustomerById(String id) {
    return customerRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id +" bu id ile bir kullanıcı bulanamadı"));
  }

  public void deleteCustomer(String id) {
     customerRepository.delete(getCustomerById(id));
  }


}
