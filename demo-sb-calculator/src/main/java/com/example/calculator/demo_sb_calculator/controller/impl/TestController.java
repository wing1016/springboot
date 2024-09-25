package com.example.calculator.demo_sb_calculator.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.calculator.demo_sb_calculator.model.Book;


/*
 * Relationship between @Controller and @Autowired Spring will help validate if there is a bean for BookController if yes, Soring will create TestController bean. if no, Server start fail, because the
 * above validation fail.
 * 
 */


@Controller // @Controller , means this is bean
@ResponseBody
public class TestController {

  // 1. Field Injection ( modern style )
  // @Autowired //inject BookController object from Spring Context to this obj ref
  private BookController bookController; // Object reference ( not yet new a object )

  // TestController is depends on BookController !!!

  // 2. Constructor Injection ( Old style ) ( agent will go to Spring Context to find BookController Bean )
  @Autowired    //Unnecessary
  public TestController(BookController bc) {
    this.bookController = bc;
  }

  @GetMapping(value = "/test")
  public Book getBook() {
    return bookController.getBook(99, 100.9);
  }



}
