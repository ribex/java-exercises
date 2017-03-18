package org.launchcode.java.exercises.class1;

import java.util.Scanner;

/**
 * Created by Rebecca on 3/18/2017.
 */
public class RectangleArea {
    public static void main(String[] args){
        double height;
        double width;
        Scanner in = new Scanner(System.in);


        System.out.println("What is the rectangle's height? ");
        height = in.nextDouble();

        while (height <= 0) {
            System.out.println("Please enter a positive number.");
            height = in.nextDouble();
        }

        System.out.println("What is the rectangle's width? ");
        width = in.nextDouble();

        while (width <= 0) {
            System.out.println("Please enter a positive number.");
            width = in.nextDouble();
        }

        double area = width * height;
        System.out.printf("The area of the rectangle is %.3f", area);
    }

}
