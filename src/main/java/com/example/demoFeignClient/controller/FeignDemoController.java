package com.example.demoFeignClient.controller;


import com.example.demoFeignClient.util.FeignServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class FeignDemoController {

    private final FeignServiceUtil feignServiceUtil;

    @Autowired
    public FeignDemoController(FeignServiceUtil feignServiceUtil) {
        this.feignServiceUtil = feignServiceUtil;
    }


    @GetMapping("/user-name")
    public String getUserName() {
        return feignServiceUtil.getName();
    }

    @GetMapping("/user-address")
    public String getUserAddress() {
        return feignServiceUtil.getCountry();
    }

    @GetMapping("/user-status")
    public String getUserStatus() {
        return feignServiceUtil.getStatus();
    }

}
