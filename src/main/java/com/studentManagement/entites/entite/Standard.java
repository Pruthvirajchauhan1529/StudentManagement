package com.studentManagement.entites.entite;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Standard {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;
    private Long standard;

    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "st_id")
    private Student01 student01;*/
}
