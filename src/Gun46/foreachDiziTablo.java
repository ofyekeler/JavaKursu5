package Gun46;

public class foreachDiziTablo {
    public static void main(String[] args) {
// tek boyutlu diziler
        int[] dizi=new int[]{1,2,3,4,6};
        int[] dizi1={1,2,3,4,5};

        int dizi5[]={1,2,3,4,5};

        int[] dizi2=new int[3];
        dizi2[0]=5;
        dizi2[1]=5;
        dizi2[2]=5;

        System.out.println("dizi1.length = " + dizi1.length); // dizinin eleman sayısı

        // index sırasıyla gittiği için SIRA GARANTİ
        for (int i = 0; i < dizi1.length; i++) { // dizin uzunluğuna kadar bütün elemanları yazdırır
            System.out.print(dizi1[i]+" ");
        }
        System.out.println();
        // SIRA GARANTİ DEĞİL, normalde sıradan verir
        for(int eleman : dizi1) {  // içindei elemanları teker teker alarak eleman isimli değişkene atar
            System.out.print(eleman+" ");
        }
        System.out.println();

        //**  2 boyutlu diziler yani tablolar
        int[][] tablo1 =new int[2][3]; // standart tanımlama elemanlar sonradan tek tek atanabilir.
        tablo1[0][0]=4;  tablo1[0][1]=14; tablo1[0][2]=22;  // 1.satır
        tablo1[1][0]=24;  tablo1[1][1]=33; tablo1[1][2]=12;  //2.satır

        // elemanlar verildiğinde zaten sayı elemanlardan geldiği için boyut sayıları verilmiyor
        int[][] tablo2 =new int[][]{

                {1,3, 4},
                {56,7,8}
        };

        // new int[][] vermeden de ilk tanımlama anında elemanları verebiliriz.
        int[][] tablo6 ={
                {1,3, 4},
                {56,7,8}
        };

        int[][] tablo3 = new int[2][3];
        tablo3[0] = new int[]{2,3,4,5,6}; // her bir satırın yeniden tanılayabiliriz
        tablo3[1] = new int[]{2,3};

        int tablo4[][] = new int[2][3]; // köşeli parantezler değişkenin adında da olabilir

        System.out.println("**************");
        for (int[] satir : tablo3) { // tablo3 elemanları satırlardan oluşuyor onlarda her biri tek boyutlu dizi
            for (int eleman : satir) { // satırın elemanları, yani int, yani sayı
                System.out.print(eleman+" ");
            }
            System.out.println();
        }
        System.out.println("**************");
        for (int[] satir : tablo3) {
            // 1. Adımda satır 2 3 4 5 6 aşağıdaki döngü sadece 2, 3 ü yazar
            // 2. Adımda satır 2, 3      aşağıdaki döngü satırın tamamını yan, 2, 3
            for (int i = 0; i < tablo3.length; i++) { // tablo3.length 2 dir.
                System.out.print(satir[i]+" ");
            }
            System.out.println();
        }
    }
}
