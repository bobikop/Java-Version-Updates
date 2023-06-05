package com.cydeo;

public abstract class Player {

    // creating this class with purpuse of  holding user name
    private String name;

    public Player(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    // no setter here
}
