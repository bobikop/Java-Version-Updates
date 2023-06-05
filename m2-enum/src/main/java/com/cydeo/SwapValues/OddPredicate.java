package com.cydeo.SwapValues;

public class OddPredicate implements UnaryPredicate<Integer>{
    // test method here implements logic to check if number is ood
    public boolean test(Integer obj) {
        return obj % 2 != 0; // return whatever is in parameter
    }
}
