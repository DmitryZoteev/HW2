package com.netcracker.chapter3;

public class Employee implements Measurable{
    private String name;
    private double salary;

    public Employee(String name){
        this.name = name;
        this.salary = 1000;
    }
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public static double average(Measurable[] objects){
        double averageValue = 0;

        for (Measurable o : objects){
            averageValue += o.getMeasure();
        }
        return averageValue / objects.length;
    }

    public static Measurable largest(Measurable[] objects){
        int id = 0;

        for (int i = 0; i < objects.length; i++){
            if (objects[id].getMeasure() < objects[i].getMeasure()) {
                id = i;
            }
        }
        return objects[id];
    }
}
