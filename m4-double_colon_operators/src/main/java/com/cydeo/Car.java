package com.cydeo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private String name;
    private int model;

    public Car(int model) {
        this.model = model;
    }

}
