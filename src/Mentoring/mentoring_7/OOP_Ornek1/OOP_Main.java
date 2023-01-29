package Mentoring.mentoring_7.OOP_Ornek1;

import java.util.ArrayList;
import java.util.Arrays;

public class OOP_Main {
    public static void main(String[] args) {

        // Java OOP Object Oriented Programming : Nesne Yönelimli Programlama
        // Kodun bakımını değiştirilmesini ve hata ayıklamasını kolaylaştırır.
        // Tekrar eden kod bloklarının önüne geçerek daha az kodla daha kapsamlı program geliştirme sağlar
        // Class bir şablondur ve bize tipi bildirir, nesne ise classın bir örneğini yani objesini = nesnesidir.
        // Oluşturduğunuz nesneler classın tüm özelliklerini alır.

        Car car1 = new Car();
        car1.model = "Honda";
        car1.year = 2020;

        System.out.println("model: " + car1.model);
        System.out.println("yıl: " + car1.year);

        Car car2 = new Car();
        car2.model = "BMW";
        car2.year = 2020;

        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(car1,car2));

        Car.bilgiYaz(cars);




    }
}
