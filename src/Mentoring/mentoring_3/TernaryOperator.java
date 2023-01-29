package Mentoring.mentoring_3;

public class TernaryOperator {
    public static void main(String[] args) {

        // Ternary Operator: programda koşullu bir ifade kullanılacaksa ve basit bir koşulsa if-else durumu yerine kullanıyoruz

        String str = "Techno Study";

        if (str.contains(" ")){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        // 1. yöntem
        System.out.println(str.contains(" ") ? true : false);  // direk print ettiğimizde dönüş data type farklılıkları sorun olmaz

        System.out.println("*************");

        // 2. yöntem
        String  b = str.contains(" ") ? "true" : "false";  // değişkene atayarak yazdıysam dönüş data taype aynı olmalı
        System.out.println(b);
    }
}
