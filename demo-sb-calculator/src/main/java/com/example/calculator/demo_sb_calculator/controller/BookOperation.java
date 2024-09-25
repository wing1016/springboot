package com.example.calculator.demo_sb_calculator.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.calculator.demo_sb_calculator.model.Bag;
import com.example.calculator.demo_sb_calculator.model.Book;

public interface BookOperation {
  
 @GetMapping(value = "/book/{id}/{price}")
  public Book getBook(@PathVariable int id, @PathVariable double price) ;

  //   http://localhost:8080/root/book?id=11&price=10.99
  @GetMapping(value = "/book")
  public Book getBook2(@RequestParam(value = "a") int id, @RequestParam(value = "b") double price);

  @GetMapping(value = "/books")
  public List<Book> getBooks() ;

  @GetMapping(value = "/books2")
  public Set<Book> getBookss() ;

  // return a hashMap
  @GetMapping(value = "/map") // bookmap book-map book/map camelCase is not good bookMap << cannot!!!
  public HashMap<Integer, Book> getBookMap();


  // return book array
  @GetMapping(value = "/bookarray")
  public Book[] getBookArray();

    //  
    @GetMapping(value = "/bag")
    public Bag getBag();
  

}
