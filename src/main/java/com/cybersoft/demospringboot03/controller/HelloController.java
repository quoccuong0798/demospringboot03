package com.cybersoft.demospringboot03.controller;

import com.cybersoft.demospringboot03.payload.request.LoginRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public String hello(@RequestParam String hoten,@RequestParam int tuoi) {

        return "Hello Springboot "+hoten +" "+tuoi;
    }

    @PostMapping("/cybersoft")
    public String helloCybersoft(@RequestBody LoginRequest loginRequest) {
        return "Hello Cybersoft: "+loginRequest.getUsername()+"-"+loginRequest.getPassword();
    }

    @PostMapping("/cuong")
    public String helloCuong(@RequestParam String hoten,@RequestParam String tuoi) {
        return "Hello Cường"+"-"+hoten+"-"+tuoi;
    }
    // tham số truyền trên trình duyệt, tham số truyền ngầm: @RequestParam
    // tham số đóng vai trò như một đường dẫn:@PathVariable
    // tham số là đối tuơng@RequestBody
    //formdata: tham số truyền ngam va cho phep truyen file len
    //form Url and code: không hỗ trợ truyền file

    //raw tham số truyền lên là đối tượng
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable int id) {
        return new ResponseEntity<>("Update "+id, HttpStatus.OK);

    }
}

