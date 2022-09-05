package com.studentManagement.entites;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Getter
@Setter
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class CreditCard extends Payment {
    private String cardNumber;
}
