package com.hnt.school.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {"com.hnt.school.*"},exclude = {DataSourceAutoConfiguration.class})
public class WebApplication {
    public static void main( String[] args ) {
        SpringApplication.run(WebApplication.class, args);
    }
}
