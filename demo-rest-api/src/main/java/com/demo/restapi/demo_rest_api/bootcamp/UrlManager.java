package com.demo.restapi.demo_rest_api.bootcamp;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UrlManager {
  private Scheme scheme;
  private String domain;
  private String endpoint;

  @Override
  public String toString(){
    return  this.scheme.getUrlPrefix().concat(this.domain).concat(endpoint);
  //  return "https://".concat(this.domain).concat(endpoint);
  }
  
}
