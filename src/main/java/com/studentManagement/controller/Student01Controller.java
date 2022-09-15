package com.studentManagement.controller;

import com.studentManagement.entites.entite.Address01;
import com.studentManagement.entites.entite.Student01;
import com.studentManagement.services.Student01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    @GetMapping("/getall")
    public List<Student01> getAllStudent(){
        System.out.println("THis is my Get method");
        return student01Service.getAllStudent01();
    }
    @PutMapping("/")
    public Student01 updateStudent01(@RequestBody Student01 student01){
        return student01Service.updateStudent(student01);
    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Integer id){
        student01Service.deleteStudent(id);
    }
    @GetMapping("/name")
    public List<Student01> getNameStudent(@RequestParam String name){
        return student01Service.findByName(name);
    }
}
