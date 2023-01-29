package Mentoring.mentoring_5;

import java.util.Arrays;
import java.util.Scanner;

public class Java2DArray {
    public static void main(String[] args) {

        int[] arr1 = new int[5];  // atama yapmadığımız beş elemanlı bir array tanımladık
        int[] arr2 = {3,4,5,6,7}; // 5 elemanlı bir dizi tanımladık

        System.out.println(Arrays.toString(arr2));

        int[][] dizi1 = new int[2][3];  //2x3 yani 6 elemanlı 2D array tanımladık

        int[][] dizi2 = {
                {10,20,30},
                {40,50,60},
                {45,55,65,75,85}
        };
        System.out.println(Arrays.toString(dizi2[0]));  // ilk satırı döndürür

        for (int i = 0; i < dizi2.length; i++) {
            for (int j = 0; j < dizi2[i].length; j++) {
                System.out.print(dizi2[i][j] + "\t");
            }
        }

        System.out.println("\n" + Arrays.deepToString(dizi2));// Arrays.deepToString 2D boyutlu dizileri dizelere dönüştürüp yazar
        //**********************************************************

        String[][] str = new String[2][3];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                System.out.print("şehir: ");
                str[i][j] = input.nextLine();
            }
        }

        System.out.println(Arrays.deepToString(str));


    }
}
