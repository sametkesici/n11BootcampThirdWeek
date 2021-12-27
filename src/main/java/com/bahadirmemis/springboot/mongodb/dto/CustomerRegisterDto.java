package com.bahadirmemis.springboot.mongodb.dto;

import lombok.Data;

@Data
public class CustomerRegisterDto {

  private String name;

  private String lastName;

  private String mail;

  private String phoneNumber;

  private String userName;

}
