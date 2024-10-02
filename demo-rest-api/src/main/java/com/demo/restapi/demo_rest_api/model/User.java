package com.demo.restapi.demo_rest_api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

  private Integer id;
  private String name;
  private String username;
  private String email;
  private Address address;
  private String phone;
  private String website;
  private Company company;

  @Getter
  @Setter
  public static class Address {
    public String street;
    public String suite;
    public String city;
    public String zipcode;
    public Geo geo;
    @Getter
    @Setter
    public static class Geo {
      public String lat;
      public String lng;
    }
  }

  @Getter
  @Setter
  public static class Company {
    public String name;
    public String catchPhrase;
    public String bs;
  }
}

// {
// "id": 1,
// "name": "Leanne Graham",
// "username": "Bret",
// "email": "Sincere@april.biz",
    // "address": {
    // "street": "Kulas Light",
    // "suite": "Apt. 556",
    // "city": "Gwenborough",
    // "zipcode": "92998-3874",
        // "geo": {
        // "lat": "-37.3159",
        // "lng": "81.1496"
        // }
    // },
// "phone": "1-770-736-8031 x56442",
// "website": "hildegard.org",
// "company": {
// "name": "Romaguera-Crona",
// "catchPhrase": "Multi-layered client-server neural-net",
// "bs": "harness real-time e-markets"
// }
