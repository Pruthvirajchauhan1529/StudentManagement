package com.studentManagement.controller;

import com.studentManagement.entites.Teacher;
import com.studentManagement.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Component")
@RestController
public class TeacherController {

    @Autowired
    TeacherService teacherService;
    @PostMapping("/")
    public Teacher addTeacher(@RequestBody Teacher teacher){
        return teacherService.save(teacher);
    }
}
