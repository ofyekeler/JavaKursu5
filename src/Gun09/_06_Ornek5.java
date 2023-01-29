package Gun09;

import java.util.Scanner;

public class _06_Ornek5 {
    public static void main(String[] args) {

        // Girilen bir cümlede "a" (küçük a) harfinin bulunup bulunmadığını bulunuz
        // Bulunuyor ise EVET, bulunmuyor ise HAYR yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle= ");
        String cumle= oku.nextLine();

        if(cumle.contains("a"))
            System.out.println("EVET");
        if (!cumle.contains("a"))  // değilse
            System.out.println("HAYIR");

        // 2. Yöntem
        /* if (cumle.indexOf("a") !=-1)  => Olmayan karakterde -1 sonucunu verirdi, hatırla !!!
            System.out.println("EVET");
        if (cumle.indexOf("a") ==-1)
            System.out.println("HAYIR");

        // 3. yöntem
        /* boolean aHarfi=cumle.contains("a");

        System.out.println("aHarfi = " + aHarfi);

        if (aHarfi == true)    ya da "if (aHarfi)"  diye de biliriz.
            System.out.println("EVET");
        if (aHarfi != true)    ya da (aHarfi==false) denilebilir.
            System.out.println("HAYIR");

        /* Cümle= Elma
           aHarfi = true
           EVET

           Cümle= Erik
           aHarfi = false
           HAYIR */

    }
}
