package com.example.calculator.demo_sb_calculator.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data   // if you dont want setter , dont use @Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@Getter       // server failed    getter is needed
//@Setter     not use by springboot
public class Bag {

  @JsonProperty(value = "b aBooks")     // change name in json!!!
  private List<Book> books;
  private Color color;

  public static enum Color{
    RED, YELLOW, BLUE;
  }
}
