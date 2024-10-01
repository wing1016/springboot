package com.example.calculator.demo_sb_calculator.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.calculator.demo_sb_calculator.controller.CatOperation;
import com.example.calculator.demo_sb_calculator.model.Cat;

@Controller
@ResponseBody
//@RequestMapping(value = "root")   // i make a mistake!!! fuck
public class CatController implements CatOperation {
    
  //@Qualifier(value = "Peter")
  @Autowired 
  private Cat cat;   // object address -> spring context's cat object

    @Override
    public String getCatName(){
      return this.cat.getName();
    }

    @Override
    public String updateCatName(String newName){
      this.cat.setName(newName);
      return "newName :" + newName;
    }
}
