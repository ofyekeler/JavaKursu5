package Gun19;

public class _02_Java2DArrays {
    public static void main(String[] args) {

        int [][] tablo={
                {4, 55},                // 1. satır
                {45, 6, 77},            // 2. satır
                {4, 2, 999, 45, 56, 66}, // 3. satır
                {42, 12, 9},        // 4. satır
                {4},                // 5. satır
                        };

        System.out.println("Satır Miktarı (sütun uzunluğu)= "+tablo.length);
        System.out.println("0. satırdaki sütun sayısı= "+tablo[0].length);
        System.out.println("1. satırdaki sütun sayısı= "+tablo[1].length);
        System.out.println("2. satırdaki sütun sayısı= "+tablo[2].length);
        System.out.println("3. satırdaki sütun sayısı= "+tablo[3].length);
        System.out.println("4. satırdaki sütun sayısı= "+tablo[4].length);

        // yazdırma bölümü

        for (int i = 0; i < tablo.length; i++)
        {
            for (int j = 0; j < tablo[i].length; j++)
            {
                System.out.print(tablo[i][j]+" ");
            }
            System.out.println();
        }
/*
Satır Miktarı (sütun uzunluğu)= 5
0. satırdaki sütun sayısı= 2
1. satırdaki sütun sayısı= 3
2. satırdaki sütun sayısı= 6
3. satırdaki sütun sayısı= 3
4. satırdaki sütun sayısı= 1
4 55
45 6 77
4 2 999 45 56 66
42 12 9
4
*/
    }
}
