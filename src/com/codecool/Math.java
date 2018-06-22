package com.codecool;

import java.util.Random;

public class Math {

    public static int generateRandomNumber(int min, int max) {
        Random rand = new Random();

        return rand.nextInt(max) + min;
    }

    public static boolean probabilityCalculator(int probability) {
        if(generateRandomNumber(1,100) <= probability) {
            return true;
        }
        return false;
    }

}
