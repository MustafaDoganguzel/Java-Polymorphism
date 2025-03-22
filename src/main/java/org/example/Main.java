package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.GasPoweredCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car(8 , "Base Car");
//        car.startEngine();
//        car.accelerate();
//        car.brake();
//        System.out.println("********************");
//        Car mt = new Mitsubishi(6 , "Outlander");
//        mt.startEngine();
//        mt.accelerate();
//        mt.brake();
//        System.out.println("********************");
//        Car ford = new Ford(4, "Focus");
//        ford.startEngine();
//        ford.accelerate();
//        ford.brake();
        System.out.println("********************");
        System.out.println("********************");

        CarSkeleton car1 = new GasPoweredCar("Toyota", "Diesel" , 6.7 , 4);
        car1.startEngine();


    }
}