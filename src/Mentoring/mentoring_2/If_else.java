package Mentoring.mentoring_2;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {

        String str = "Java";
        if (str.equalsIgnoreCase("java")){
            System.out.println("merhaba java");
        }
        //*************************************

        Scanner input = new Scanner(System.in);
        System.out.print("notunuzu giriniz: ");
        int not = input.nextInt();

        if (not > 90){
            System.out.println("dersi geçtiniz AA");
        }else if (not > 80) {
            System.out.println("dersi geçtiniz BB");
        }else if (not > 70) {
            System.out.println("dersi geçtiniz CC");
        } else {
            System.out.println("dersten kaldınız");
        }

    }
}
