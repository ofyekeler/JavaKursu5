package Gun15;

public class _03_Ornek2 {
    public static void main(String[] args) {

        // Aşağıdaki görüntüyü veren programı yazdırınız. (yalnızca bir yıldız ile yapınız)
        // *      1. Satırda 1 yıldız.
        // **     2. Satırda 2 yıldız.
        // ***    3. Satırda 3 yıldız.
        // ****   4. Satırda 4 yıldız.
        // *****  5. Satırda 5 yıldız.

        for (int j=1 ; j<=5 ; j++) // 1, 2, 3, 4, 5
        {
            for (int i = 1; i <= j; i++) // i<j yaparak yıldız sayısını satır numarası sayısıyla sınırladık.
                System.out.print("*");

            System.out.println();
        }
        /* *
           **
           ***
           ****
           ***** */
    }
}
