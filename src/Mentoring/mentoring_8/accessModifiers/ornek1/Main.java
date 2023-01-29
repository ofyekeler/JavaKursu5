package Mentoring.mentoring_8.accessModifiers.ornek1;

public class Main {
    public static void main(String[] args) {


        // Access Modifiers: Java'daki erişim belirteçleri bir alanın, bir metodun veya
        // classın erişilebilirliğini veya kapsamını belirtir

        // 1 - publiç: Proje içinden her yerden erişilebilir
        // 2- private : Kendi classı dışından erişilemez
        // 3 - Default : Aynı paket içinden erişilir
        // 4- Protected : Default gibidir ancak extend edildiğinde paketlerden de erişilebilir


        Student student1 = new Student("Ece", "YILDIZ", 12, "Türkiye");

        System.out.println(student1.name);
        System.out.println(student1.surname);
        System.out.println(student1.address);
//        System.out.println(student1.age);  // aynı paket içinde de olsa private olduğu için ulaşamıyoruz
        System.out.println(student1.getAge());

    }
}
