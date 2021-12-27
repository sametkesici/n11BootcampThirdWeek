package com.bahadirmemis.springboot.mongodb.convertor;

import com.bahadirmemis.springboot.mongodb.dto.CustomerReviewDto;
import com.bahadirmemis.springboot.mongodb.entity.CustomerReview;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerReviewConvertor extends BaseConvertor<CustomerReview, CustomerReviewDto> {


  CustomerReviewDto toDto(CustomerReview customerReview);


  CustomerReview toEntity(CustomerReviewDto customerReviewDto);


  List<CustomerReview> toEntity(List<CustomerReviewDto> dtoList);


  List<CustomerReviewDto> toDto(List<CustomerReview> customerReviews);

}
