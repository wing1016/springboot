package com.example.calculator.demo_sb_calculator.model;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Database {


  // Final array only, not final the element inside the array
  private static String[] strings = new String[]{"abc","def","xyz" };
  //delete "final"

  public static String getString(int index){
    return strings[index];
  }

  //sir
  public static int size(){
    return strings.length;
  } 

  /// !!!Arrays.copyOf 
  public static String addString(String newString){
    String[] newArray = Arrays.copyOf(strings, strings.length + 1);
    newArray[newArray.length - 1] = newString;
    strings = newArray;
    return newString;
  }

  public static String getStringList(){
    return  Arrays.toString(strings);
  }

}
