package Mentoring.mentoring_2;

public class AritmeticOperators {
    public static void main(String[] args) {

        // Aritmetic Operators

        int a = 12;
        int b = 2;
        int c = 5;

        int x = 34, y = 4, z = 2;  // aynı veri tipi olduğu için bu şekilde tanımlayabiliyorum

        System.out.println("sonuc1 : " + (a+b));  // 14
        System.out.println("sonuc2 : " + a + b);  // otomatik casting --> sonuc2 : 122
        System.out.println("sonuc3 :" + (a*b));  // işlem önceliği var
        System.out.println("sonuc4 : " + ((double)a/b));  // ondalıklı işlemler için bu şekilde tanımlarım
        System.out.println("sonuc5: " + (a-b));
        System.out.println("*************************************");

        // ORNEK SORU: Aşağıdaki işlemlerin konsol çıktısı ne olur
        System.out.println(10  +  20 + "Quiz");  // ->  30Quiz
        System.out.println("Quiz" + 10 + 20);  // -> Quiz1020

        System.out.println(10*20 + "Quiz");  // -> 200Quiz
        System.out.println("Quiz" + 10*20);  // -> Quiz200





    }
}
