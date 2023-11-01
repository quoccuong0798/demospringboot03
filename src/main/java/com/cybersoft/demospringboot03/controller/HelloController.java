package com.cybersoft.demospringboot03.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Controller:  duùng để định nghĩa đường dẫn mà nội dung đường dẫn trả ra một trang html
 * @ResonseBody: Giúp cho @Controller có thể trả ra  kiểu String dùng để viết API
 *
 * RestController: là sự kết hợp của  @Controller và @ResponseBody=> viết API
 */

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("")
    public String hello() {
        return "Hello Springboot";
    }

    @GetMapping("/cybersoft")
    public String helloCybersoft() {
        return "Hello Cybersoft";
    }

}
