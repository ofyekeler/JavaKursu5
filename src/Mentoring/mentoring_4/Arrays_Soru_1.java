package Mentoring.mentoring_4;

public class Arrays_Soru_1 {
    public static void main(String[] args) {

        // Soru : Verilen dizideki en büyük elemanı yazdırınız.

        int[] arr = new int[]{11, 22, 33, 99, 88, 77};

        int max = arr[0];  // 11

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("en büyük eleman: " + max);
    }
}
