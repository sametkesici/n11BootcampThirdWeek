package com.bahadirmemis.springboot.mongodb.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "category")
@Getter
@Setter
public class Category {

  @Id
  private String id;
  private String name;
  private Long level;
  private String superCategoryId;

}
