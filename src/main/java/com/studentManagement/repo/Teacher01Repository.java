package com.studentManagement.repo;

import com.studentManagement.entites.entite.Teacher01;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Teacher01Repository extends JpaRepository<Teacher01, Integer> {
    List<Teacher01> findByname(String name);
}
