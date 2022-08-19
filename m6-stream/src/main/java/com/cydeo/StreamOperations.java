package com.cydeo;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);
        // list.forEach(x -> System.out.println(x));
        // above line with double colon operator looks like
        // list.forEach(System.out :: println);

        //FILTER (filtering the stream) method
        System.out.println("----------------------------------------------------------------------------------------");
        list.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out :: println);

        System.out.println("----------------------------------------------------------------------------------------");

        //DISTINCT

       Stream<Integer> str = list.stream()
                .filter(i -> i % 2 == 0)
                .distinct();
       str.forEach(System.out::println); //Stream is closed here

        System.out.println("----------------------------------------------------------------------------------------");
        //limit

        list.stream()
                .filter(i -> i % 2 == 0)
                .limit(1)
                .forEach(System.out :: println);

        System.out.println("----------------------------------------------------------------------------------------");

        //skip
        list.stream()
                .filter(i -> i % 2 == 0)
                .skip(1)
                .forEach(System.out :: println);

        System.out.println("----------------------------------------------------------------------------------------");


    }
}
