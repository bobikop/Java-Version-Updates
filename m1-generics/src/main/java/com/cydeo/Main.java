package com.cydeo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Boban Milosevic");


        // withoiut generic <> ArrayList will accept any object which will be in conflict with implementation
        ArrayList<Integer> items = new ArrayList<Integer>();  //ArrayList only accepts objects belongs to Integer class

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
//      items.add("Apple");

        printDoubled(items);


        System.out.println("-------------------------------------------------------------------------------------");

        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<SoccerPlayer> liverpool = new Team("Liverpool"); //Team accepting any object

        // to do restriction and filter which plyer can be added in our specific team we use <>> generic

//      liverpool.addPlayer(joe);  // since we declare generic type those two players can not be added to soccer team
//      liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);

    }
    private static void printDoubled(ArrayList<Integer> items) {
        for(Integer i : items){
            System.out.println(i*2);
        }
    }
}
