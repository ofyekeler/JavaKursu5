package Gun14;

public class _03_Ornek1 {
    public static void main(String[] args) {

        // 0 dan 10'a kadar (10 dahil) sayıları ekrana yazdırınız.
        // 10 dan 0'a kadar (0 dahil) sayıları ekrana yazdırınız. (ayrı bir diğer for)

        for (int i01=0; i01<=10; i01++)
            System.out.println("i01= " + i01);

        for (int i02=10; i02>=0; i02--)
            System.out.println("i02= " + i02);

        /* i01= 0
           i01= 1  i02= 10
           i01= 2  i02= 9
           i01= 3  i02= 8
           i01= 4  i02= 7
           i01= 5  i02= 6
           i01= 6  i02= 5
           i01= 7  i02= 4
           i01= 8  i02= 3
           i01= 9  i02= 2
           i01= 10 i02= 1
                   i02= 0 */

    }
}
