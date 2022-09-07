package com.studentManagement.controller;

import com.studentManagement.entites.entite.Student01;
import com.studentManagement.services.Student01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/My-Student01")
@RestController
public class Student01Controller {
    @Autowired
    Student01Service student01Service;
    @PostMapping("/")
    public String saveStudent01(@RequestBody Student01 student01){
         Student01 student011 = student01Service.addStudent(student01);
        return student011.getName();
    }
    @PutMapping("/")
    public Student01 updateStudent01(@RequestBody Student01 student01){
        return student01Service.updateStudent(student01);
    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Integer id){
        student01Service.deleteStudent(id);
    }
}
