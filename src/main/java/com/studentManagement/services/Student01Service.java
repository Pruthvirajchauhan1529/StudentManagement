package com.studentManagement.services;

import com.studentManagement.entites.entite.Student01;

public interface Student01Service {

    Student01 addStudent(Student01 student01);

    Student01 updateStudent(Student01 student01);

    void deleteStudent(Integer id);
}
