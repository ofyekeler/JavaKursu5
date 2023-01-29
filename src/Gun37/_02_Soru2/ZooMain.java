package Gun37._02_Soru2;

import java.util.ArrayList;

public class ZooMain {
    /*
    Ekteki Tasarıma göre gerekli modülleri yazınız.
Sonra her birinden nesne üretiniz.

- ürettiğiniz nesneleri bir ArrayListe ekletip, daha sonra bu ArrayList i
bir döngü ile metodlarını ekrana yazdırınız.
metodların hepsinin tipi String
    */
    public static void main(String[] args) {
        Swallow kus=new Swallow();
        Cat kedi=new Cat();
        Shark kopekbaligi=new Shark();
        Duck ordek=new Duck();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(kus);
        animals.add(kedi);
        animals.add(kopekbaligi);
        animals.add(ordek);

        for (Animal a : animals) {
            // GETSIMPLENAME  class adını yazdırmanın kolay yöntemi
            System.out.println();
            System.out.println("Hayvanın adı: " + a.getClass().getSimpleName());
            System.out.println("**************************");

            if (a instanceof Swallow) {
                System.out.println(((Swallow) a).food());
                System.out.println(((Swallow) a).flying());
            } else if (a instanceof Cat) {
                System.out.println(((Cat) a).food());
            } else if (a instanceof Shark) {
                System.out.println(((Shark) a).food());
                System.out.println(((Shark) a).sailing());
            } else if (a instanceof Duck) {
                System.out.println(((Duck) a).food());
                System.out.println(((Duck) a).flying());
                System.out.println(((Duck) a).sailing());
            }}}}
/*
Hayvanın adı: Swallow
**************************
Kırlangıç solucan yer.
Kırlangıç orta yükseklikte uçar.

Hayvanın adı: Cat
**************************
Kedi kılçık yer.

Hayvanın adı: Shark
**************************
Küçük balıkları yer.
Derinlerde yüzebilir.

Hayvanın adı: Duck
**************************
Örnek arpa yer.
Sürü şeklinde uçarlar.
Su üstünde yüzerler.
*/
