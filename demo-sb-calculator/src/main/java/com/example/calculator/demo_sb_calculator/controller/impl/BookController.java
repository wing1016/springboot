package com.example.calculator.demo_sb_calculator.controller.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.calculator.demo_sb_calculator.controller.BookOperation;
import com.example.calculator.demo_sb_calculator.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@ResponseBody
@RequestMapping(value = "root")
public class BookController implements BookOperation {

 
  public Book getBook(@PathVariable int id, @PathVariable double price) {
    return new Book(id, price);
  }

  //   http://localhost:8080/root/book?id=11&price=10.99
  
  public Book getBook2(@RequestParam(value = "a") int id, @RequestParam(value = "b") double price) {
    return new Book(id, price);
  }

  
  public List<Book> getBooks() {
    return List.of(new Book(1, 10.3), new Book(2, 99.3));
  }

   
  public Set<Book> getBookss() {
    return Set.of(new Book(1, 10.3), new Book(2, 99.3), new Book(3, 44.3));
  }

  // return a hashMap
   // bookmap book-map book/map camelCase is not good bookMap << cannot!!!
  public HashMap<Integer, Book> getBookMap() {

    HashMap<Integer, Book> bookMap = new HashMap<>();
    bookMap.put(100, new Book(1, 10.3));
    bookMap.put(200, new Book(2, 20.3));
    bookMap.put(300, new Book(3, 30.3));

    return bookMap;
  }


  // return book array
   
  public Book[] getBookArray() {
    return new Book[] {new Book(1, 456.3), new Book(2, 789.3)};
  }


}
