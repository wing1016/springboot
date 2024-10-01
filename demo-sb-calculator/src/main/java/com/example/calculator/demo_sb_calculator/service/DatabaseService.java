package com.example.calculator.demo_sb_calculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.calculator.demo_sb_calculator.model.Database;


//Controller call Service call Database
@Service    //Component -> bean
public class DatabaseService {


//@Autowired
//private DatabaseController DatabaseController   ( this will wait together forever!!! )
//Server never start    

    // no need to add "static" here , because spring always use same bean!!
    // so, instance method also no need to new many many object to call getString
    public static String getString(int index){
      return Database.getString(index);
    }

    public String addString(String s){
      return Database.addString(s);
    }

    public String getStringList(){
      return Database.getStringList();
    }

    public int getSize(){
      return Database.size();
    }
}


