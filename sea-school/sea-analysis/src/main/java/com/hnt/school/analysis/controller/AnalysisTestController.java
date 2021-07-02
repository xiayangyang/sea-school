package com.hnt.school.analysis.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/analysisTest")
@RefreshScope
public class AnalysisTestController {

    @GetMapping("/hello")
    public String test(){
        System.out.println("===============");
        return "hello 我是analysis hello方法的fegin接口实现";
    }
}
