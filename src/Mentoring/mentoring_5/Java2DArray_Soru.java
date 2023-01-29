package Mentoring.mentoring_5;

public class Java2DArray_Soru {
    public static void main(String[] args) {

        // int[3][4] lük 2D Array tanımlayıp 10'a kadar sayılardan random şekilde doldurunuz.
        // sonrasında array deki çift sayıların toplamını yazdırınız.

        int[][] tablo = new int[3][4];

        int toplam = 0;

        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                tablo[i][j] = (int) (Math.random() * 11);
                System.out.print(tablo[i][j] + " ");
                if(tablo[i][j] % 2 == 0){
                    toplam += tablo[i][j];
                }
            }
        }
        System.out.println("\ntoplam: " + toplam);



    }
}
