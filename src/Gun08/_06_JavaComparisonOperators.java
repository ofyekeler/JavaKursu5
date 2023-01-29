package Gun08;

public class _06_JavaComparisonOperators {
    public static void main(String[] args) {

        int a=50;
        int b=50;

        // = burada atama işaretidir, == iki eşittir ise "eşit mi?" demektir.
        System.out.println("a, b eşit mi?= " + (a==b));
        /* a==b = true */

        System.out.println("a, b farklı mı?= " + (a!=b)); // "!= farklı mı" demek.
        /* a, b farklı mı?= false */

        System.out.println("(a>b) = " + (a>b));
        /* (a>b) = false */

        System.out.println("(a<b) = " + (a<b));
        /* (a<b) = false */

        System.out.println("(a>=b) = " + (a>=b));
        /* (a>=b) = true */

        System.out.println("(a<=b) = " + (a<=b));
        /* (a<=b) = true */

    }
}
