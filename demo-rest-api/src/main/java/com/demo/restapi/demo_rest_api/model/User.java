package com.demo.restapi.demo_rest_api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

  int id;
  String name;
  String username;
  String email;
  Address address;
  String phone;
  String website;
  Company company;

  @Getter
  @Setter
  static class Address {
    String street;
    String suite;
    String city;
    String zipcode;
    Geo geo;
    @Getter
    @Setter
    static class Geo {
      String lat;
      String lng;
    }
  }

  @Getter
  @Setter
  static class Company {
    String name;
    String catchPhrase;
    String bs;
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
