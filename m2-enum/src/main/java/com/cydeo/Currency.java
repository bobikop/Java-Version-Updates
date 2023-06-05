package com.cydeo;

public enum Currency {
    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);  // this is objects of Currency, class ;

    // assigning value to constant
    int value;
    Currency(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    void method(){
        System.out.println(1);
    }
}
