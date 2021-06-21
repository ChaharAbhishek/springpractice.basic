package com.spring.springpractice.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class one {

    @RequestMapping("/oneend1")    //end point
    public String hello()
    {
        return "Welcome to end point from oneend1 controller.";
    }
    @RequestMapping("/oneend2")
    public String hi()
    {
        return "Welcome to end point from oneend2 controller";
    }
}
