package Gun46;

public class _03_TekrarSorulari21cozum {
    public static void main(String[] args) {

        int [][] arr=new int [2][4];

        arr [0]=new int []{1,3,5,7};
        arr [1]=new int []{1,3};

        for (int[] satir : arr) {
            for (int i = 0; i < arr.length; i++) { // arr yerine a olsaydı hepsini yazdırırdı.
                                                // satır sayısı (2) nı sınır olarak kabul etti
                System.out.print(satir[i]+" ");
            }
            System.out.println();
        }
        System.out.println(arr.length); // 2 boyutlu dizilerin satır
                                        // sayısını verir.
        System.out.println(arr[0].length); // 0. satırın sütun (eleman) sayısını verir.
/*
1 3
1 3
*/
    }
}
