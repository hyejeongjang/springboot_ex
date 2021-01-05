package com.springboot_ex.web;
import  org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello") // /hello로 요청이 오면 문자열을 반환한다.
    public String hello(){
        return "hello";
    }
}
