package aOdevler._Odev_2023_01_16_Abstract.Soru3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        Apple apples=new Apple();
        Samsung samsungs=new Samsung();

        System.out.print("Apple Hafızayı giriniz, 64GB/128GB: ");
        String hfzA= oku.nextLine();
        System.out.print("Apple Ekran boyutunu giriniz, 5.5inch/6.5inch: ");
        String ekrA= oku.nextLine();

        apples.options(hfzA,ekrA);

        System.out.print("Samsung Hafızayı giriniz, 256GB/512GB: ");
        String hfzS= oku.nextLine();
        System.out.print("Samsung Ekran boyutunu giriniz, 5.5inch/6.5inch/7.5inch: ");
        String ekrS= oku.nextLine();

        samsungs.options(hfzS,ekrS);

        System.out.println("Toplam tutar: "+"$"+Phone.getSum(Phone.card));
    }
}
