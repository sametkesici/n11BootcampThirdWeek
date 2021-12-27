package com.bahadirmemis.springboot.mongodb.dto;

import java.util.Date;
import lombok.Data;

@Data
public class SaveCustomerReviewDto {

  private String review;

  private Date reviewDate;

  private String customerId;

  private String productId;

}
