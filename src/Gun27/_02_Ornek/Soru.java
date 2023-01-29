package Gun27._02_Ornek;

public class Soru {
    // Math sınıfındaki metodlarından 5 tanesini
            // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
            // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
    // mainden nesne oluşturmadan direk kullanılmasını sağlatacak
            // örnek kullanımlarını yazınız.

    public static void main(String[] args) {

        int max=MyMath.getMax(4,6);
        int min=MyMath.getMin(4,6);
        int rnd=MyMath.getRnd(10);
        double usSonuc=MyMath.getUsAl(4,6);
        double kareKok=MyMath.getKareKok(4);

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("rnd = " + rnd);
        System.out.println("usSonuc = " + usSonuc);
        System.out.println("kareKok = " + kareKok);
    }
/*
    max = 6
    min = 4
    rnd = 5
usSonuc = 4096.0
kareKok = 2.0
*/
}
