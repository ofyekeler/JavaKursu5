package Gun20;

public class _01_JavaMethod {
    public static void main(String[] args)
    {
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        merhabaYaz();  // giden yok, dönen yok
        toplamYaz(4, 5); // giden var, dönen yok
        int enb=Math.max(4, 5);  // giden de dönen de var. Bir şeye eşitliyebiliyorsam dönen de vardır.
        double sayi=Math.random();  // gideni yok döneni var.

        enbYaz(4, 5);  // gider var, dönen yok
        enb=enbBul(4, 5); // giden var dönen var
        System.out.println("enb = " + enb);
        // fonksiyonda return olduğu için mainde yazdırabiliyoruz
        // yani fonksiyonun sonucunu alabiliyoruz

    }

    public static int enbBul(int a, int b)   // --->  dönen tip
                                            // ("void" yerine "int" yazdık, çünkü dönen değer var.)
                                           // (artk tipsiz değil, tipi var)
    {
        int donecek=0;
        if (a>b)
            donecek=a;
        else
            donecek=b;

        return donecek;  // ----->  dönecek olan
    }
    public static void enbYaz(int a, int b)
    {
        if (a>b)
            System.out.println(a);
        else
            System.out.println(b);
    }

    public static void toplamYaz(int a, int b)
    {
        System.out.println(a+b);
    }
    public static void merhabaYaz()
    {
        System.out.println("Merhaba Dünya");
    }

}
