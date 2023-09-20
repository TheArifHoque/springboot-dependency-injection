package com.arifhoque.main.model;

public class Supplier {
    //Supplier class is independent
    private String name;
    private String country;

    public Supplier() {
        System.out.println("No arg constructor - Supplier class");
    }

    public Supplier(String name, String country) {
        System.out.println("All arg constructor - Supplier class");
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public void printDetails() {
        System.out.println("The supplier name is " + name + " . And they are from " + country);
    }
}
