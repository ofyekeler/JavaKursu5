package Mentoring.mentoring_8.static_keyword.ornek1;

public class Main {
    public static void main(String[] args) {

        // static : Bir classın aynı değişkenini veya metodunu paylaşmak için ve
        // hafıza yönetimi için kullanılır. static değişken classa aittir.



        Student student1 = new Student("Ece", "YILDIZ", 121);
        Student student2 = new Student("Efe", "YILMAZ", 122);
        Student student3 = new Student("Yağmur", "DAMLA", 123);
        Student student4 = new Student("Benan", "ÇELİK", 124);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);


    }
}
