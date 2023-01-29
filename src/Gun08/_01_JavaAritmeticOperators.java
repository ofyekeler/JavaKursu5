package Gun08;

public class _01_JavaAritmeticOperators {
    public static void main(String[] args) {

        int a=9;
        int b=5;

        System.out.println("Toplama İşlemi");
        System.out.println("Toplama İşlemi= " + (a+b));

        System.out.println("Çıkarma İşlemi");
        System.out.println("Çıkarma İşlemi= " + (a-b));

        System.out.println("Çarpma İşlemi");
        System.out.println("Çarpma İşlemi= " + (a*b));

        System.out.println("Bölme İşlemi");
        System.out.println("Bölme İşlemi= " + (a/b)); // normalde 1.8,
                                 // fakat tam sayının tam sayıya bölümünde küsürat atılır.
                                 // Bu sebeple sonuç 1 olur, yuvarlama yapmaz. Çünkü int/int.
                                 // tam sonuç istersen bir tanesini double a çevirmen yeterli.

        /*  Toplama İşlemi
            Toplama İşlemi= 14
            Çıkarma İşlemi
            Çıkarma İşlemi= 4
            Çarpma İşlemi
            Çarpma İşlemi= 45
            Bölme İşlemi
            Bölme İşlemi= 1*/

        System.out.println("Bölme İşlemi= " + ((double)a/b));

        /* Bölme İşlemi= 1.8 */ // bölme işleminin sonucunu net verdi.

        // Modül İşlemi ->  % (bölme işlemindeki "kalan" demek, 11%4=3, 100%10=0, 3%4=3 gibi)
        // yani 3%4 gibi örneklerde kalan 3'tür. soldaki sayı küçükse,
        // soldaki sayıyı direk yazabilirsin.

        System.out.println("(a%b) = " + (a%b));

        /* (a%b) = 4 */

    }
}
