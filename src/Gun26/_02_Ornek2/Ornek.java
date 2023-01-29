package Gun26._02_Ornek2;

public class Ornek {
    public static void main(String[] args) {

        // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- Adım : Bu degerlerı yazıdırınız.
        // 4. Adım: getBirthYear isminde Person a iat bir method yazınız.
                    // çalıştığında kişinin doğum yıını versin.
        // 5- Adım: getInitials isminde kişinin adının ilk harfi sayadının ilk harfi
            // şeklinde (Büyük Harf) veren metodu yazınız.

        Person cal1=new Person();
        cal1.name="Hatice";
        cal1.surName="Demir";
        cal1.age=30;

        Person cal2=new Person();
        cal2.name="Muhammed";
        cal2.surName="Gürdal";
        cal2.age=35;

        // 1. yöntem

        System.out.println("cal1.name = " + cal1.name);
        System.out.println("cal1.surName = " + cal1.surName);
        System.out.println("cal1.age = " + cal1.age);

        System.out.println("cal2.name = " + cal2.name);
        System.out.println("cal2.surName = " + cal2.surName);
        System.out.println("cal2.age = " + cal2.age);

        // 2. yöntem (normal metod)

        BilgiYazdir(cal1);
        BilgiYazdir(cal2);

        // 3. yöntem (metod'u, ait olduğu class dan çağırıyoruz)

        cal1.BilgiYazdir();
        cal2.BilgiYazdir();

        // 4. yöntem (2. class tan toString metodu ile yazdırma
        System.out.println("cal1 = " + cal1);// Person'da ki toString Metrod u ile çalıştırdık.
                                   // burada aslında yazan "cal1.toString"

        // 4. adım 1. yöntem
        System.out.println("cal1 = " + cal1);
        cal1.getBirthYear();

        // 4. adım 2. yöntem
        System.out.println(cal2.getBirthYear2());

        // 5. adım
        cal1.getInitials();
    }
    public static void BilgiYazdir(Person cal){

        System.out.println("cal.name = " + cal.name);
        System.out.println("cal.surName = " + cal.surName);
        System.out.println("cal.age = " + cal.age);

    }
/*
   cal1.name = Hatice
cal1.surName = Demir
    cal1.age = 30
   cal2.name = Muhammed
cal2.surName = Gürdal
    cal2.age = 35
    cal.name = Hatice
 cal.surName = Demir
     cal.age = 30
    cal.name = Muhammed
 cal.surName = Gürdal
     cal.age = 35
        name = Hatice
     surName = Demir
         age = 30
        name = Muhammed
     surName = Gürdal
         age = 35
*/
}
