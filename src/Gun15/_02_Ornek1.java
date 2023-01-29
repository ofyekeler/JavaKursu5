package Gun15;

public class _02_Ornek1 {
    public static void main(String[] args) {

        // 2 lerin çarpım tablosunu sormuştuk.
        // 2x1=2
        // 2x2=4 ....

        // 5 lere kadar (dahil) halini yapınız.

        for (int j = 1; j <= 5; j++) // her dış döngüde 1 artar.
                                     // iç göngü 10 kere dönünce  dış dönü 1 artıyor.
        {
            for (int i = 1; i < 10; i++) // her iç döngüde 1 artar
            {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
            System.out.println();
        }
/* 1x1=1
2x1=2
3x1=3
4x1=4
5x1=5
6x1=6
7x1=7
8x1=8
9x1=9

1x2=2
2x2=4
3x2=6
4x2=8
5x2=10
6x2=12
7x2=14
8x2=16
9x2=18

1x3=3
2x3=6
3x3=9
4x3=12
5x3=15
6x3=18
7x3=21
8x3=24
9x3=27

1x4=4
2x4=8
3x4=12
4x4=16
5x4=20
6x4=24
7x4=28
8x4=32
9x4=36

1x5=5
2x5=10
3x5=15
4x5=20
5x5=25
6x5=30
7x5=35
8x5=40
9x5=45 */
    }
}
