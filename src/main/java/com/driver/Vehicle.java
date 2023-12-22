package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
       this.name = name;
       this.currentSpeed = 0;
       this.currentDirection = 0;
    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        this.currentDirection = currentDirection + direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){

        System.out.println("stop method called - The vehicle is stopped");
    }

    public int getCurrentDirection()
    {
        return this.currentDirection;
    }

    public int getCurrentSpeed()
    {
        return this.currentSpeed;
    }

    public String getName()
    {
        return this.name;
    }

    public void SetCurrentDirection(int direction)
    {
        this.currentDirection = this.currentDirection + direction;
    }





}

class Boat implements WaterVehicle
{
    public String vehicleName;

    public int vehicleCapacity;

    public Boat()
    {

    }

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

