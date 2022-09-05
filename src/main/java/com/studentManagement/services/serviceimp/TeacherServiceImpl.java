package com.studentManagement.services.serviceimp;

import com.studentManagement.entites.Teacher;
import com.studentManagement.repo.TeacherRepository;
import com.studentManagement.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherRepository teacherRepository;
    @Override
    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
