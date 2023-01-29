package Mentoring.mentoring_2;

import java.util.Scanner;

public class If_else_Soru_3 {
    public static void main(String[] args) {

        // ORNEK SORU: Girilen bir email in uygun formatta olup olmadığını belirten bir program yaziniz


        //  Girilen email için uygunluk koşullari:
        // 1 - Email ".com" ile bitmeli
        // 2 - Email "@" işareti bulundurmalı
        // 3 - "@" işareti ".com" dan önce olmalı
        // 4 - "@" işareti öncesinde en az 1 karakter olmalı
        // 5 - "@" ile ".com" arasinda en az 1 karakter olmalı

        Scanner input = new Scanner(System.in);
        System.out.println("email: ");

        String email = input.nextLine();

        if ( email.endsWith(".com") && email.contains("@") &&
                email.indexOf("@") < email.indexOf(".com") &&
                !email.substring(0, email.indexOf("@")).isEmpty() &&
                !email.substring(email.indexOf("@")+1, email.length()-4).isEmpty()
        ){
            System.out.println("Geçerli email");
        }else {
            System.out.println("Geçersiz email");
        }

    }
}
