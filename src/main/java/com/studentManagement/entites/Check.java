package com.studentManagement.entites;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "bankcheck")
@PrimaryKeyJoinColumn(name="id")
public class Check extends Payment{
    private String checkNumber;
}
