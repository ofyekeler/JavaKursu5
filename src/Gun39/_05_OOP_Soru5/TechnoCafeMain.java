package Gun39._05_OOP_Soru5;

import MyFuch_Bekletme.MyFunc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechnoCafeMain {
    /* 1.Bölüm
       void taste()
       double ucret()
       bir interface yazınız.

       2.Bölüm de
       Aşağıdaki metodları olan classları yazınız.food dan implemente alarak

       AdanaKebab: void marinade(), grill()
       Lahmacun: dough(), addMeat(), bake()
       Borsh: boil(), eatTomorrow()
       Palov: fry(), boil()

       3.Bölüm
       TechnoCafe isimli class da ki main metodunda kullanıcıya menüyü sunarak
       kullanıcı tamam seçeneğini seçene kadar yemek siparişini alınız.

       TODO: Ödev: seçim sonrası kaç adet olduğunu da alınız.
                   Bu yemekleri bir ArrayList e ekleyiniz.

Menü*
1-Adana Kebap (55 TL)
2-Lahmacun (33 TL)
3-Borsh (33 TL)
4-Palov (44 TL)
5-Tamam

       4. Verilen siparişleri main de bir döngü vasıtasıyla TechnoKitchen isimli
       classa tek tek göndererek hazırlatınız, ve ücret bilgisini oluşturup.
       yazdırınız. */

    public static void main(String[] args) {
        List<IFood>siparisler=new ArrayList<>();
        Scanner oku=new Scanner(System.in);

        int sayac=-1;
        int secim=0;
        do{
            menu();
            secim= oku.nextInt();

            switch (secim){
                case 1:
                    IFood ak=new adanaKebap();
                    siparisler.add(ak);
                    break;
                case 2:
                    IFood lh=new lahmacun();
                    siparisler.add(lh);
                    break;
                case 3:
                    IFood br=new borsh();
                    siparisler.add(br);
                    break;
                case 4:
                    IFood pl=new palov();
                    siparisler.add(pl);
                    break;
            }
            sayac++;
        }while (secim<5);

        System.out.println("\nAlınan Siparişler\n");
        for(IFood f:siparisler){
            System.out.println(f.getClass().getSimpleName());
        }

        System.out.println("\nSiparişleriniz hazırlanıyor...");
        MyFunc.Bekle(2); // src klasörü içinde oluşturduğumuz BEKLETME METODUnu kullandık.

        double toplam=0;
        for (IFood f:siparisler){
            TechnoKitchen.hazirla(f);
            toplam+=f.ucret();
            MyFunc.Bekle(2); // src klasörü içinde oluşturduğumuz BEKLETME METODUnu kullandık.
        }
        System.out.println("\nToplam Tutar: "+toplam+" TL");
        System.out.println("Sipariş Adedi: "+sayac);
    }
    public static void menu(){
        System.out.print("\n*****Menü*****"+
                "\n1- Adana Kebap (75 TL)"+
                "\n2- Lahmacun (30 TL)"+
                "\n3- Borsh (50 TL)"+
                "\n4- Palov (25 TL)"+
                "\n5- Tamam"+
                "\nSeçiminiz=");
    }
}
