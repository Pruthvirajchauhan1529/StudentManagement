package com.studentManagement.services;

import com.studentManagement.entites.Student;

import java.util.List;

public interface StudentService {

    Student save(Student student);
    List<Student> getAllStudent();
     Student getFinById(int id);
     Student updateStudent(Student student);
     void deleteStudent(Integer id);

}
