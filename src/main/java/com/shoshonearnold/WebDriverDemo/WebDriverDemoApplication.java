package com.shoshonearnold.WebDriverDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class WebDriverDemoApplication {
	private static final Logger LOG = (Logger) LoggerFactory.getLogger(WebDriverDemoApplication.class);


	public static void main(String[] args) throws Exception {
		SpringApplication.run(WebDriverDemoApplication.class, args);

	}

}
