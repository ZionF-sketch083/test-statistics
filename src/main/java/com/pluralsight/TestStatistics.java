package com.pluralsight;

import java.util.Arrays;
import java.util.Collections;

public class TestStatistics {
    public static void main(String[] args) {

        int[] arraysOfNumbers = new int[9];
        int[] grades = {49, 87, 32, 65, 87, 47, 98, 67, 48, 97};
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));


        int lowScore = grades[0];
        int highScore = grades[grades.length - 1];

//        System.out.print("Lowest score: ");
//        System.arraycopy(grades, 0, lowestScore, 0, 6);
//        System.out.println(Arrays.toString(lowestScore));
//
//        System.out.print("Highest score: ");
//        System.arraycopy(grades, 6, highestScore, 0, 4);
//        System.out.println(Arrays.toString(highestScore));
//
//        System.out.print("The average score is ");
//        System.arraycopy(grades, 5, average, 0, 1);
//        System.out.println(Arrays.toString(average));





    }
}
