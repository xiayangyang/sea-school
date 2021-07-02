package com.hnt.school.answer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.hnt.school.answer"})
@EnableFeignClients(basePackages = {"com.hnt.school.answer.feign"})
public class AnswerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(AnswerApplication.class, args);
    }
}
