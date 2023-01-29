package Mentoring.mentoring_8.accessModifiers.ornek2;

import Mentoring.mentoring_8.accessModifiers.ornek2_Deneme.Teacher;

public class Main {
    public static void main(String[] args) {


        Human human = new Human("Ece", "YILDIZ", 25, "Türkiye");

        System.out.println(human);  // bu şekilde nesnenin toString() metodu ile tüm bilgilerine ulaştık

        Teacher teacher = new Teacher("Cem", "YILMAZ", 33, "Türkiye", 123);

        System.out.println(teacher);  // Human extend olduğu için protected field erişim sağlandı





    }
}
