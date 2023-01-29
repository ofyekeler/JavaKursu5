package Mentoring.mentoring_1;

public class sampleQuestions {
    public static void main(String[] args) {

        int x = 6;
        int y = 12;

        int temp = x;
        x = y;
        y = temp;

        System.out.println("x in değeri : " + x);
        System.out.println("y nin değeri : " + y);

        //************************************************

        String givenString = "8 8 Bi fk AAAAA BBB CCCC";
        System.out.println("sonuc: " + givenString.replaceAll(" ", ""));



    }
}
