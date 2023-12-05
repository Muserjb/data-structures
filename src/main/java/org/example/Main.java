package org.example;

import org.example.classes.Cookie;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Cookie cookieOne = new Cookie("green");
        Cookie cookieTwo = new Cookie("blue");

        cookieOne.setColor("yellow");

//        System.out.println(cookieOne.getColor());
//        System.out.println(cookieTwo.getColor());



        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value", 1);
        map2 = map1;
        map1.put("value", 22);

        System.out.println(map1);
        System.out.println(map2);

    }
}