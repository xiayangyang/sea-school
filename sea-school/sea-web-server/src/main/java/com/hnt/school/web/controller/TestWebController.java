package com.hnt.school.web.controller;

import com.hnt.school.analysis.feign.TestAnalysisService;
import com.hnt.school.answer.feign.TestAnswerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/controller")
public class TestWebController {

    @Resource
    private TestAnalysisService testAnalysisService;

    @Resource
    private TestAnswerService testAnswerService;


    @GetMapping("test")
    public void test(){
        System.out.println(testAnalysisService.test1());
        System.out.println(testAnswerService.test1());
    }
}
