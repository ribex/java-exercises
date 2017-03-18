package org.launchcode.java.exercises.class1;

import java.util.Scanner;

/**
 * Created by Rebecca on 3/18/2017.
 */
public class AliceSearch {
    public static void main(String[] args){
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having" +
                " nothing to do: once or twice she had peeped into the book her sister was reading, but it had no" +
                " pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures" +
                " or conversation?'";
        Scanner in = new Scanner(System.in);
        System.out.print("What word would you like to search for? ");
        String term = in.next();
        System.out.println(quote.toLowerCase().contains(term.toLowerCase()));
    }
}
