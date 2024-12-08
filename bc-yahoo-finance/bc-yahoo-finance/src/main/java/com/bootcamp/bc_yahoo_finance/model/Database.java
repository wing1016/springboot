package com.bootcamp.bc_yahoo_finance.model;

import java.util.Arrays;

public class Database {

  private static String[] stocks = new String[]{"0388.HK","0700.HK"
  ,"0005.HK","2800.HK","9988.HK","1299.HK","0939.HK","1918.HK" };

  
  public static String getString(int index){
    return stocks[index];
  }

  public static int size(){
    return stocks.length;
  } 

    public static String getStringList(){
    return  Arrays.toString(stocks);
  }
  
}
