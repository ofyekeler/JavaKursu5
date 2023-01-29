package Mentoring.mentoring_6;

public class Method_Soru2 {
    public static void main(String[] args) {

        // Soru:  Parametre olarak verilen 2 karakter arasındaki tüm karakterleri yazdıran bir method oluşturunuz.

        karakterYaz('e', 'k');

    }

    public static void karakterYaz(char char1, char char2){

        for (int i = 0; char1 <= char2 ; char1++) {
            System.out.print(char1 + " ");
        }

    }


}
