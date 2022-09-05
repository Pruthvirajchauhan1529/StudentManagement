package com.studentManagement.entites;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Teacher {
    @Id
    private Integer id;
    private String name;
    private String subject;
    @Embedded
    private Address address;
}