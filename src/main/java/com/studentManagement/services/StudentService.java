package com.studentManagement.services;

import com.studentManagement.dto.StudentDTO;
import com.studentManagement.entites.Student;

import java.util.List;

public interface StudentService {

    Student save(Student student);
    List<Student> getAllStudent();
     Student getFinById(int id);
     Student updateStudent(Student student);
     void deleteStudent(Integer id);

     //-----------------------------------------------------------------------------------------------

    List<Student> search(StudentDTO studentDTO);
    List<Student> sortByField(String sort1, String sort2);



//      List<Student> findByName(String name);
//    List<Student> findByNameAndMark(String name, Double mark);
//    List<Student> findByAddressContains(String address);
//    List<Student> findByGreaterThan(Double mark);
//    List<Student> findByMarkBetween(Double mark1, Double mark2);

}
