package Gun15;

public class _05_Ornek4 {
    public static void main(String[] args) {

       // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *
        // **
        // ***
        // ****
        // *****
        // *****
        // ****
        // ***
        // **
        // *

        for (int j=1 ; j<=5 ; j++) // 1, 2, 3, 4, 5
        {
            for (int i = 1; i <= j; i++) // i<j yaparak yıldız sayısını satır numarası sayısıyla sınırladık.
                System.out.print("*");

            System.out.println();
        }

        for (int j=5 ; j>=1 ; j--) // 1, 2, 3, 4, 5
        {
            for (int i = 1; i <= j; i++) // i<=j yaparak yıldız sayısını satır numarası sayısıyla sınırladık.
                System.out.print("*");

            System.out.println();
        }

    }
}
// satır numarasına tıklayıp kırmızı noktayı oluştur. Sağ tıklayarak Debug'a tıkla.
// Sonra F8 (step over) diyerek programın nasıl çalıştığını adım adım gör.
