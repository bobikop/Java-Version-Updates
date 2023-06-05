package com.cydeo.Task2Praktice;

import com.cydeo.Apple;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {



        List<Car> inventory = new ArrayList();
        inventory.add(new Car(1020, Color.DARK));
        inventory.add(new Car(900, Color.DARK));
        inventory.add(new Car(900, Color.DARK));
        inventory.add(new Car(900, Color.LIGHT));


        System.out.println(inventory); // printing all

        inventory.forEach(car -> System.out.println(car)); // printing all


        CarColorSelection color = new CarColorSelection();
        List<Car> darkColoredCar =  filterCars(inventory, new CarColorSelection());
        System.out.println(darkColoredCar);


        ChoseCar colorOfCars = car -> car.getColor().equals(Color.DARK);
        filterCars(inventory,colorOfCars);


    }


    public static List<Car> filterCars (List<Car> inventory, ChoseCar choseCar){

        List<Car> result = new ArrayList<>();

        for (Car car : inventory){
            if (choseCar.test(car)){
                result.add(car);
            }
        }

        return result;
    }
}
