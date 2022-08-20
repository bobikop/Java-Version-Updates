package com.cydeo.EmployeeTask;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {



        //Print all emails
        System.out.println("Print all emails");
         EmployeeData.readAll()
       //        .map(employee -> employee.getEmpEmail()) // with lambda
                 .map(Employee :: getEmpEmail)// with ::
                 .forEach(System.out :: println);


        // print all phone numbers
        System.out.println("Print all phone numbers");

        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumber().stream())
                .forEach(System.out :: println);

        System.out.println("Print all phone numbers with double colon");

        EmployeeData.readAll()
                .map(Employee :: getEmpPhoneNumber)
                .flatMap(List::stream )
                .forEach(System.out :: println);

    }
}
