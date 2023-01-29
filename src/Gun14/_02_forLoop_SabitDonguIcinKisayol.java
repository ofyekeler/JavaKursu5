package Gun14;

public class _02_forLoop_SabitDonguIcinKisayol {
    public static void main(String[] args) {

        // 1 den 5 e kadar olan sayıları yazdırınız.
        // eğer artış oranı (kaç kere döneceği) sabitse ve aralık da belliyse... "for"
                          // kaç kere döneceği belli değilse "while"
                          // döngü kontrolü işlem sonunda ise "do {} while"

        for (int i=1; i<=5; i++)   // bu dersten sonra sayaç yerine "i" kullanacağız.
        System.out.println("i= " + i);
        // yaz -> kontrol -> işlem, yaz -> kontrol -> işlem, yaz -> kontrol -> işlem

        /* i = 1
           i = 2
           i = 3
           i = 4
           i = 5 */
    }
}
