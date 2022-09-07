package com.studentManagement.entites;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Embeddable
public class Address {

    private String streetAddress;
    private String city;
    private String state;
    private String country;
    private String zipcode;

}
