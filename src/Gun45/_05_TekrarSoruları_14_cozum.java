package Gun45;

public class _05_TekrarSoruları_14_cozum {
    public static void main(String[] args) {
        int numbers[];
        numbers=new int[2];
        numbers[0]=10;
        numbers[1]=20;

        numbers=new int [4]; // new yazdığı için öncekiler sıfırlanıyor.
        numbers[2]=30;
        numbers[3]=40;
        for (int x : numbers){
            System.out.println(" "+x);
        }
/* 0 0 30 40 */
    }
}
