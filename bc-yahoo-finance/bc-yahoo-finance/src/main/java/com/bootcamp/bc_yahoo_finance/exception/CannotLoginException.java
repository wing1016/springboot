package com.bootcamp.bc_yahoo_finance.exception;

import lombok.Getter;

@Getter
public class CannotLoginException extends BusinessException {
  private int code;

  public CannotLoginException(ErrorCode errorCode) {
    super(errorCode);
    this.code=errorCode.getCode();
  }
  
}
