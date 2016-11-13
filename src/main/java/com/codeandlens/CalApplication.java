package com.codeandlens;

import org.springframework.boot.*;
import org.springframework.boot.builder.*;
import org.springframework.boot.context.web.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class CalApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CalApplication.class, args);
                System.out.print("Hello Spring CAL");
	}
        
        @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
		return app.sources(CalApplication.class);
	}
}
