package Mentoring.mentoring_10.Java_Interface;

public class Main {
    public static void main(String[] args) {

        // Interface, bir classın davranışını belirtmek için kullanılan soyut bir türdür
        // Interface body olmayan metodlarıyla kendisini implement eden child classlar için şablon/planlama olarak kullanılır
        // Bir classbirden fazla interface implement edebilir

        Dikdortgen dikdortgen = new Dikdortgen(12, 3, "mavi");
        System.out.println(dikdortgen);

        System.out.println();
        Daire  daire = new Daire(3, "fuşya");
        System.out.println(daire);
    }
}
