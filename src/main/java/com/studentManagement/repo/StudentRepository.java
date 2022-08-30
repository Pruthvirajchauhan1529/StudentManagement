package com.studentManagement.repo;

import com.studentManagement.entites.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
