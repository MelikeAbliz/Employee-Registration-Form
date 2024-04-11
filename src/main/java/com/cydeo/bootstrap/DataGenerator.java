package com.cydeo.bootstrap;

import com.cydeo.model.Employee;
import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataGenerator {
    public static List<String> createEmployeeState() {
        List<String> employeeState = Arrays.asList(
                        new Faker().address().state(),
                new Faker().address().state(),
                new Faker().address().state(),
                new Faker().address().state(),
                new Faker().address().state(),
                new Faker().address().state(),
                new Faker().address().state(),
                new Faker().address().state(),
                new Faker().address().state())
        ;
        return employeeState;

    }

}
