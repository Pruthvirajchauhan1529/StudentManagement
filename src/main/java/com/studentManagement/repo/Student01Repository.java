package com.studentManagement.repo;

import com.studentManagement.entites.entite.Student01;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Student01Repository extends JpaRepository<Student01, Integer> {
  //  @Query(value = "select s from Student01 s left join fetch s.address01, s.subject01")
    @Query(value = "SELECT DISTINCT s FROM Student01 s JOIN FETCH s.address01")
    List<Student01> findAllStudent01();
 //   @Query(value = "select * from Student01 where name=?")
    //@EntityGraph(attributePaths = { "address01", "subjects" })
    List<Student01> findByName(String name);

}
