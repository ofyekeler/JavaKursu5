package Mentoring.mentoring_11.exceptions;

import java.util.Scanner;

public class Java_throw {
    public static void main(String[] args) {


        // throw programcının istediği anda exception oluşturabilmesi için kullanılan keyword

        Scanner input = new Scanner(System.in);
        System.out.println("isim: ");
        String isim = input.next();

        try {
            if( isim.length() < 2){
                throw new Exception("isim 2 karakterden az olamaz!!!");
            }else {
                System.out.println(isim);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
