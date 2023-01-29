package aOdevler;

import java.util.Scanner;

public class _Odev_2022_11_15_ {
    public static void main(String[] args) {

        /* TODO (yapılacaklar listesi demek, metinler renkli olur):
            //  ödev : regex olarak neler yazılabiliyor google dan araştırılacak. */

        // 1- I love java** olan bir String oluşturun.
           //Bu cümlenin toplam karakter sayısını yazdırın.

            String okuA="I love java";
            int uzunlukA=okuA.length();
            System.out.println("uzunlukA = " + uzunlukA);

            /* uzunlukA = 11 */

        // 2-**Sprint planning** olan bir String oluşturun.
           //Bu dizenin toplam karakter sayısını yazdırın.

            String okuB="Sprint planning";
            int uzunlukB=okuB.length();
            System.out.println("uzunlukB = " + uzunlukB);

            /* uzunlukB = 15 */

        // 3- **apple** olan bir String oluşturun.
           //String'in _içinde_ **app** olup olmadığını **doğrula**.

            String okuC="apple";
            boolean varMiA=okuC.contains("app");
            System.out.println("varMiA = " + varMiA);

            /* varMiA = true */

        // 4- **orange** kelimesinden oluşan bir String oluşturun.
           // String'in **Apple**'a _eşit_ olup olmadığını doğrulayın.

            String okuD="orange";
            String okuE="Apple";
            boolean esitMiA=okuD.equals(okuE);
            System.out.println("esitMiA = " + esitMiA);

            /* esitMiA = false */

        // 5- **apple**  olan  bir String oluşturun.
           //String'in **apple**'a _eşit_ olup olmadığını doğrulayın.
           //_Büyük harf veya küçük harf önemli değildir._

            String okuF="apple";
            String okuG="apple";
            boolean esitMiB=okuF.equalsIgnoreCase(okuG);
            System.out.println("esitMiB = " + esitMiB);

            /* esitMiB = true */

        // 6- **Florida** kelimesinden bir String oluşturun.
           //Florida kelimesinin içindeki, sadece  **'o'**  harfinin bulunduğu indexini yazdırın.

            String okuH= "Florida";
            int indexA=okuH.indexOf("o");
            System.out.println("indexA = " + indexA);

            /* indexA = 2 */

        // 7- **Thank you** olan bir String oluşturun.
           //Thank you içindeki, sadece  **'y'** harfinin bulunduğu _konumu_ yazdırın.

            String okuI="Thank you";
            int indexB=okuI.indexOf("o");
            System.out.println("indexB = " + indexB);
            
            /* indexB = 7 */

        // 8- **Main method** oluşturun.
          //**Mouse** değerinde bir String oluştur.
          //Mouse String'inin 3_. sırasındaki karakteri_ yazdırın.
            
            String okuJ="Mouse";
            char karakterA=okuJ.charAt(3);
            System.out.println("karakterA = " + karakterA);

            /* karakterA = s */

        // 9- **paper** olan bir String oluşturun.
           //String'i _büyük harfe_ çevirin ve yazdırın.
           //örn: apple > APPLE

            String okuK="paper";
            String cevirA=okuK.toUpperCase();
            System.out.println("cevirA = " + cevirA);

            /* cevirA = PAPER */

        // 10- **OraNge** olan bir String oluşturun.
           //String'i _küçük harfe_ çevirin ve yazdırın.
           //örn: APPLE > apple

            String okuL="OraNge";
            String cevirB=okuL.toLowerCase();
            System.out.println("cevirB = " + cevirB);

            /* cevirB = orange */

        // 11-
           //**New Jersey** olan bir String oluşturun.
           // String'i _büyük harfe_ çevirin ve yazdırın

            String okuM="New Jersey";
            String cevirC=okuM.toUpperCase();
            System.out.println("cevirC = " + cevirC);

            /* cevirC = NEW JERSEY */

        //12- **New York** olan bir String oluşturun.
           // String'i _küçük harfe_ çevirin ve yazdırın.

            String okuN="New York";
            String cevirD=okuN.toLowerCase();
            System.out.println("cevirD = " + cevirD);

            /* cevirD = new york */

        // 13- **PADDLE** olan bir String oluşturun.
           //String'i _küçük harfe_ çevirin ve yazdırın.

            String okuO="PADDLE";
            String cevirE=okuO.toLowerCase();
            System.out.println("cevirE = " + cevirE);

            /* cevirE = paddle */

        // 14- **apple** olan bir String oluşturun.
           //String'in _içinde_ **app** olup olmadığını **doğrula**.

            String okuP="apple";
            boolean varMıB=okuP.contains("app");
            System.out.println("varMıB = " + varMıB);

            /* varMıB = true */

// ÖZEL SORULAR

        // 1- Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.

            Scanner okuR= new Scanner(System.in);
            System.out.print("Ad= ");
            String ad=okuR.nextLine();
            System.out.print("Soyad= ");
            String soyad=okuR.nextLine();
            System.out.println("Ad ve soyad= " + ad + " " + soyad);

            /* Ad= Faruk
               Soyad= Yekeler
               Ad ve soyad= Faruk Yekeler */

        // 2- Girilen bir kelimenin boş(Blank) olup olmadığını yazdırınız

            Scanner okuS= new Scanner(System.in);
            System.out.print("Kelime= ");
            String textA=okuS.next();
            boolean bosMu=textA.isEmpty();
            System.out.println("bosMu = " + bosMu);

            /* Kelime= elma
               bosMu = false */

        // 3- girilen bir cümledeki A harfi sayısını bulunuz.(Büyük küçük harf ayırımı olmadan)

            Scanner okuT= new Scanner(System.in);
            System.out.print("cümle= ");
            String sentenceA=okuT.nextLine();
            System.out.println("sentenceA= " + sentenceA.indexOf("A"));

            /* cümle= Ahmet KERİM
               sentenceA= 0 */

        // 4- girilen bir kelimenin ilk ve son harfini bulunuz.

            Scanner okuU= new Scanner(System.in);
            System.out.print("Kelime= ");
            String textB=okuU.next();
            char ilkHarf=textB.charAt(0);
            int uzunlukC=textB.length();
            char sonHarf=textB.charAt(uzunlukC-1);
            System.out.println("ilkHarf ve sonHarf= " + ilkHarf + " " + sonHarf);

            /* Kelime= bilgisayar
               ilkHarf ve sonHarf= b r */

        // 5- girilen bir cümledeki ilk kelimeyi yazdırınız

            Scanner okuV= new Scanner(System.in);
            System.out.print("Cümle= ");
            String sentenceB= okuV.nextLine();
            int bosluk=sentenceB.indexOf(" ");
            String parca1= sentenceB.substring(0,bosluk);
            System.out.println("parca1 = " + parca1);

            /* Cümle= Faruk YEKELER
               parca1 = Faruk */

        // 6- girilen en az 3 kelimelik bir cümledeki ilk iki kelimeyi yazdırınız

            Scanner okuW= new Scanner(System.in);
            System.out.print("Cümle= ");
            String sentenceC= okuW.nextLine();
            int boslukA=sentenceC.lastIndexOf(" ");
            String parca2=sentenceC.substring(0,boslukA);
            System.out.println("parca2 = " + parca2);

            /* Cümle= ben java severim
               parca2 = ben java */

        // 7- Girilen bir cümlede kaç kelime olduğunuz bulunuz.

            Scanner oku7 = new Scanner(System.in);
            System.out.print("Cümle= ");
            String sentence7 = oku7.nextLine();
            String bosluklar = sentence7.replaceAll("[^ ]", "");
            int bosInSayi=bosluklar.length();
            System.out.println(bosInSayi+1);

        // 8- Girilen bir cumledeki kelimelerin ilk harflerini yazdırınız.

            Scanner okuY= new Scanner(System.in);
            System.out.print("Cümle yazınız= ");
            String sentenceE=okuY.nextLine();
            System.out.println("ilk harfler: " + sentenceE.replaceAll("\\B\\S", ""));

            /* Cümle yazınız= Faruk YEKELER Meryem İkra
               ilk harfler= F Y M İ */


        // 9- 3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.E.Y. şeklinde yazınız.

            Scanner okuZ= new Scanner(System.in);
            System.out.print("3 Kelimelik İsim= ");
            String sentenceF=okuZ.nextLine();
            char ilkHarfE=sentenceF.charAt(0);
            int boslukIndex2=sentenceF.indexOf(" ");
            char ikinciHarff=sentenceF.charAt(boslukIndex2+1);
            int boslukIndexSon=sentenceF.lastIndexOf(" ");
            char ucuncuHarf=sentenceF.charAt(boslukIndexSon+1);
            System.out.println("Baş Harfler= "+ilkHarfE+"."+ikinciHarff+"."+ucuncuHarf+".");

            /* 3 Kelimelik İsim= Ömer Faruk YEKELER
               Baş Harfler= Ö.F.Y. */

    }
}
