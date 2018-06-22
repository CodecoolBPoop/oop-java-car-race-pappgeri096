package com.codecool;

public class Car extends Vehicle {

    private String[] cardNames = FileHandler.readNames();

    private String generateCarName() {
        String carName = String.format("%s %s", cardNames[Math.generateRandomNumber(0, cardNames.length)], cardNames[Math.generateRandomNumber(0, cardNames.length)]);
        return carName;
    }

    public Car() {
        setNormalSpeed(generateSpeed());
        setName(generateCarName());
        setDistanceTraveled(0);
    }


    public int generateSpeed() {
        return Math.generateRandomNumber(80,110);
    }

}


