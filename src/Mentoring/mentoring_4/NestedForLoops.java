package Mentoring.mentoring_4;

public class NestedForLoops {
    public static void main(String[] args) {

        // Nested for loops: içiçe döngülerde ilk olarak dışarıdaki döngü çalışır. Sonrasında içerideki döngü tanımlanmış işlem kadar çalışır.
        // iç döngü işlemi bitirince kod akışına göre  başa döner.

        for (int i = 1; i <= 4; i++) {  // i nin herbir  değeri için bir kere çalışıyor

            System.out.println("i : " + i + " iken");

            for (int j = 1; j <= 3 ; j++) {   // i nin her bir değeri için içerideki döngünün tamamı çalışıyor
                System.out.println("j : " + j);
            }
            System.out.println();
        }
    }
}
