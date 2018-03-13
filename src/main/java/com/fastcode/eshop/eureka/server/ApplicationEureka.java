package com.fastcode.eshop.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class ApplicationEureka 
{
    public static void main( String[] args )
    {
        SpringApplication.run(ApplicationEureka.class, args);
        
    }
}
