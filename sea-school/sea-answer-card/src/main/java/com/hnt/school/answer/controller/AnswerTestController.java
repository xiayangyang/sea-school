package com.hnt.school.answer.controller;


import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/answerTest")
@RefreshScope
public class AnswerTestController {
    @GetMapping("/hello")
    public String test(){
        System.out.println("===============");
        return "hello answer hello方法的fegin接口实现";
    }

}
