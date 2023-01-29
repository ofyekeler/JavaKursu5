package Gun45;

public class _04_TekrarSoruları_13_cozum {
    public static void main(String[] args) {
        String[]arr={"A","B","C","D"};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

            if(arr[i].equals("D")) {
                System.out.println("Word Done");
                break;
            }
            continue;
        }
/* A B C D Word Done */
    }
}
