package com.funci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"com.funci"})
public class ApplicationBootstrap extends SpringBootServletInitializer{

    public static void main(String[] args) {
       SpringApplication.run(ApplicationBootstrap.class, args);
     
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApplicationBootstrap.class);
    }
}
