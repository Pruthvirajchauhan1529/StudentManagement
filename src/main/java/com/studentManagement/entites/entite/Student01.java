package com.studentManagement.entites.entite;

import com.studentManagement.entites.Subject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

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

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "st_id")
    private List<Address01> address01;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "st_id")
    private List<Subject> subjects;

}
