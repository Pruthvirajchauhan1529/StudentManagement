package com.studentManagement.entites.entite;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
public class Address01 {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
//    @Column(name = "add_id")
    private Integer id;
    private String streetAddress;
    private String city;
    private String state;
    private String country;
    private String zipcode;

//    @ManyToOne
//    @JoinColumn(name = "st_id")
//    private Student01 student01;
//    @ManyToOne
//    private Student01 student02;

}
