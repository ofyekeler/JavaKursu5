package Mentoring.mentoring_4;

import java.util.Arrays;

public class Arrays_Soru_2 {
    public static void main(String[] args) {


        // Soru: Aşağıdaki character array i string e çeviriniz

        char[] ch = {'m', 'e', 'r', 'h', 'a', 'b', 'a', ' ', 'j', 'a', 'v', 'a'};

        System.out.println("ilk hali: " + Arrays.toString(ch));


        //1.yöntem
        String str = String.valueOf(ch);  // String.valueOf() farklı değer türlerini stringe dönüştürür. char/ int/ boolean/ double vs
        System.out.println("1.yöntem: "  +str);

        // 2.yöntem
        String str1 = new String(ch);
        System.out.println("2.yöntem : " + str1);


    }
}
