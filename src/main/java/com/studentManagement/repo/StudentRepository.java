package com.studentManagement.repo;

import com.studentManagement.entites.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findByName(String name);
    List<Student> findByAge(Long age);
    List<Student> findByMobile(Long mobile);
    List<Student> findByEmail(String email);
    List<Student> findByRollNumber(Integer rollNumber);
    List<Student> findByDate(Date date);
    List<Student> findByNameAndAge(String name, Long age);
    List<Student> findByAgeGreaterThan(Long age);
    List<Student> findByNameContains(String name);
    List<Student> findByAgeBetween(Long age, Long age1);
    List<Student> findByNameLike(String name);
    List<Student> findByRollNumberIn(List<Integer> rollNumber);


//    List<Student> findByAddressContains(String address);
//    List<Student> findByMarkGreaterThan(Double mark);
//    List<Student> findByMarkBetween(Double mark1, Double mark2);


}
