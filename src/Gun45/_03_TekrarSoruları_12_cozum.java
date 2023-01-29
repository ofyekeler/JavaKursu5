package Gun45;

public class _03_TekrarSoruları_12_cozum {
    public static void main(String[] args) {
        String[]arr={"A","B","C","D"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");

            if(arr[i].equals("C")){
                continue;
            }
            System.out.println("Word Done");
            break;
        }
/*
A
Word Done
*/
    }
}
