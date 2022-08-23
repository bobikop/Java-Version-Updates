package com.java14;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        var month =4;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("this month has 31 days");
                break;
            case 4:
            case 6:
            case 9:
                System.out.println("this month has 30 days");
                break;
            case 2:
                System.out.println("February can have 28 or 29 days");
                break;
            default:
                System.out.println("invalid month");
        }

        System.out.println("*******************");

        switch(month){
            case 1,3,5,7,8,10,12 -> System.out.println("This month has 31 days");
            case 4,6,9 -> System.out.println("This month has 30 days");
            case 2 -> System.out.println("This month has 328 or 29 days");
            default -> System.out.println("Invalid Months");
        }

        System.out.println("*******************");

        int day = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 4:
            case 6:
            case 9:
                day = 30;
                break;
            case 2:
                day = 28;
                break;
            default:
                throw new IllegalArgumentException("Invalid month");
        }


        int day1 = switch(month){
            case 1,3,5,7,8,10,12 -> 31;
            case 4,6,9 -> 30;
            case 2 -> 29;
            default -> 0;
        };

        System.out.println("*********************");













    }
}
