package org.launchcode.java.studios;

/*
 * Created by Rebecca on 2/26/2017.
 */

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double radius;
        double area;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the circle's radius: ");
        radius = in.nextDouble();

//        if (radius < 0) {
//            System.out.println("Please enter a positive number.");
//        } else {
//            area = (radius * radius * 3.141592);
//            System.out.println("The area of the circle is: " + area);
//        }

        while (radius < 0) {
            System.out.println("Please enter a positive number.");
            radius = in.nextDouble();
        }

        area = (radius * radius * 3.141592);
        System.out.println("The area of the circle radius" + radius + "is: " + area);

    }
}

