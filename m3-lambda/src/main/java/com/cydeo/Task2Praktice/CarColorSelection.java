package com.cydeo.Task2Praktice;

public class CarColorSelection implements ChoseCar{

    @Override
    public boolean test(Car car) {
        return car.getColor().equals(Color.DARK);
    }
}
