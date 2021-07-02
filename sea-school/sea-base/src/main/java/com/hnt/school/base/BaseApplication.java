package com.hnt.school.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {"com.hnt.school.base.*"})
public class BaseApplication {
    public static void main( String[] args ) {
        SpringApplication.run(BaseApplication.class, args);
    }
}
