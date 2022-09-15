package com.studentManagement.entites.entite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student01 {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer rollNumber;
    private String name;
    private Long age;
    private String email;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "st_id")
    //@BatchSize(size = 5)
    @Fetch(FetchMode.SELECT)
    private List<Address01> address01;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "st_id")
    @Fetch(FetchMode.SELECT)
    private List<Subject01> subjects;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   // @JoinColumn(name = "St_id")
    private Standard standard;



}
