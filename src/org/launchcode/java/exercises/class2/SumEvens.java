package org.launchcode.java.exercises.class2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rebecca on 3/18/2017.
 */
public class SumEvens {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();

        for (Integer i = 1; i <=20; i++){
            numList.add(i);
        }
        System.out.println(numList);

        int sumOfEvens = 0;

        for (Integer num : numList) {
            if (num % 2 == 0) {
                sumOfEvens += num;
            }
        }
        System.out.printf("The sum of the even numbers is %s", sumOfEvens);

    }
}
