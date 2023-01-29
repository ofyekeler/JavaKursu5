package Mentoring.mentoring_4;

import java.util.Arrays;

public class Java_Arrays {
    public static void main(String[] args) {

        int i = 5;   // bir tane değer aldı

        String a = "ece"; // bir tane değer aldı

        // Arrays : Birden çok değeri tek bir değişkende depolamak için kullanıyoruz. Köşeli parantezle tanımlıyoruz

        int[] arr = new int[5];

        arr[3] = 5;   // [0, 0, 0, 5, 21] değer atanmamış index default olarak sıfır gelir.
        arr[4] = 21;

        System.out.println(arr[3]);
        System.out.println(Arrays.toString(arr));  // Arrays.toString ile yazdırıyoruz.

        int[] arr2 = {12, 2, 34, 67};

        System.out.println("arr2: " + Arrays.toString(arr2));

        String[] arr3 = new String[8];

        arr3[0] = "efe";

        String[] arr4 = {"ali", "ece", " efe", "cem"};

        for (int j = 0; j < arr4.length; j++) {
            System.out.println(j+1 + " .isim: "  + arr4[j]);

        }






    }
}
