package Gun17;

import java.util.Arrays;

public class _06_JavaArrayMetodlar {
    public static void main(String[] args) {

        String[] isimler={"ahmet", "zeynep", "roman", "yasin", "cihan"};

        // diziyi string olarak direk yazdırır.

        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));

        // dizi sıralama
        // baş harflerine göre sıralar

        Arrays.sort(isimler);
        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));

        // Diziler eşit mi?

        int [] a = {1, 8, 3, 54};
        int [] b = {1, 8, 3, 54};
        int [] c = {1, 8, 2, 54};
        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b)); // true
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c)); // false

        // Sayı bazlı dizi sıralaması

        Arrays.sort(c);
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));

        // sayı bulma. (var mı yok mu) (sıralı sayılarda bulur, sıralı değilse bulmaz)
        // contains gibi çalışır. var ise pozitif, yoksa negatif.

        System.out.println("Arrays.binarySearch(b,3) = " + Arrays.binarySearch(b,3));
        Arrays.sort(b);
        System.out.println("Arrays.binarySearch(c, 3) = " + Arrays.binarySearch(b, 3));

/*
Arrays.toString(isimler) = [ahmet, zeynep, roman, yasin, cihan]
Arrays.toString(isimler) = [ahmet, cihan, roman, yasin, zeynep]
Arrays.equals(a,b) = true
Arrays.equals(a,c) = false
Arrays.toString(c) = [1, 2, 8, 54]
Arrays.binarySearch(b,3) = -2
Arrays.binarySearch(c, 3) = 1                // "bir adet var" demek
*/

    }
}
