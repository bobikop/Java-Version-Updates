package com.cydeo.task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("Mike","Smith",35));
        users.add(new User("Nelsy","Archer",35));
        users.add(new User("Tom","Evan",35));

        // print all elements in the list

        printName(users, user -> true); // print everything when true
        // print all the people that last name starts with E

        printName(users,user -> user.getLastName().startsWith("E"));
    }
    //Write method here
    private static void printName(List<User> users, Predicate<User> p){
        for (User user : users){
            if (p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
