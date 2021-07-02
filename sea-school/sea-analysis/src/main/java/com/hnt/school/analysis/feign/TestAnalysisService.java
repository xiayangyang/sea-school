package com.hnt.school.analysis.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "sea-analysis")
public interface TestAnalysisService {

    @GetMapping("/analysisTest/hello")
    String test1();
}
