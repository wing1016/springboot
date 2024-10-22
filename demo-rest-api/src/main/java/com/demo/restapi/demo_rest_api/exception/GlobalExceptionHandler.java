package com.demo.restapi.demo_rest_api.exception;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// 1. -> Method A -> Method B -> Method C -> return object to B -> return object
// to A
// 2. -> Method A -> Method B -> Method C -> throw exception -> B handle
// exception ...

@RestControllerAdvice // bean
public class GlobalExceptionHandler {
  // try to catch BusinessException
  @ExceptionHandler(BusinessException.class)
  public ErrorResponse bussinessExceptionHandler(BusinessException e) {
    return ErrorResponse.builder() //
        .code(e.getCode()) //
        .message(e.getMessage()) //
        .build();
  }

  // public GeneralResponse<void> exceptionHandler(Exception e) {

  @ExceptionHandler(Exception.class)
  public GeneralResponse<Object> exceptionHandler(Exception e) {
    return GeneralResponse.<Object>builder() //
        .code("900000") //
        .message("Fail.") //
        .data(new ArrayList<>()) //
        .build();
  }

}
