package Gun44;

public class _08_TekrarSoruları_071 {
    public static void main(String[] args) {
        int[]intArr={15,30,45,60,75};
        intArr[2]=intArr[4];
        intArr[4]=90;
        // What are the values of each element in intArr after this code has executed?
        for (int i = 0; i < intArr.length-1; i++) {
            System.out.print(intArr[i]+", ");
        }
        System.out.println(intArr[intArr.length-1]);
/* 15, 30, 75, 60, 90 */
    }
}
