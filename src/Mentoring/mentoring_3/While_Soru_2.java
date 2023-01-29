package Mentoring.mentoring_3;

public class While_Soru_2 {
    public static void main(String[] args) {

        // Örnek Soru : 10 a kadar olan sayılardan random bir sayının, kendisine kadar olan çarpımını bulunuz.

        int randomNum = (int) (Math.random() * 10);
        System.out.println("random sayı: " + randomNum);

        int toplam = 1;

        while (randomNum > 1)
        {
            toplam *= randomNum;
            randomNum--;
        }
        System.out.println("sonuç : " + toplam);



    }
}
