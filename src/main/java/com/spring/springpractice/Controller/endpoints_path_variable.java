package com.spring.springpractice.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class endpoints_path_variable {
    //endpoints with path variable
    @RequestMapping("/greeting/{message}")
    public String greeting(@PathVariable String message){
        /*
        String greeting="Path variable accepted in this method -----> "+message;
        return greeting;
        */
        return "Path variable accepted in method -----> "+message;
    }

    @RequestMapping("/sum/{a}/{b}")
    public int add(@PathVariable int a,@PathVariable int b){
        int sum=a+b;
        return sum;
    }
}
