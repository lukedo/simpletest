package com.example.demo.hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/user")
public class DemoController {

    @RequestMapping("hello")
    public String index(){
        return "hello world";
    }
}