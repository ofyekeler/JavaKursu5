package Gun38._01_Abstract_Class;

public class OtoMain {
    public static void main(String[] args) {
        Ford fr=new Ford("Mustang",1995,7);// ford normal bir class ve nesne oluşturulabilir.
                                                    // yani "new" yapılabilir.
        // IBinekOto ib=new IBinekOto();   // Interface lerde NESNE oluturulaMAZ. Sadece REFERANS tip olabilirler.

        // BinekOto bo=new BinekOto("mustang",1995,7); // ABSTRACT class lardan da NESNE oluşturalaMAZ.
                                                       // Sadece REFERANS.
    }
}
