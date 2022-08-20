package com.cydeo.DishTask;


import com.cydeo.EmployeeTask.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Dish {


    private String name;
    private boolean vegetarian;
    private int calories;
    private Type type;
}
