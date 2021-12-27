package com.bahadirmemis.springboot.mongodb.entity;

import javax.persistence.Id;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "customer")
public class Customer {

  @Id
  private String id;

  @Size(max = 50)
  private String name;

  private String lastName;

  private String mail;

  private String phoneNumber;

  private String userName;

}

