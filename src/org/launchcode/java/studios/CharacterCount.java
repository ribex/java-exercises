package org.launchcode.java.studios;

import java.util.HashMap;

/*
 * Created by Rebecca on 2/26/2017.
 * Write a program that calculates the number of times each character occurs in a string and prints
 * these counts to the console.
 * Loop through the string one character at a time, storing and/or updating
 * the count for a given character using an appropriate data structure.
 */
public class CharacterCount {
    public static void main(String[] args) {

        String loremText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. " +
                "Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, " +
                "non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. " +
                "Donec nec velit non ligula efficitur luctus.";

        // Case sensitive
        char[] charsInString = loremText.toCharArray();
        // Case insensitive
        // char[] charsInString = loremText.toLowerCase().toCharArray();

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : charsInString) {
            if (Character.isLetter(c)) { // Optional condition for checking if alpha
                if (charCountMap.containsKey(c)) {
                    charCountMap.put(c, charCountMap.get(c) + 1);
                } else {
                    charCountMap.put(c, 1);
                }
            }
        }

        for (HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }

//        System.out.println(charCountMap);


    }
}
