package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
    }

    public static class Boat implements WaterVehicle
    {
        public String vehicleName;

        public int vehicleCapacity;

        public Boat(String vehicleName,int vehicleCapacity)
        {
           this.vehicleName = vehicleName;
           this.vehicleCapacity = vehicleCapacity;
        }
        public String getVehicleName()
        {
            return this.vehicleName;
        }
        public int getVehicleCapacity()
        {
            return this.vehicleCapacity;
        }
    }
}