package com.studentManagement.controller;

import com.studentManagement.entites.entite.Teacher01;
import com.studentManagement.services.Teacher01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/My-Teacher")
@RestController
public class Teacher01Controller {
    @Autowired
    Teacher01Service teacher01Service;

    @PostMapping("/")
    public String addTeacher(@RequestBody Teacher01 teacher01){
        Teacher01 teacher011 = teacher01Service.addTeacher(teacher01);
        return teacher011.getName();
    }
    @GetMapping("/")
    public List<Teacher01> getAllTeacher(){
        return teacher01Service.getAllStudent();
    }
    @GetMapping("/name")
    public List<Teacher01> getTeacherName(@RequestParam String name){
        return teacher01Service.findByName(name);
    }
}
