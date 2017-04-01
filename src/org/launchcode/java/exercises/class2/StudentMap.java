package org.launchcode.java.exercises.class2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Rebecca on 3/18/2017.
 */
public class StudentMap {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        boolean startAgain = true;
        Scanner in = new Scanner(System.in);


        // Get student IDs and names
        do {
            System.out.println("Enter student's ID number (or ENTER to finish):");
            String nextString = in.nextLine();
            Integer id;
            if(nextString.equals("")) {
                break;
            }
            else {
                id = Integer.parseInt(nextString);
            }

            System.out.print("Enter name: ");
            String name = in.nextLine();

//            startAgain = false;

            students.put(id, name);

        } while(startAgain);


        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());

        }

    }

}
