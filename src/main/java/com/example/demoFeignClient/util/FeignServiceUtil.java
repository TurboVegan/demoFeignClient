package com.example.demoFeignClient.util;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "feignDemo", url = "http://localhost:8084/user")
public interface FeignServiceUtil {


    @GetMapping("/name")
    String getName();

    @GetMapping("/country")
    String getCountry();

    @GetMapping("/status")
    String getStatus();
}
