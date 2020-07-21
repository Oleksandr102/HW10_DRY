package main.java.com.company;

import main.java.com.company.builder.Car;
import main.java.com.company.singleton.MySingleton;

public class Executor {

    public void execut() {
        Car myCar = new Car.Builder()
                .withMake("Mercedes")
                .withEngine(4.4)
                .withYear(2016)
                .withDoors(4)
                .withCarClass("E class")
                .build();

        System.out.println(myCar.toString());

        MySingleton firstInstance = MySingleton.getInstance();
        System.out.println(firstInstance.getClass());
        MySingleton secondInstance = MySingleton.getInstance();
        System.out.println(secondInstance == firstInstance);
    }
}


