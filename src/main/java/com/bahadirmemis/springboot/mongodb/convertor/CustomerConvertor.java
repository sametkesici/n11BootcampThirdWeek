package com.bahadirmemis.springboot.mongodb.convertor;

import com.bahadirmemis.springboot.mongodb.dto.CustomerDto;
import com.bahadirmemis.springboot.mongodb.entity.Customer;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerConvertor extends BaseConvertor<Customer, CustomerDto> {

  CustomerDto toDto(Customer customer);

  Customer toEntity(CustomerDto customerDto);

  List<Customer> toEntity(List<CustomerDto> dtoList);

  List<CustomerDto> toDto(List<Customer> customer);

}
