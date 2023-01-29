package Mentoring.mentoring_6;

import java.util.Arrays;

public class Method_Ornek {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayUret(3,6)));


    }

    public static int[] arrayUret(int a, int b){
        int[] arr = new int[4];
        arr[0] = a;
        arr[1] = b;
        arr[2] = (int) (Math.random() * 10);

        return arr;
    }
}
