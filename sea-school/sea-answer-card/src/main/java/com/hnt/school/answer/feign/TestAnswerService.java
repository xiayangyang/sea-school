package com.hnt.school.answer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "sea-answer-card")
public interface TestAnswerService {

    @GetMapping("/answerTest/hello")
    String test1();
}
