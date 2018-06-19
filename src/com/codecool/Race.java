package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Race {

    private List<Car> cars = new ArrayList();
    private List<Motorcycle> motors = new ArrayList();
    private List<Truck> trucks = new ArrayList();
    private boolean truckBrooken = false;

    public void createVehicles() {

        for(int i = 0; i < 10; i++) {
            Car car = new Car();
            cars.add(car);
        }


        for(int i = 0; i < 10; i++) {
            Motorcycle motor = new Motorcycle();
            motors.add(motor);
        }


        for(int i = 0; i < 10; i++) {
            Truck truck = new Truck();
            trucks.add(truck);
        }


    }

    public void simulateRace() {

        for (int i = 0; i < 49; i++) {

            Weather.setRaining();

            for(Car car : cars) {

                if(isThereABrokenTruck()) {
                    car.setNormalSpeed(75);
                } else {
                    car.setNormalSpeed(car.generateSpeed());
                }

                car.moveForAnHour();
            }

            for(Motorcycle motor : motors){

                if(Weather.isRaining()) {
                    motor.slowerSpeed();
                } else {
                    motor.setNormalSpeed(100);
                }

                motor.moveForAnHour();
            }

            for(Truck truck : trucks){
                if(!truck.isTruckBrooken()) {

                    if(!truck.randomBrokeDown()) {

                        truck.moveForAnHour();

                    }

                } else {
                    truck.setBreakdownTurnsLeft(truck.getBreakdownTurnsLeft()-1);
                    truckBrooken = true;

                    if(truck.isTruckWorksAgain()) {
                        truck.setTruckBrooken(false);
                        truckBrooken = false;
                    }
                }
            }



        }

    }

    public void printRaceResults(){
        for(Car car : cars) {
            System.out.print(car.getName() + " | Car |");
            System.out.println(car.getDistanceTraveled());
        }

        for(Motorcycle motor : motors){
            System.out.print(motor.getName() + " | Motorcycle |");
            System.out.println(motor.getDistanceTraveled());
        }

        for(Truck truck : trucks){
            System.out.print(truck.getName() + " | Truck |");
            System.out.println(truck.getDistanceTraveled());
        }
    }

    public boolean isThereABrokenTruck() {
        return truckBrooken;
    }

    public static void main(String[] args) {
	// write your code here
        Race vehicles = new Race();
        vehicles.createVehicles();
        vehicles.simulateRace();
        vehicles.printRaceResults();

    }
}
