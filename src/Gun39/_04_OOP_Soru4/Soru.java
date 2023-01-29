package Gun39._04_OOP_Soru4;

class C{ // dede
    public C(){
        System.out.print("C");
    }
}
class B extends C{ // baba
    public B(){
        System.out.print("B");
    }
}
class A extends B{  // torun
    public A(){
        // super();     Burada gizli bir SUPER var.
        System.out.print("A");
    }
}
public class Soru {
    public static void main(String[] args) {
        A a=new A();
    }
}
// CBA
