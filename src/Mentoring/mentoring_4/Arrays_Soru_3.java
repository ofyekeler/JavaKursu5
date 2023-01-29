package Mentoring.mentoring_4;

public class Arrays_Soru_3 {
    public static void main(String[] args) {

        // Soru : Aşağıdaki dizide tekrar eden elemanları yazdırın

        int[] arr = {2, 4 ,6 ,8 ,4 ,10, 6, 10};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1 ; j < arr.length ; j++) {
                if(arr[i] == arr[j]){
                    System.out.print(arr[i] + " ");
                }
            }
        }




    }
}
