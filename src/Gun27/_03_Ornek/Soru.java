package Gun27._03_Ornek;

public class Soru {

    // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
    // 1- Lesson : fields : name, saat (1-10 arasında değer alıyor).
    // 2- Student: fields : name, maxSaat, dersleri adında derslerini listesini tutacak bir liste.
    // 3- 3 adet ders oluşturunuz.
    // 4- 1 adet öğrenci tanımlayınız alabileceği maxCredit(maxSaat) si 10 olsun.
    // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
         // ders eklerken max alabileceği Saati geçmemeli, geçerse
         // uyarı versi, alabileceğiniz max Saati doldu şeklinde.
    // 6- Unıversıte kurallarını yazdıran 2 maddelik bir not yazdıran metod ekleyinız.en basta
         // yazdırınız.

    public static void main(String[] args) {

        Student.universityRules();
        System.out.println("***************");

        Lessons lesson1=new Lessons();
        lesson1.name="Algoritma";
        lesson1.hour=4;

        Lessons lesson2=new Lessons();
        lesson2.name="Java";
        lesson2.hour=4;

        Lessons lesson3=new Lessons();
        lesson3.name="Test Tools";
        lesson3.hour=3;

        Student std1=new Student();
        std1.name="Faruk";
        std1.maxHour=10;

        std1.addLesson(lesson1); // nesnenin özelliklerini kullanacağından STATIC olmayacak
        std1.addLesson(lesson2);
        std1.addLesson(lesson3);
        std1.lessonsPrint();
    }
/*
Kural 1:
Kural 2:
Kural 3:
Kural 4:
Kural 5:
***************
Kredi sınırı aşılmıştır. Eklenmeyen Ders: Test Tools

*** Transkript ***
Sayın Faruk
Aldığınız dersler aşağıdadır.
Algoritma 4
Java 4
*/
}
