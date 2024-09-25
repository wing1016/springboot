package com.example.calculator.demo_sb_calculator.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.calculator.demo_sb_calculator.controller.DatabaseOperation;
import com.example.calculator.demo_sb_calculator.service.DatabaseService;

@Controller
@Component // this is no need
@ResponseBody
public class DatabaseController implements DatabaseOperation {

  @Autowired
  private DatabaseService databaseService;

  // Task get all strings from the array

  @Override
  public String getString(int index) {
    boolean isIndexValid = true;
    int idx = -1;

    // sir version
    try {

      return databaseService.getString(index);
    } catch (NumberFormatException e) {

      return "Invalid index, please input again";
    }

  }

  @Override
  public String addString(String newString) {
    return databaseService.addString(newString);
  }

  @Override
  public String getStringList() {
    return databaseService.getStringList();
  }

}
