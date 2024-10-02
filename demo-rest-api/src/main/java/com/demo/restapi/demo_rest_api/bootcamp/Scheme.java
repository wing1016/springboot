package com.demo.restapi.demo_rest_api.bootcamp;

import lombok.Getter;

@Getter
public enum Scheme {
  HTTP("http://"), HTTPS("https://");

  private String urlPrefix;

  private Scheme(String urlPrefix) {
    this.urlPrefix = urlPrefix;
  }
}
