package com.rookies3.myspringbootlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringbootLabApplication {

	public static void main(String[] args) {
//		SpringApplication.run(MySpringbootLabApplication.class, args);
		SpringApplication application = new SpringApplication(MySpringbootLabApplication.class);
		application.setWebApplicationType(WebApplicationType.SERVLET);

		application.run (args);
	}

}
