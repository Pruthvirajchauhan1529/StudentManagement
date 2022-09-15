package com.studentManagement.entites.entite;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Subject01 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

   /* @ManyToOne()
    @JoinColumn(name = "st_id")
    private Student01 student01;*/


   /* @JsonIgnore
    @ManyToMany(mappedBy = "subject01s")
    private List<Teacher01> teacher01s;*/

}
