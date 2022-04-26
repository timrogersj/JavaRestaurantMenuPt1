package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        System.out.println("in main");
        MenuItem itemOne = new MenuItem("hamburger", "Juicy hamburger", 14.99, "Entree", true);
//        System.out.println(itemOne.getDescription());
//        System.out.println(itemOne.getPrice());
//        System.out.println(itemOne.getCategory());
//        System.out.println(itemOne.isNew());
        MenuItem itemTwo = new MenuItem("taco", "Crunchy or soft", 5.99, "Entree", true);
//        System.out.println(itemTwo.getDescription());
//        System.out.println(itemTwo.getPrice());
//        System.out.println(itemTwo.getCategory());
//        System.out.println(itemTwo.isNew());

        Menu restaurantMenuOne = new Menu();
        System.out.println(restaurantMenuOne);
        System.out.println(restaurantMenuOne.getLastUpdated());
        System.out.println(restaurantMenuOne.getMenuItems());

        Menu restaurantMenuTwo = new Menu(new ArrayList<MenuItem>(Arrays.asList(itemOne, itemTwo)));
        System.out.println(restaurantMenuTwo);
        System.out.println(restaurantMenuTwo.getLastUpdated());
        System.out.println(restaurantMenuTwo.getMenuItems());

        // I didn't test out my setters, but feel free!
    }
}
