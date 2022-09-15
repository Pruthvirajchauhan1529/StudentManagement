package com.studentManagement.services.serviceimp;

import com.studentManagement.entites.entite.Teacher01;
import com.studentManagement.repo.Teacher01Repository;
import com.studentManagement.services.Teacher01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Teacher01ServiceImpl implements Teacher01Service {
    @Autowired
    Teacher01Repository teacher01Repository;
    @Override
    public Teacher01 addTeacher(Teacher01 teacher01) {
        return teacher01Repository.save(teacher01);
    }
    @Override
    public List<Teacher01> getAllStudent() {
        return teacher01Repository.findAll();
    }
    @Override
    public List<Teacher01> findByName(String name) {
        return teacher01Repository.findByname(name);
    }
}
