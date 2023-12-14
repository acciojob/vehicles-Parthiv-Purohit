package com.driver;

public  class Boat implements WaterVehicle
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
