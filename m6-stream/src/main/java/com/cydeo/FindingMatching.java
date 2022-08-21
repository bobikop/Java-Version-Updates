package com.cydeo;

import com.cydeo.DishTask.Dish;
import com.cydeo.DishTask.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {
    public static void main(String[] args) {

        //ALL MATCH
        // System.out.println("ALL MATCH");
        boolean isHealthy =  DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);// predicate lambda
        System.out.println(isHealthy);

        System.out.println("ANY MATCH");
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }


        System.out.println("NONE MATCH");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 100);
        System.out.println(isHealthy2);


        System.out.println("FIND ANY");
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());


        System.out.println("FIND FIRST");
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish.get());


        //PARALLEL STREAMS (Async)
        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());

        List<String> list1 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");
        List<String> list2 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");

//      Optional<String> findFirst = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
//      Optional<String> findAny = list2.parallelStream().filter(s -> s.startsWith("J")).findAny();

        Optional<String> findFirst = list1.stream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny = list2.stream().filter(s -> s.startsWith("J")).findAny();

        System.out.println(findFirst);
        System.out.println(findAny);



        //MIN AND MAX
        Optional<Dish> dishMinimum = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories)); // comparing accept function as a parameter
        System.out.println(dishMinimum.get());

        Optional<Dish> dishMaximum = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories)); // comparing accept function as a parameter
        System.out.println(dishMaximum.get());

        //REDUCE
        System.out.println("Dish calories total");
       int calTotal =  DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce((a,b) -> a+b).get();
        System.out.println(calTotal);

    }

}
