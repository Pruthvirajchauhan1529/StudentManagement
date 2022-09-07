package com.studentManagement.services.serviceimp;

import com.studentManagement.entites.entite.Student01;
import com.studentManagement.repo.Student01Repository;
import com.studentManagement.services.Student01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Student01ServiceImpl implements Student01Service {
    @Autowired
    Student01Repository student01Repository;
    @Override
    public Student01 addStudent(Student01 student01) {
        return student01Repository.save(student01);
    }

    @Override
    public Student01 updateStudent(Student01 student01) {
        return student01Repository.save(student01);
    }

    @Override
    public void deleteStudent(Integer id) {
        student01Repository.deleteById(id);
    }
}
