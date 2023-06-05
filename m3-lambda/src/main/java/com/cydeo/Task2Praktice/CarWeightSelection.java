package com.cydeo.Task2Praktice;

public class CarWeightSelection implements ChoseCar{

    @Override
    public boolean test(Car car) {
        return car.getWeight()>1000;
    }
}
