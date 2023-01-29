package Mentoring.mentoring_4;

public class Continue {
    public static void main(String[] args) {


        // continue : döngüyü sonlandırmadan ilgili koşul sağlandığında alt satırdaki kod bloğunu es geçer.

        for (int i = 0; i <= 10; i++) {  // 10 a kadar sayıları yazdıralım ancak 5 i atlasın

            if(i == 5){
                continue;
            }
            System.out.println(i);

        }


    }
}
