package Gun17;

import java.util.Scanner;

public class _02_Ornek2 {
    public static void main(String[] args) {
        
        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz.
        // For döngüsü ile yapınız.
        // Bugün hava çok güzel -> 5

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle= ");
        String cumle= oku.nextLine();
        
        int boslukSayisi=0;
        for (int i = 0; i < cumle.length(); i++)
        {
                if (cumle.charAt(i)==' ')
                    boslukSayisi++;
        }
        System.out.println("Kelime Sayısı= " + (boslukSayisi+1)); // boşluk sayısı + 1
                                                                  // kelime sayısını verir

        /* Cümle= Bugün hava çok güzel
           Kelime Sayısı= 4 */

    }
}
