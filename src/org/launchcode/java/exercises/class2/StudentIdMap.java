package org.launchcode.java.exercises.class2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Rebecca on 3/18/2017.
 */
public class StudentIdMap {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades

        do {
            System.out.print("Student ID: ");
            newStudent = in.nextInt();


            System.out.print("Student Name: ");
            String name = in.nextLine();
            students.put(newStudent, name);

            // Read in the newline before looping back
            in.nextLine();

        } while (!newStudent.toString().equals("exit"));

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }

    }
}
