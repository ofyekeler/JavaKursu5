package Gun39._02_OOP_Soru2;

public class ABMain {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("A.mesaj = " + A.mesaj);
        
        B b=new B();
        System.out.println("A.mesaj = " + A.mesaj);
        
        A a2=new A();
        System.out.println("A.mesaj = " + A.mesaj);

        // mesaj nesnesinin metodu STATIC olduğu için TEKTİR. En son ne değer aldıysa onu yazdırır.
        // B de değişen sout u a2 de tekrar yazdırır.
    }
}
/*
A.mesaj = A dan merhaba
A.mesaj = B den mesaj var
A.mesaj = B den mesaj var
*/
