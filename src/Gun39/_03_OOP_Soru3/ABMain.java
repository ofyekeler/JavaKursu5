package Gun39._03_OOP_Soru3;

public class ABMain {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("A.mesaj = " + a.mesaj);

        B b=new B();
        System.out.println("A.mesaj = " + b.mesaj);

        A a2=new A();
        System.out.println("A.mesaj = " + a.mesaj);

        // A bir önce ki soruda olduğu gibi STATİC olmadığı için,
        // yeni değerler geldikçe MESAJ ın içeriği değişti.
        // a2 de yeni MESAJ ını aldı ve değişti.
    }
}
/*
A.mesaj = A dan merhaba
A.mesaj = B den merhaba
A.mesaj = A dan merhaba
*/
