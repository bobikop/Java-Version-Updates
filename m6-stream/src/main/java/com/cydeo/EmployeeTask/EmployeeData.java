package com.cydeo.EmployeeTask;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100, "Mike","mike@cydeo.com", Arrays.asList("20245121478", "5716585235")),
        new Employee(500, "Ozzy","ozzy@cydeo.com", Arrays.asList("85236587412", "65874123652")),
        new Employee(520, "Peter","peter@cydeo.com", Arrays.asList("6541236547", "1597531478"))
        );
    }
}
