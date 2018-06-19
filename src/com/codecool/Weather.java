package com.codecool;

public class Weather {

    public static boolean isRaining;


    public static void setRaining() {
        isRaining = Probability.probability(30,70);
    }

    public static boolean isRaining() {
        return isRaining;
    }
}
