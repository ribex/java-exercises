package org.launchcode.java.exercises.class1;

import java.util.Scanner;

/**
 * Created by Rebecca on 3/18/2017.
 */
public class HelloName {
    public static void main(String[] args) {
        System.out.println("What is your name? ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Hello, " + name);
    }
}