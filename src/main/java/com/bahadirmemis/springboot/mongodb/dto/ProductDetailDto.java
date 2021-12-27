package com.bahadirmemis.springboot.mongodb.dto;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class ProductDetailDto {

  private String productName;
  private String categoryName;
  private String categoryId;
  private BigDecimal productPrice;


}
