package Mentoring.mentoring_10.Java_abstract;

public class Main {
    public static void main(String[] args) {

        //Projede Abstract classı genel özelliklerini belirlemek ve aktarmak için kullanılırız
        // Classın Abstract class olmasına karar vermek için -> Obje üretecek miyim? sorusunu sorarız
        // Abstract class soyut olduğu için nesne üretemiyoruz ancak child classlar nesne üretebilir
        // Abstract classlarda constructor olabilir, abstarct olan/olmayan metodlar ve fields ekleyebiliriz.

        Dikdortgen dikdortgen1 = new Dikdortgen("beyaz", 12, 7);
        System.out.println(dikdortgen1);

        System.out.println();
        Sekil dikdortgen2 = new Dikdortgen("sarı", 8, 5); // new Dikdortgen dediğimiz için başta Sekil classını kullanabildik
        System.out.println(dikdortgen2);

        System.out.println();
        Sekil daire = new Daire("fuşya", 3);
        System.out.println(daire);
    }
}
