package com.codecool;

public class Weather {

    public static boolean isRaining;


    public static void setRaining() {
        isRaining = Math.probabilityCalculator(30);
    }

    public static boolean isRaining() {
        return isRaining;
    }
}
