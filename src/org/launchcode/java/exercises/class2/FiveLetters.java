package org.launchcode.java.exercises.class2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rebecca on 3/18/2017.
 */
public class FiveLetters {
    public static void main(String[] args) {

        List<String> wordList = new ArrayList<>();

        wordList.add("taco");
        wordList.add("shell");
        wordList.add("baby");
        wordList.add("bingo");

        for (String item : wordList) {
            if (item.length() == 5) {
                System.out.println(item);
            }
        }
    }
}
