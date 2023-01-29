package Gun30._01_StaticVeriables.Ornek2;

public class School {
    public static void main(String[] args) {
        Student ogr1=new Student(1, "İsmet Temur");
        Student ogr2=new Student(2, "Mehmet Yılmaz");
        Student ogr3=new Student(3, "Beyza Demir");

        // Problem: hem id yi takip etmek zorundayım.
        // hem de hata olasılığı yüksek

        Student ogr11=new Student(Student.sayac++,"İsmet Temur");
        Student ogr12=new Student("Mehmet Yılmaz"); // "Student.sayac++" yazmaya gerek yok.
        Student ogr13=new Student("Beyza Demir");

        System.out.println("ogr11 = " + ogr11);
        System.out.println("ogr12 = " + ogr12);
        System.out.println("ogr13 = " + ogr13);

/*
ogr11 = Student{id=1, fullName='İsmet Temur'}
ogr12 = Student{id=2, fullName='Mehmet Yılmaz'}
ogr13 = Student{id=3, fullName='Beyza Demir'}
*/
    }
}
