package com.demo.restapi.demo_rest_api.exception;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {
  private int code;

  public BusinessException(ErrorCode errorCode) {
    this(errorCode.getCode(), errorCode.getMessage());
  }
  
  private BusinessException(int code, String message) {
    super(message);
    this.code = code;
  }
}