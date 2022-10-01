package edu.sdccd.cisc191;

public class HybridCar extends Car implements Combustible, Chargeable{

    int batteryCharge = 0;
    int fuelLevel = 0;

    public HybridCar(String manufacturerName, int numMiles, int price, int numSeats,Option [] option, int numDoors){
        super(manufacturerName, numMiles, price, numSeats, option, numDoors);
    }
    public int getNumberOfDoors() {
        return numDoors;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void tankUp() {
        fuelLevel = 100;
    }

    public int getBatteryCharge() {
        return batteryCharge;
    }

    public void chargeUp() {
        batteryCharge = 100;
    }
}

