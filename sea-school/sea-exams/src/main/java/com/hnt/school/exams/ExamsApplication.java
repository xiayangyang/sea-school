package com.hnt.school.getaway.exams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {"com.hnt.school.exams.*"})
public class ExamsApplication {
    public static void main( String[] args ) {
        SpringApplication.run(ExamsApplication.class, args);
    }
}
