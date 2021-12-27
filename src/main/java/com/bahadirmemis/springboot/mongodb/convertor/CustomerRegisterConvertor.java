package com.bahadirmemis.springboot.mongodb.convertor;

import com.bahadirmemis.springboot.mongodb.dto.CustomerDto;
import com.bahadirmemis.springboot.mongodb.dto.CustomerRegisterDto;
import com.bahadirmemis.springboot.mongodb.entity.Customer;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerRegisterConvertor extends BaseConvertor<Customer, CustomerRegisterDto> {

  CustomerRegisterDto toDto(Customer customer);

  Customer toEntity(CustomerRegisterDto customerRegisterDto);

  List<Customer> toEntity(List<CustomerRegisterDto> dtoList);

  List<CustomerRegisterDto> toDto(List<Customer> customer);

}
