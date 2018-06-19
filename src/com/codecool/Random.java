package com.codecool;

public class Random {

    public static int generateRandomNumber(int min, int max) {
        java.util.Random rand = new java.util.Random();

        int  number = rand.nextInt(max) + min;

        return number;
    }

}
