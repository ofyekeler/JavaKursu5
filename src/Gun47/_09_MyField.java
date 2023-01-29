package Gun47;

public class _09_MyField {
    int x; //default 0
    int y; //default 0

    public void doStuff(int x, int y){ // 100 200
        x=x; // parametreyi parametre atadın   nesnenin kendi x i değişmedi 0
        y=this.y; // nesnenin y değişti mi HAYIR  0 kaldı
        // this.y=y -> olsaydı y ye 200 atanmış olurdu.
    }
    public void display() {
        System.out.println(x + " " + y + " : ");
    }

    public static void main(String[] args) {
        _09_MyField m1 = new _09_MyField();
        m1.x = 100;
        m1.y = 200;
//        System.out.println("m1.x = " + m1.x); // 100
//        System.out.println("m1.y = " + m1.y); // 200

        _09_MyField m2 = new _09_MyField();
        m2.doStuff(m1.x, m1.y); // 100 200 gitti

        m1.display(); // 100 200
        m2.display(); // 0 0
/*
100 200 :
0 0 :
*/
    }
}
