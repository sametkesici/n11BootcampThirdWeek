package com.bahadirmemis.springboot.mongodb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNameAndPhoneNumberIsNotMatchException extends RuntimeException{

  public UserNameAndPhoneNumberIsNotMatchException(String message) {
    super(message);
  }

}
