package com.example.calculator.demo_sb_calculator.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.calculator.demo_sb_calculator.controller.BeanOperation;
import com.example.calculator.demo_sb_calculator.service.BeanService;


@Controller
@ResponseBody
public class BeanController implements BeanOperation {

  @Autowired
  private BeanService beanService;

  //Controller injection = IOC inversion of control !!!

  @Override
  public List<String> getBean() {
      //To list all Bean in Spring context!!!
      return beanService.getBean();
  }
  

 

}
