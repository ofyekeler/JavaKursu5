package Mentoring.mentoring_2;

import java.util.Scanner;

public class If_else_Soru_1 {
    public static void main(String[] args) {


        // ORNEK SORU: Trafikte seyir halindeki kullanıcıdan trafik ışıklarından hangisinin yandığı bilgisini
        // alıp yönlendirme yapan programı yazınız.

        Scanner input = new Scanner(System.in);
        System.out.print("hangi ışık yanıyor: ");

        String st = input.nextLine();

        if (st.equalsIgnoreCase("kırmızı")){
            System.out.println("DUR!!");
        } else if (st.equalsIgnoreCase("sarı")) {
            System.out.println("Geçmeye Hazırlan!!");
        } else if (st.equalsIgnoreCase("yeşil")) {
            System.out.println("GEÇ");
        }else {
            System.out.println("hatalı giriş yaptınız!!!");
        }


    }
}
