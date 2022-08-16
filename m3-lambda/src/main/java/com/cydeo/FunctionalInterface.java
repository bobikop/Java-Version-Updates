package com.cydeo;

import java.util.function.Predicate;

public class FunctionalInterface {
    public static void main(String[] args) {
        ApplePredicate al = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() >200;
            }
        };



        //***********************PREDICATE**********************//
        Predicate<Integer>  lesserThan = i -> i < 18;

        System.out.println(lesserThan.test(20));


        //***********************PREDICATE**********************//




    }
}
