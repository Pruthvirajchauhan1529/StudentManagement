package com.studentManagement.services.serviceimp;

import com.studentManagement.dto.StudentDTO;
import com.studentManagement.entites.Student;
import com.studentManagement.repo.StudentRepository;
import com.studentManagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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
        List<Student> students;
        if(Objects.nonNull(studentDTO.getName())){
           students= studentRepository.findByName(studentDTO.getName());
           students.forEach(s-> System.out.println(s.getName()));
           return students;
        } else if (Objects.nonNull(studentDTO.getAge())) {
           students = studentRepository.findByAge(studentDTO.getAge());
           students.forEach(s-> System.out.println(s.getAge()));
           return students;
        } else if (Objects.nonNull(studentDTO.getMobile())) {
            students= studentRepository.findByMobile(studentDTO.getMobile());
           students.forEach(s-> System.out.println(studentDTO.getMobile()));
           return students;
        } else if (Objects.nonNull(studentDTO.getEmail())) {
            students = studentRepository.findByEmail(studentDTO.getEmail());
           return students;
        } else if (Objects.nonNull(studentDTO.getRollNumber())) {
           students = studentRepository.findByRollNumber(studentDTO.getRollNumber());
            return students;
        } else if (Objects.nonNull((studentDTO.getDate()))) {
            students = studentRepository.findByDate(studentDTO.getDate());
            return students;
        } else if (Objects.nonNull(studentDTO.getName())) {
            students = studentRepository.findByNameAndAge(studentDTO.getName(),studentDTO.getAge());
           return students;
        } else if (Objects.nonNull(studentDTO.getAge())) {
             students = studentRepository.findByAgeGreaterThan(studentDTO.getAge());
            students.forEach(s-> System.out.println(s.getAge()));
            return students;
        } //else if (Objects.nonNull(studentDTO.getName())) {
//            List<Student> students = studentRepository.findByNameContains(studentDTO.getName());
//            return students;
//       } 
        else if (Objects.nonNull(studentDTO.getAge())) {
             students = studentRepository.findByAgeBetween(studentDTO.getAge(),studentDTO.getAge());
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
//-------------------------------------------------------------------------------------------------------------------
        else if (Objects.nonNull(studentDTO.getPage())) {
            //Page<Student> student = studentRepository.findAll(PageRequest.of(studentDTO.getPage(),studentDTO.getSize()));
           Page<Student> students1= studentRepository.findAll(PageRequest.of(studentDTO.getPage(),studentDTO.getSize(), Sort.Direction.DESC, "name"));
            //student.forEach(s-> System.out.println(s.getName()));
            return students1.getContent();
            //return student1.getContent();
        } else if (Objects.nonNull(studentDTO.getOperation())) {
            students = studentRepository.findAll(Sort.by(studentDTO.getName()));
          // students.forEach(s-> System.out.println(s.getName()));
           return students;
        }
        System.out.println(studentDTO);
        return null;
    }

    @Override
    public List<Student> sortByField(String sort1, String sort2) {
       return studentRepository.findAll(Sort.by(Sort.Direction.DESC,sort1,sort2));
       //return studentRepository.findAll(Sort.by(Sort.Direction.DESC,field));
       // return studentRepository.findAll(Sort.by("name"));
    }
}
