package com.bootcamp.bc_yahoo_finance.infra.yahoofinance;

import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.bootcamp.bc_yahoo_finance.util.Scheme;

/*
 * 1. https://fc.yahoo.com -> get the Cookie
 *
 * 2.https://query1.finance.yahoo.com/v1/test/getcrumb -> get crumb return String
 * 
 * 3.https://query1.finance.yahoo.com/v7/finance/quote?symbols={symbols}&crumb={your_crumb}
 */
public class CookieManager {
  private RestTemplate restTemplate;

  public CookieManager(RestTemplate restTemplate){
    this.restTemplate=restTemplate;
  }

  public String getCookie() {
    try {
      String cookieUrl = UriComponentsBuilder.newInstance()//
          .scheme(Scheme.HTTPS.name().toLowerCase())//
          .host(YahooFinance.DOMAINE)//
          .toUriString();
      ResponseEntity<String> entity =
          restTemplate.getForEntity(cookieUrl, String.class);
      List<String> cookies = entity.getHeaders().get("Set-Cookie");

      return cookies != null ? cookies.get(0).split(";")[0] : null;
    } catch (RestClientException e) {
      if (e instanceof HttpStatusCodeException) {
        HttpHeaders headers =
            ((HttpStatusCodeException) e).getResponseHeaders();
        if (headers != null) {
          List<String> cookies = headers.get("Set-Cookie");
          return cookies != null ? cookies.get(0).split(";")[0] : null;
        }
      }
    }
    return null;
  }
}
