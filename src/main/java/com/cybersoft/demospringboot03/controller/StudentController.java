package com.cybersoft.demospringboot03.controller;

import com.cybersoft.demospringboot03.payload.request.StudentRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    List<StudentRequest> list = new ArrayList<>();

    @PostMapping("")
    public ResponseEntity<?> inserPost(StudentRequest student) {
        list.add(student);
        return new ResponseEntity<>(list, HttpStatus.OK);

    }
    @GetMapping("/body")
    public ResponseEntity<?> insertBody(@RequestBody StudentRequest studentRequest) {
        list.add(studentRequest);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping("  /{name}/{age}")
    public ResponseEntity<?> insertPath(@PathVariable String name,@PathVariable int age ) {
        StudentRequest studentRequest= new StudentRequest();
        studentRequest.setAge(age);
        studentRequest.setName(name);
        list.add(studentRequest);
        return new ResponseEntity<>(list, HttpStatus.OK);

    }
}
