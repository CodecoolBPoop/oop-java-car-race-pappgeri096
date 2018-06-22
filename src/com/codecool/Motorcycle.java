package com.codecool;

public class Motorcycle extends Vehicle {
    private static int nameNumber = 0;

    public Motorcycle() {
        setNormalSpeed(100);
        setNameNumber(this.nameNumber+1);
        setName("Motorcycle " + nameNumber);
        setDistanceTraveled(0);

    }

    public static void setNameNumber(int nameNumber) {
        Motorcycle.nameNumber = nameNumber;
    }

    public void slowerSpeed() {
        setNormalSpeed(100);
        setNormalSpeed(getNormalSpeed()-Math.generateRandomNumber(5,50));
    }
}
