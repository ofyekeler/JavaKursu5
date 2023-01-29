package Gun42;

import java.util.Arrays;

public class _03_VeriTipleriMetodda {
    public static void main(String[] args) {
        // İlkel Tip
        int sayi=5;
        System.out.println("sayi = " + sayi); // 5
        
        // Referans Tip
        int[] dizi={1,2,3};
        diziSifirla(dizi);
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi)); // [0, 0, 0]

        // Nesne Tip
        String kelime="ismet";
        kelimeSifirla(kelime);
        System.out.println("kelime = " + kelime); // ismet
    }
    public static void sayiArtir(int sayi){ // ilkel değerlerin değeri gelir.
        sayi++; // 6
    }
    public static void diziSifirla(int [] dizi){ // referans değerlerinin kendisi gelir.
        dizi[0]=0; dizi [1]=0; dizi [2]=0;
    }
    public static void kelimeSifirla(String kelim){ // değeri gelir.
        kelim="";
    }
}
