package org.launchcode.java.exercises.class1;

import java.util.Scanner;

/**
 * Created by Rebecca on 3/18/2017.
 */
public class MilesPerGallon {
    public static void main(String[] args) {
        double miles;
        double gallons;
        Scanner in = new Scanner(System.in);

        System.out.print("How many miles have you driven? ");
        miles = in.nextDouble();
        System.out.print("How many gallons of gas has your vehicle consumed? ");
        gallons = in.nextDouble();

        double milesPerGallon = miles / gallons;

        System.out.printf("Your MPG: %.2f\n", milesPerGallon);
    }
}
