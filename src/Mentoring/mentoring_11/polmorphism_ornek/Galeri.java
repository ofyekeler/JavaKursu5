package Mentoring.mentoring_11.polmorphism_ornek;

public class Galeri {
    public static void main(String[] args) {

        // Polymorphism (çok biçimlilik) -> bir  nesnenin farklı formlarda kullanımı.
        // aynı eylemi farklı şekilde gerçekleştirmemize izin veren java konspetidir.


        // polymorphism = overloading & overriding

        Araba araba1 = new Araba();
        araba1.yakit();
        araba1.motor();
        System.out.println();

        ArabaBenzinli araba2 = new ArabaBenzinli();
        araba2.motor();
        araba2.yakit();
        araba2.yakit(55);

        Araba araba3 = new ArabaBenzinli();
//        araba3.yakit(55);  // araba3 tipi Araba classından geldiği için ulaşamıyoruz
        System.out.println();

        ArabaElektrikli araba4 = new ArabaElektrikli();
        araba4.motor();
        araba4.yakit();
        System.out.println();

        ArabaLPG araba5 = new ArabaLPG();
        araba5.motor();
        araba5.yakit();


    }
}
