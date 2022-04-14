package com.netcracker.chapter2;

public class Car
{
    private double x;
    private double fuelEfficiency;
    private double fuelLevel;

    public Car(double fuelLevel, double fuelEfficiency)
    {
        this.x = 0;
        this.fuelLevel = fuelLevel;
        this.fuelEfficiency = fuelEfficiency;
    }

    public void Drive(double x)
    {
        if (fuelLevel <= 0)
        {
            System.out.println("Топливо закончилось...");
            return;
        }
        this.x += x;
        this.fuelLevel -= x* fuelEfficiency;
        System.out.println("Машина поехала");
    }

    public void addGallons(double gal)
    {
        this.fuelLevel += gal;
        if (fuelLevel >= 100)
            fuelLevel = 100;
    }

    public double getDistance()
    {
        return Math.abs(this.x);
    }

    public double getFuelLevel()
    {
        return this.fuelLevel;
    }
}
