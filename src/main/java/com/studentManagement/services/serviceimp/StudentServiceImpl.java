package com.studentManagement.services.serviceimp;

import com.studentManagement.dto.StudentDTO;
import com.studentManagement.entites.Student;
import com.studentManagement.repo.StudentRepository;
import com.studentManagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getFinById(int id) {
        Student student=studentRepository.findById(id).get();
        return student;
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

//-------------------------------------------------------------------------------------------------------------

    @Override
    public List<Student> search(StudentDTO studentDTO) {
        if(Objects.nonNull(studentDTO.getName())){
           List<Student> students= studentRepository.findByName(studentDTO.getName());
           students.forEach(s-> System.out.println(s.getName()));
           return students;
        } else if (Objects.nonNull(studentDTO.getAge())) {
           List<Student> students = studentRepository.findByAge(studentDTO.getAge());
           students.forEach(s-> System.out.println(s.getAge()));
           return students;
        } else if (Objects.nonNull(studentDTO.getMobile())) {
           List<Student> students= studentRepository.findByMobile(studentDTO.getMobile());
           students.forEach(s-> System.out.println(studentDTO.getMobile()));
           return students;
        } else if (Objects.nonNull(studentDTO.getEmail())) {
           List<Student> students = studentRepository.findByEmail(studentDTO.getEmail());
           return students;
        } else if (Objects.nonNull(studentDTO.getRollNumber())) {
            List<Student> students = studentRepository.findByRollNumber(studentDTO.getRollNumber());
            return students;
        } else if (Objects.nonNull((studentDTO.getDate()))) {
            List<Student> students = studentRepository.findByDate(studentDTO.getDate());
            return students;
        } else if (Objects.nonNull(studentDTO.getName())) {
           List<Student> students = studentRepository.findByNameAndAge(studentDTO.getName(),studentDTO.getAge());
           return students;
        } else if (Objects.nonNull(studentDTO.getAge())) {
            List<Student> students = studentRepository.findByAgeGreaterThan(studentDTO.getAge());
            return students;
        } //else if (Objects.nonNull(studentDTO.getName())) {
//            List<Student> students = studentRepository.findByNameContains(studentDTO.getName());
//            return students;
//       } 
        else if (Objects.nonNull(studentDTO.getAge())) {
            List<Student> students = studentRepository.findByAgeBetween(studentDTO.getAge(),studentDTO.getAge());
            return students;
        }
//        else if (Objects.nonNull(studentDTO.getName())) {
//           List<Student> students = studentRepository.findByNameLike(studentDTO.getName());
//           return students;
//        }
//        else if (Objects.nonNull(studentDTO.getRollNumber())) {
//            List<Student> students = studentRepository.findByRollNumberIn(Collections.singletonList(studentDTO.getRollNumber()));
//            return students;
//        }
        System.out.println(studentDTO);
        return null;
    }
}
