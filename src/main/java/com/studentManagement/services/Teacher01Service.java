package com.studentManagement.services;

import com.studentManagement.entites.entite.Teacher01;

import java.util.List;

public interface Teacher01Service {

    Teacher01 addTeacher(Teacher01 teacher01);

    List<Teacher01> findByName(String name);

    List<Teacher01> getAllStudent();
}
