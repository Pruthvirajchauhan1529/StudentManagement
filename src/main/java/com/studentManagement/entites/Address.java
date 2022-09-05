package com.studentManagement.entites;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.nio.channels.spi.SelectorProvider;

@Getter
@Setter
@Embeddable
public class Address {
    private String streetaddress;
    private String city;
    private String state;
    private String country;
    private String zipcode;
}
