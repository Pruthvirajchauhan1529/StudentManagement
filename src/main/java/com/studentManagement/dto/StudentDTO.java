package com.studentManagement.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@ToString
@Getter
@Setter
public class StudentDTO {

    private Integer rollNumber;
    private String name;
    private Long age;
    private Date date;
    private Long mobile;
    private String email;
    private String operation;
    private Integer size;
    private Integer page;
}
