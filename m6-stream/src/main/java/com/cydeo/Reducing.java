package com.cydeo;

import com.cydeo.DishTask.Dish;
import com.cydeo.DishTask.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

//        int sum = 0;
//        for(int number : numbers){
//            sum = sum + number;
//        }

        // above code down in functional programing way

        int result = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println(result);

        //REDUCE
        System.out.println("Dish calories total");
        int calTotal =  DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce((a,b) -> a+b).get();

        System.out.println(calTotal);

        //Mix and Min
        Optional<Integer> min = numbers.stream().reduce(Integer :: min);
        Optional<Integer> max = numbers.stream().reduce(Integer :: max);
        Optional<Integer> sum =numbers.stream().reduce(Integer :: sum);

        System.out.println("Min:" + min.get());
        System.out.println("Max:" + max.get());
        System.out.println("Sum:" + sum.get());


    }
}
