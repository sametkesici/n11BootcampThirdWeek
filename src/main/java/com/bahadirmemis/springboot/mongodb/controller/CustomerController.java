package com.bahadirmemis.springboot.mongodb.controller;

import com.bahadirmemis.springboot.mongodb.convertor.CustomerConvertor;
import com.bahadirmemis.springboot.mongodb.convertor.CustomerRegisterConvertor;
import com.bahadirmemis.springboot.mongodb.dto.CustomerDto;
import com.bahadirmemis.springboot.mongodb.dto.CustomerRegisterDto;
import com.bahadirmemis.springboot.mongodb.entity.Customer;
import com.bahadirmemis.springboot.mongodb.service.CustomerService;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mongodb/api/users")
public class CustomerController {

  private final CustomerService customerService;

  private final CustomerConvertor customerConvertor;

  private final CustomerRegisterConvertor customerRegisterConvertor;

  @PostMapping("")
  public ResponseEntity<String> saveCustomer(@RequestBody CustomerRegisterDto customerDto){
    customerConvertor.toDto(customerService.saveCustomer(customerRegisterConvertor.toEntity(customerDto)));

    return ResponseEntity.ok("Kullanıcı basarıyla kaydedildi");
  }

  @GetMapping("")
  public List<CustomerDto> findCustomers(){
    return customerConvertor.toDto(customerService.findCustomers());
  }

  @GetMapping("/{id}")
  public CustomerDto findCustomerById(@PathVariable String id){
    return customerConvertor.toDto(customerService.getCustomerById(id));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteCustomer(@PathVariable String id){
    customerService.deleteCustomer(id);
    return ResponseEntity.ok("Kullanici basariyla silindi");
  }

}
