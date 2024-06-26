package com.cydeo.bootstrap;

import com.cydeo.model.Employee;
import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataGenerator {
    public static List<String> createEmployeeState() {
        List<String> stateList = Arrays.asList(
                "Alaska",
                "Alabama",
                "Arkansas",
                "Arizona",
                "California",
                "Colorado",
                "Connecticut",
                "Delaware",
                "Florida",
                "Georgia",
                "Hawaii",
                "Iowa",
                "Idaho",
                "Illinois",
                "Indiana",
                "Kansas",
                "Kentucky",
                "Louisiana",
                "Massachusetts",
                "Maryland",
                "Maine",
                "Michigan",
                "Minnesota",
                "Missouri",
                "Mississippi",
                "Montana",
                "NorthCarolina",
                "NorthDakota",
                "Nebraska",
                "NewHampshire",
                "NewJersey",
                "NewMexico",
                "Nevada",
                "NewYork",
                "Ohio",
                "Oklahoma",
                "Oregon",
                "Pennsylvania",
                "RhodeIsland",
                "SouthCarolina",
                "SouthDakota",
                "Tennessee",
                "Texas",
                "Utah",
                "Virginia",
                "Vermont",
                "Washington",
                "Wisconsin",
                "WestVirginia",
                "Wyoming");
        return stateList;
    }
//    public static List<String> createEmployeeState() {
//        List<String> employeeState = Arrays.asList(
//                        new Faker().address().state(),
//                new Faker().address().state(),
//                new Faker().address().state(),
//                new Faker().address().state(),
//                new Faker().address().state(),
//                new Faker().address().state(),
//                new Faker().address().state(),
//                new Faker().address().state(),
//                new Faker().address().state())
//        ;
//        return employeeState;
//
//    }

}
