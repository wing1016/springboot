package com.demo.restapi.demo_rest_api.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerConfig {

  //uncomment to try below
  //  @Scheduled(fixedDelay = 5000) // 5000ms = 5 secs
  public void sayHello() throws Exception {
    System.out.println("Task A : Hello world. Start time = " + System.currentTimeMillis());
    Thread.sleep(2000);
    System.out.println("Task A : Hello world.   End time = " + System.currentTimeMillis());

  }
  //uncommand to try below 
 // @Scheduled(fixedRate = 3000)   // only 1 thread, So need to wait task end first
  public void sayBye() throws Exception {
    System.out.println("Task B : Bye Bye. start time = " + System.currentTimeMillis());
    Thread.sleep(4000);
    System.out.println("Task B : Bye Bye.   End time = " + System.currentTimeMillis());
  }

  @Scheduled(cron = "0 58 20 * * TUE")
  public void runTask(){
    System.out.println("cronjob test");
  }
}
