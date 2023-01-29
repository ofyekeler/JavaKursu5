package Gun19;

public class _01_Java2DArrays {
    public static void main(String[] args) {

        int[][] tablo={
                {3, 4, 55},
                {234, 22, 33}
                      }; // 2 satır 3 sütun

        System.out.println("satır sayısı(sütun uzunluğu)= "+tablo.length); // satırların uzunluğu
                                        // (2 adet satır. bir sütunun satır uzunluğu)
        System.out.println("0. satırın sütun uzunluğu= " + tablo[0].length); // 1. satırın sütun uzunluğu
        System.out.println("1. satırın sütun uzunluğu= "+tablo[1].length);  //  2.    //

        for (int i = 0; i < tablo.length; i++)  // satır sayısı
            // ilgili satırdaki sütun uzunluğu
        {
            for (int j = 0; j < tablo[i].length; j++)
            {
                System.out.print(tablo[i][j]+" ");
            }
            System.out.println();
        }
/*
satır sayısı(sütun uzunluğu)= 2
0. satırın sütun uzunluğu= 3
1. satırın sütun uzunluğu= 3
3 4 55
234 22 33
*/
    }
}
