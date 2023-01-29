package Gun31._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek,
    // sipariş verdiği pizzaları bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.
    // TODO: Her pizza tipi için ücret belirleyerek toplam ücreti yazdırınız.

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        ArrayList<Pizza> siparisler=new ArrayList<>();

        int secim=0;
        do {
            // menu
            menu();
            secim= oku.nextInt();
            // scanner la seçimi alalım
            // seçilen pizzayı ArrayList e ekleyelim
            switch (secim){
                case 1: // small
                    Pizza sp=new Pizza(PizzaSizes.SMALL);
                    siparisler.add(sp);
                    break;
                case 2: // medium
                    Pizza mp=new Pizza(PizzaSizes.MEDIUM);
                    siparisler.add(mp);
                    break;
                case 3: // large
                    Pizza lp=new Pizza(PizzaSizes.LARGE);
                    siparisler.add(lp);
                    break;
                case 4: siparisYazdir(siparisler);
                        // eğer 4 ü seçerse arrayList i bir metod a gönder
                        // orada hangi pizzadan kaç sipariş verdiğini göster
                    break;
            }

            // eğer 4 ü seçerse ArrayList i bir metoda gönder
            // orada hangi pizzadan kaç adet sipariş verdiğini göster
        }while(secim<=4);
    }

    public static void menu(){
        System.out.println("********Pizza Menü********");
        System.out.println("1- Small");
        System.out.println("2- Medium");
        System.out.println("3- Large");
        System.out.println("4 - İşleme Al - Sipariş Göster");
        System.out.println("5- Çıkış");
        System.out.print("Seçiminiz");
    }
// NOT: static MAIN inin içindeki tüm metodlar STATIC olur !!!
    public static void siparisYazdir(ArrayList<Pizza> siparisler){
        int s=0, m=0, l=0;

        for (Pizza p:siparisler)
        {
            if (p.size==PizzaSizes.SMALL) s++;
            else
            if (p.size==PizzaSizes.MEDIUM) m++;
            else
            if (p.size==PizzaSizes.LARGE) l++;
        }
        System.out.println("**** Siparişleriniz ***");
        System.out.println("Small Pizza Count = "+s);
        System.out.println("Medium Pizza Count = "+m);
        System.out.println("Large Pizza Count = "+l);
    }
}
