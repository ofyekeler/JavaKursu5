package Gun08;

public class _05_JavaAssignmentOperators {
    public static void main(String[] args) {

        int a=10;

        a=a+5;  // a=15 olur.
        a+=5;   // yine aynı olur.

        System.out.println("a = " + a);

        int b=10;

        b=b-5;   // b=5 olur.
        b-=5;    // aynı işlem.

        System.out.println("b = " + b);

        /* a = 20
           b = 0 */

        int c=10;
        // c=c/5;  ile
        c/=5; // ile aynı

        System.out.println("c = " + c); // c = 2

        int d=10;
        //  d=d*5   ile
        d*=5;

        System.out.println("d = " + d); // d = 50

    }
}
