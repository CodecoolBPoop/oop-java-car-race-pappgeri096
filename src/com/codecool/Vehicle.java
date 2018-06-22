package com.codecool;

public abstract class Vehicle {
    private int normalSpeed;
    private String name;
    private int distanceTraveled;

    public void moveForAnHour() {
        this.distanceTraveled += this.normalSpeed;
    }

    public int getNormalSpeed() {
        return normalSpeed;
    }

    public void setNormalSpeed(int normalSpeed) {
        this.normalSpeed = normalSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }



}
