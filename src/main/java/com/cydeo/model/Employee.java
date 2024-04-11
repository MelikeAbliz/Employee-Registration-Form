package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDay;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private List<String> state;
    private String zip;


}
