package com.bahadirmemis.springboot.mongodb.dto;

import java.util.Date;
import java.util.UUID;
import lombok.Data;

@Data
public class CustomerReviewDto {

  private String id;

  private String review;

  private Date reviewDate;

  private String customerId;

  private String productId;

}
