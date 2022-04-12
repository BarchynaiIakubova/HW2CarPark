package com.company;

public class CarPark {
    private int id;
    private String name;
    private String driver;
    private State state;

    public CarPark(int id, String name, String driver, State state) {
        this.id = id;
        this.name = name;
        this.driver = driver;
        this.state = state;
    }
//
//    public CarPark() {
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

//    public static CarPark methodOfCar(int id, String name, String driver, State state) {
//        CarPark carPark = new CarPark();
//        carPark.id = id;
//        carPark.name = name;
//        carPark.driver = driver;
//        carPark.state = state;
//        return carPark;
//    }

    @Override
    public String toString() {
        return id + "  | " + name  + " |            | " + state;
    }
}
