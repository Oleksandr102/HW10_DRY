package main.java.com.company.builder;

import java.util.Set;

public class Car {

    private String make;
    private double engine;
    private int year;
    private int doors;
    private String carSize;
    private Set<Car> specs;

    public String getMake() {
        return make;
    }

    public double getEngine() {
        return engine;
    }

    public int getYear() {
        return year;
    }

    public int getDoors() {
        return doors;
    }

    public String getCarSize() {
        return carSize;
    }

    public Set<Car> getSpecs() {
        return specs;
    }

    public static class Builder {
        private Car newCar;

        public Builder() {
            newCar = new Car();
        }

        public Builder withMake(String make) {
            newCar.make = make;
            return this;
        }

        public Builder withEngine(double engine) {
            newCar.engine = engine;
            return this;
        }

        public Builder withYear(int year) {
            newCar.year = year;
            return this;
        }

        public Builder withDoors(int doors) {
            newCar.doors = doors;
            return this;
        }

        public Builder withCarClass(String carClass) {
            newCar.carSize = carClass;
            return this;
        }

        public Builder withSpecs(Set<Car> specs) {
            newCar.specs = specs;
            return this;
        }

        public Car build() {
            return newCar;
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", engine=" + engine +
                ", year=" + year +
                ", doors=" + doors +
                ", car class='" + carSize + '\'' +
                '}';
    }

}
