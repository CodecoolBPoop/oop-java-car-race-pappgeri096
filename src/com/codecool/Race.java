package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Vehicle> vehicles = new ArrayList<>();
    private boolean truckBrooken = false;

    public void createVehicles() {

        for(int i = 0; i < 10; i++) {
            Car car = new Car();
            Motorcycle motor = new Motorcycle();
            Truck truck = new Truck();

            vehicles.add(car);
            vehicles.add(motor);
            vehicles.add(truck);
        }

    }

    private void moveCar(Vehicle vehicle) {
        Car car = (Car) vehicle;
        if (isThereABrokenTruck())
            car.setNormalSpeed(75);
        else
            car.setNormalSpeed(((Car) vehicle).generateSpeed());
        car.moveForAnHour();
    }

    private void  moveMotor(Vehicle vehicle) {
        Motorcycle motor = (Motorcycle) vehicle;
        if(Weather.isRaining())
            motor.slowerSpeed();
        else
            motor.setNormalSpeed(100);
        motor.moveForAnHour();
    }

    private void moveTruck(Vehicle vehicle) {
        Truck truck = (Truck) vehicle;

        if(!truck.isTruckBrooken()) {

            if(!truck.randomBrokeDown()){
                vehicle.moveForAnHour();
            }

        }   else{
            truck.setBreakdownTurnsLeft(((Truck) vehicle).getBreakdownTurnsLeft()-1);
            truckBrooken = true;

            if(truck.isTruckWorksAgain()) {
                truck.setTruckBrooken(false);
                truckBrooken = false;
            }
        }
    }

    public void simulateRace() {

        for (int i = 0; i < 49; i++) {

            Weather.setRaining();

            for(Vehicle vehicle : vehicles) {

                if(vehicle instanceof Car)
                   moveCar(vehicle);
                else if (vehicle instanceof Motorcycle)
                    moveMotor(vehicle);
                else
                    moveTruck(vehicle);
            }

        }

    }

    public void printRaceResults(){
        for(Vehicle vehicle : vehicles) {
            System.out.print(vehicle.getName() + " | " + vehicle.getClass().getSimpleName() +" |");
            System.out.println(vehicle.getDistanceTraveled());
        }

    }

    public boolean isThereABrokenTruck() {
        return truckBrooken;
    }

    public static void main(String[] args) {
        Race vehicles = new Race();
        vehicles.createVehicles();
        vehicles.simulateRace();
        vehicles.printRaceResults();

    }
}
