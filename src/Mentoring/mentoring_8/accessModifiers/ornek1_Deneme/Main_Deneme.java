package Mentoring.mentoring_8.accessModifiers.ornek1_Deneme;

import Mentoring.mentoring_8.accessModifiers.ornek1.Student;

public class Main_Deneme {
    public static void main(String[] args) {

        Student student2 = new Student("Ali", "YILMAZ", 12, "Türkiye");

        System.out.println(student2.name);  // public olduğu için erişim sağladık
//        System.out.println(student2.surname);  // default olduğu için erişim yok
//        System.out.println(student2.age); // private olduğu için erişim yok
//        System.out.println(student2.address);  // protected olduğu için erişim yok.
    }
}
