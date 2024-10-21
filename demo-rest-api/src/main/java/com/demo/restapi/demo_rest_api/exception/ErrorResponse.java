package com.demo.restapi.demo_rest_api.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Builder
@AllArgsConstructor
public class ErrorResponse {
  private int code;
  private String message;
}