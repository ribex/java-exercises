package org.launchcode.java.exercises.class2;

import java.util.ArrayList;

/**
 * Created by Rebecca on 3/18/2017.
 */
public class LoopPrint {
    public static void main(String[] args){
        int[] numList = new int[] {1,1,2,3,5,8};

        for (int number : numList) {
            System.out.print(number + " ");
        }
    }
}
