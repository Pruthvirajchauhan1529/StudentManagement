package com.studentManagement.controller;


import com.studentManagement.dto.StudentDTO;
import com.studentManagement.entites.Student;
import com.studentManagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/My-Student")
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/")
    public String save(@RequestBody Student student){
       Student student1 = studentService.save(student);
        return student1.getName();
    }
    @GetMapping("/")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @GetMapping("/{id}")
    public Student getFindById(@PathVariable Integer id){
        return studentService.getFinById(id);
    }
    @PutMapping("/")
    public Student updateStudent(@RequestBody Student student){
         Student student1 = studentService.save(student);
         return student1;
    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);
    }

//------------------------------------------------------------------------------------------------------------
    @PostMapping("/search")
    public List<Student> search(@RequestBody StudentDTO studentDTO){
        return studentService.search(studentDTO);
    }
    @GetMapping("/sort")
    public List<Student> sortByName(@RequestParam String field1, @RequestParam String field2){
        return studentService.sortByField(field1,field2);
        //return studentService.sortByField();
    }
//----------------------------------------JPQL--------------------------------------------------------------
    @GetMapping("/jpql")
    public List<Student> allStudent(){
        return studentService.findAllStudent();
    }
    @GetMapping("/jpql2")
    public List<Object[]> someStudentData(){
        return studentService.findAllStudentPartialData();
    }
    @GetMapping("/jpql3")
    public List<Student> findByStudentName(@RequestParam String name){
        return studentService.findAllStudentByName(name);
    }
    @GetMapping("/jpql4")
    public List<Student> findStudentMarkBetween(@RequestParam Double mark1, Double mark2){
        return studentService.findByMarkBetween(mark1,mark2);
    }
    @DeleteMapping("/jpql5/{roll}")
    public void deleteByRollNumber(@PathVariable Integer roll){
        studentService.deleteByRollNumber(roll);
    }
    @GetMapping("/jpql6/")
    public List<Student> findPageAndSize(@RequestParam Integer page, Integer size, String name){
        return studentService.findPageAndSize(page,size,name);
    }

//---------------------------------------Native------------------------------------------------------------------------
    @GetMapping("/NQ")
    public List<Student> findAllStudentNQ(){
        return studentService.findAllStudentNQ();
    }
    @GetMapping("/NQ/name")
    public List<Student> findByNameNQ(@RequestParam String name){
        return studentService.findByNameNQ(name);
    }
}
