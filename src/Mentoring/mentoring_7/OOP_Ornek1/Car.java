package Mentoring.mentoring_7.OOP_Ornek1;

import java.util.ArrayList;
import java.util.Arrays;

public class Car {

    String model;

    int year;


    public static void bilgiYaz(ArrayList<Car> cars){

        for (Car car : cars){
            System.out.println("araba model: " + car.model);
            System.out.println("araba yıl: " + car.year);

        }
    }

}
