package com.sartorial.stockmarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//TODO: Update application.properties for PostgreSQL integration
@SpringBootApplication
public class StockmarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockmarketApplication.class, args);
	}

}
