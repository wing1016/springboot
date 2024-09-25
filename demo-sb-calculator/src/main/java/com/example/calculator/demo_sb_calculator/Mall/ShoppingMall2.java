package com.example.calculator.demo_sb_calculator.Mall;

import java.time.LocalDate;
import java.util.List;

public class ShoppingMall2 {

  String name;
  int area;
  Cinema cinema;
  List<String> shopCategory;

  static class Cinema { // no need to new a object, performance will faster!!!
    public String name;
    public LocalDate openDate;
    public List<Film> Films;

    static class Film {
      String name;
      LocalDate releaseDate;
    }
  }
}
