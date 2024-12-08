package com.demo.restapi.demo_rest_api.util;

import java.security.PrivateKey;

public enum SysCode {
  OK("000000", "Success"), FAIL("900000", "Fail"),;

  private String code;
  private String message;

  // sir
  private SysCode(String code, String message){
    this.code = code;
    this.message = message;
  }

  public String getCode(){
    return this.code;
  }

  public String getMessage(){
    return this.message;
  }

}
