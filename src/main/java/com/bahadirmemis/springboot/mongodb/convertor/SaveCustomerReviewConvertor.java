package com.bahadirmemis.springboot.mongodb.convertor;

import com.bahadirmemis.springboot.mongodb.dto.CustomerReviewDto;
import com.bahadirmemis.springboot.mongodb.dto.SaveCustomerReviewDto;
import com.bahadirmemis.springboot.mongodb.entity.CustomerReview;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SaveCustomerReviewConvertor extends BaseConvertor<CustomerReview , SaveCustomerReviewDto> {

  SaveCustomerReviewDto toDto(CustomerReview customerReview);


  CustomerReview toEntity(SaveCustomerReviewDto customerReviewDto);


  List<CustomerReview> toEntity(List<SaveCustomerReviewDto> dtoList);


  List<SaveCustomerReviewDto> toDto(List<CustomerReview> customerReviews);

}
