package com.bootcamp.bc_yahoo_finance.config;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import com.bootcamp.bc_yahoo_finance.entity.StockEntity;
import com.bootcamp.bc_yahoo_finance.model.Mapper;
import com.bootcamp.bc_yahoo_finance.redis.RedisHelper;
import com.bootcamp.bc_yahoo_finance.service.StockSymbolService;

@Configuration
public class AppStartRunner implements CommandLineRunner {

  @Autowired
private StockSymbolService stockSymbolService;

  @Autowired
  private Mapper mapper;

  @Autowired
  private RedisHelper redisHelper;

  @Override
  public void run(String... args) throws Exception {
    this.stockSymbolService.deleteAll();
    System.out.println("Server Start...");
    System.out.println(" ");
    String[] stockList = new String[]{"9988.HK","2800.HK","0388.HK", "0700.HK" , "3988.HK"};  //"0005.HK", 
    List<StockEntity> stockEntityList = Arrays.stream(stockList)// 
    .map(s->mapper.map(s))//
    .collect(Collectors.toList());
    this.stockSymbolService.saveAll(stockEntityList);     // save to postgres
    // Redis
    redisHelper.set("STOCK-LIST", stockList, 86400);
    System.out.println("Server success saving stock symbols...");
    System.out.println(" ");
    System.out.println(" _+_+_+_+_+ _+_+_+_+_+ _+_+_+_+_+    _+_+_+_+_+   _+_+_+_+_+");
    System.out.println(" ");
  }

}
