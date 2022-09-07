package com.studentManagement.entites;

import com.studentManagement.entites.entite.Student01;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sub_id")
    private Integer id;
    private String subName;

//    @ManyToOne
//    @JoinColumn(name = "st_id")
//    private Student01 student01;

}
