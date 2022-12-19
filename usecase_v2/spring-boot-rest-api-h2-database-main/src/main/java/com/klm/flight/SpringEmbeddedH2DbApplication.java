package com.klm.flight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.klm.flight.controller","com.klm.flight.service"})
public class SpringEmbeddedH2DbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmbeddedH2DbApplication.class, args);
	}

}
