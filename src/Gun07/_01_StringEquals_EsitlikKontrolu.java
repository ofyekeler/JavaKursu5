package Gun07;

public class _01_StringEquals_EsitlikKontrolu {
    public static void main(String[] args) {

        // equals: 2 stringin birbirine eşit olup olmadığını kontrol eder.
        // sonuç boolean olur. True/False.

        String s1="Merhaba";
        String s2="MERHABA";

        boolean esitMi=s1.equals(s2); // s1 eşit mi s2 ye.

        System.out.println("esitMi = " + esitMi);

        /* esitMi = false */

    }
}
