package Mentoring.mentoring_4;

public class Break {
    public static void main(String[] args) {


        // break: döngüde belirtilen koşul sağlandığında akışı keser, döngüden çıkar


        int list = 21;  // elimde 21 kişilik sınıf listesi olsun ve ilk on kişiyi yazdırmak istiyorum

        for (int i = 1; i <= list; i++) {
            System.out.println(i + " .kişi");
            if (i == 10){
                break;
            }
        }

        int sayac = 1;  // sayac 10 a gelince dursun

        while (sayac < 100){

            System.out.println(sayac);
            if (sayac == 10){
                System.out.println("DUR");
                break;
            }

            sayac++;
        }


    }
}
