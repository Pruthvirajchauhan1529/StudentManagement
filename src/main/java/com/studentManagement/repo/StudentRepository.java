package com.studentManagement.repo;

import com.studentManagement.entites.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

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
//---------------------------------------JPQL---------------------------------------------------------------------
    @Query("from Student")
    List<Student> findAllStudent();
    @Query("from Student")
    List<Student> findAllStudents(Pageable pageable);
    @Query("select st.name,st.age,st.mobile from Student st")
    List<Object[]> findAllStudentPartialData();
    @Query("from Student where name =:stmark")
    List<Student> findAllStudentByName(@Param("stmark") String sname);
    @Query("from Student where mark> :min and mark< :max")
    List<Student> findStudentMarkBetween(@Param("min") Double min, @Param("max") Double max);
    @Modifying
    @Transactional
    @Query("delete from Student where roll_number = :sRollNumber")
    void deleteByRollNumber(@Param("sRollNumber") Integer roll);

//-------------------------------------Native Query-------------------------------------------------------------------------
    @Query(value = "select * from student", nativeQuery = true)
    List<Student> findAllStudentNQ();
    @Query(value = "select * from student where name=:stname", nativeQuery = true )
    List<Student> findByNameNQ(@Param("stname") String sname);

}
