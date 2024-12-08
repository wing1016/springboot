package com.bootcamp.bc_yahoo_finance.exception;

import lombok.Getter;

@Getter
public class UserNotExistException extends BusinessException {

  private int code;

  public UserNotExistException(ErrorCode errorCode) {
    super(errorCode);
    this.code=errorCode.getCode();
  }
}
