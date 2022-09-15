package com.studentManagement.entites.entite;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Teacher01 {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "Teachers01_Subjects01",
            joinColumns = @JoinColumn(name = "T_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "sub_id", referencedColumnName = "id"))
    private List<Subject01> subject01s;
}
