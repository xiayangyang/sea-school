package com.hnt.school.analysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.hnt.school.analysis.*"})
@EnableFeignClients(basePackages = {"com.hnt.school.analysis.feign"})
public class AnalysisApplication {

    public static void main( String[] args ) {
        SpringApplication.run(AnalysisApplication.class, args);
    }
}
