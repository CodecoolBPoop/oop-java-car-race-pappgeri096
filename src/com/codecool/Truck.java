package com.codecool;

public class Truck extends Vehicle {

    private int breakdownTurnsLeft = 0;
    private boolean isTruckBrooken;

    public Truck() {
        setNormalSpeed(100);
        setName(""+Random.generateRandomNumber(0,1000));
        setDistanceTraveled(0);

    }

    public boolean isTruckWorksAgain() {
        return breakdownTurnsLeft==0;
    }


    public int getBreakdownTurnsLeft() {
        return breakdownTurnsLeft;
    }

    public void setBreakdownTurnsLeft(int breakdownTurnsLeft) {
        this.breakdownTurnsLeft = breakdownTurnsLeft;
    }

    public boolean isTruckBrooken() {
        return isTruckBrooken;
    }

    public void setTruckBrooken(boolean truckBrooken) {
        isTruckBrooken = truckBrooken;
    }

    public boolean randomBrokeDown() {
        if(Probability.probability(5,95)) {
            setBreakdownTurnsLeft(2);
            isTruckBrooken = true;
            return true;
        }

        return false;
    }
}
