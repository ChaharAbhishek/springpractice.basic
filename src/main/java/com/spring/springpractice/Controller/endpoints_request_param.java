package com.spring.springpractice.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class endpoints_request_param {
    @RequestMapping("/hello")
    public String hello(@RequestParam String mess)  //id is mess
    {
        return "Welcome to request parameter  "+mess;
    }
}
