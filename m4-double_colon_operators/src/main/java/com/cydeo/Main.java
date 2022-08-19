package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

//       Predicate<Integer> pred = (p) -> p % 2 == 0 ? true :false;


         Calculate sum = (x,y) -> System.out.println(x+y);  // lambda


        Calculate s1 = (x,y) -> Calculator.findSum(x,y); //  method name and implementation

        // reference to a Static Method
        Calculate s2 = Calculator :: findSum; //  ::

        s2.calculate(2,8);

        //Reference to instance method

        Calculator obj = new Calculator();
        Calculate c3 = obj :: findMultiply;


        Calculate s4 = new Calculator() :: findMultiply;

        BiFunction<String, Integer,String> func = (str,i) ->  str.substring(i);

        BiFunction<String, Integer,String> func2 = (str,i) -> str.substring(i);

        Function<Integer,Double> b = new MyClass() :: method;

        BiFunction<MyClass,Integer,Double> b1 = MyClass :: method;

        System.out.println("Second hour of class ---------------------------------------");

        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display2 = System.out :: println;



    }
}
