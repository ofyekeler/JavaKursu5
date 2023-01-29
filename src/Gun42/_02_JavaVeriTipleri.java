package Gun42;

import java.util.Arrays;

public class _02_JavaVeriTipleri {
    public static void main(String[] args) {
        // ilkel (primitive) tipler : short, byte, long, float, double, boolean
        int sayi1 = 5;
        int sayi2 = 10;

        sayi1=sayi2; // sayi1 =10 , kendi hücreleri yine ayrı kalır. Burada sadece değer ataması oldu.
        System.out.println("sayi1 = " + sayi1);

        sayi1=34;
        sayi2=45;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
/*
sayi1 = 10

sayi1 = 34
sayi2 = 45
*/
        // Referans Tipler : classlar, diziler, arrayler, nesneler
        int[] dizi1={1,2,3,4};
        int[] dizi2={5,6};
        System.out.println("dizi1 = " + Arrays.toString(dizi1));
        System.out.println("dizi2 = " + Arrays.toString(dizi2));

        dizi1=dizi2;  // adresler aynı, yani hücreler de birleşti. birisinde yapılacak değişiklik 2 sini de etkiler.
        System.out.println("dizi1 = " + Arrays.toString(dizi1)); // 5, 6
        System.out.println("dizi2 = " + Arrays.toString(dizi2)); // 5, 6

        dizi1[0]=67;
        System.out.println("dizi1 = " + Arrays.toString(dizi1)); // 67, 6
        System.out.println("dizi2 = " + Arrays.toString(dizi2)); // 67, 6

        dizi2[0]=55;
        System.out.println("dizi1 = " + Arrays.toString(dizi1)); // 55, 6
        System.out.println("dizi2 = " + Arrays.toString(dizi2)); // 55, 6

        // Nesne Tipler: Null alabilen ilkel tip
        // String, Integer, Double, Long
        String ad1="Mehmet";
        String ad2="İsmet";

        ad1=ad2;
        System.out.println("ad1 = " + ad1); // İsmet
        System.out.println("ad2 = " + ad2); // İsmet

        ad1="Ali";
        System.out.println("ad1 = " + ad1); // Ali
        System.out.println("ad2 = " + ad2); // İsmet
    }
}
