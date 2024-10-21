package com.demo.restapi.demo_rest_api.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {
  USER_ID_NOT_FOUND(1, "User ID Not Found."), //
  ;

  private int code;
  private String message;

  private ErrorCode(int code, String message) {
    this.code = code;
    this.message = message;
  }
}