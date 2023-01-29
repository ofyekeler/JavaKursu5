package Gun30._03_GununSorusu;

public class GununSorusu {
    int a;
    static int b=0; // sen bir tanesin

    void artir(){
        a++;
        b++;
    }
    public static void main(String[] args) {
        GununSorusu gs1=new GununSorusu();
        gs1.a=5;
        GununSorusu gs2=new GununSorusu();
        gs2.a=7;

        // a'nın değer kaç oldu şu an? Cevap:: Burada verilecek cevap
            // "hangi a'yı soruyorsunuz?"
        // Burada her nesnenin a'sı var ve gs1 in 5, gs2 nin ise 7 değeri var.

        System.out.println("gs1.a= " + gs1.a);
        System.out.println("gs2.a= " + gs2.a);
/*
gs1.a= 5
gs2.a= 7
*/
        // Soru: b'nin değeri kaçtır?? Cevap :: tek bir değeri vardır, en son değer

        System.out.println("GununSorusu.b = " + GununSorusu.b);
/*
GununSorusu.b = 0
*/
        
        // Soru: a'nın ve b'nin en son değerleri kaçtır?
        gs1.artir(); // gs1.a -> 6 , b=1
        gs2.artir(); // gs2.a -> 8 , b=2

        System.out.println("gs1.a = " + gs1.a);
        System.out.println("gs2.a = " + gs2.a);
        System.out.println("GununSorusu.b = " + GununSorusu.b);
/*
        gs1.a = 6
        gs2.a = 8
GununSorusu.b = 2
*/
    }
}
