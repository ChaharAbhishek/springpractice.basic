package com.spring.springpractice.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculator {


    //with path variable
    @RequestMapping("/add/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b)
    {
        int sum = a + b;
        return "Addition is "+sum;
    }

    @RequestMapping("/divide/{a}/{b}")
    public int div(@PathVariable int a, @PathVariable int b)
    {
        int div = a / b;
        return div;
    }

    @RequestMapping("/multiply/{a}/{b}")
    public int mul(@PathVariable int a, @PathVariable int b)
    {
        int mul = a * b;
        return mul;
    }

    @RequestMapping("/subtract/{a}/{b}")
    public int sub(@PathVariable int a, @PathVariable int b)
    {
        int sub = a - b;
        return sub;
    }


    //with request param
    @RequestMapping("/add")
    public String addition(@RequestParam  int a, @RequestParam int b)
    {
            int sum=a+b;
            return "Addition is "+sum;
    }

    @RequestMapping("/subtract")
    public String subtract(@RequestParam  int a, @RequestParam int b)
    {
        int sub=a+b;
        return "Subtract is "+sub;
    }

    @RequestMapping("/multiply")
    public String multiply(@RequestParam  int a, @RequestParam int b)
    {
        int mul=a*b;
        return "Multiply is "+mul;
    }

    @RequestMapping("/divide")
    public String divide(@RequestParam  int a, @RequestParam int b)
    {
        int div=a/b;
        return "Divide  is "+div;
    }

}
