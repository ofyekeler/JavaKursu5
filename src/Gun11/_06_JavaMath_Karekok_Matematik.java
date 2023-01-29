package Gun11;

public class _06_JavaMath_Karekok_Matematik {
    public static void main(String[] args) {

        int a = -12;
        int b = 4;

        System.out.println(   "a nın mutlak değeri= " + Math.abs(a)); // mutlak değerini alır
        System.out.println("a ve b den büyük olanı= " + Math.max(a, b));
        System.out.println("a ve b den küçük olanı= " + Math.min(a, b));
        System.out.println(   "2 nin 3 üncü kuveti= " + Math.pow(2, 3)); // üssü işareti
        System.out.println(        "b nin karekökü= " + Math.sqrt(b)); // karekökü
        System.out.println(             "round 3.1= " + Math.round(3.1)); // yuvarlama
        System.out.println(              "ceil 3.1= " + Math.ceil(3.1)); // ilgili rakamdan büyük en yakın tam sayı
        System.out.println(             "floor 3.1= " + Math.floor(3.1)); // ilgili rakamdan küçük en yakın tam sayı

        int enb=Gun20._01_JavaMethod.enbBul(a,b); // Gun20 dersi ile alakalı
                    // başka pakette bulunan fonkiyonu başka bir pakete çağırma

        /* a nın mutlak değeri= 12
           a ve b den büyük olanı= 4
           a ve b den küçük olanı= -12
           2 nin 3 üncü kuveti= 8.0
           b nin karekökü= 2.0
           round 3.1= 3
           ceil 3.1= 4.0
           floor 3.1= 3.0 */

    }
}
