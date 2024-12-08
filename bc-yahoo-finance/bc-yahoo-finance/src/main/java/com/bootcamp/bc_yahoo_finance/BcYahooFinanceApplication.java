package com.bootcamp.bc_yahoo_finance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import com.bootcamp.bc_yahoo_finance.model.Database;


@SpringBootApplication
@EnableScheduling
public class BcYahooFinanceApplication {

	// @Autowired
	// static
	// Database database;
	public static void main(String[] args) {
		SpringApplication.run(BcYahooFinanceApplication.class, args);

	//System.err.println(" Server started ...  " + Database.getStringList());

	}
}
