package Gun45;

public class _10_TekrarSoruları_19_cozum {
    public static void main(String[] args) {
        String[][]arr={{"A","B","C"}, {"D","E"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
                if (arr[i][j].equals("B")){
                    continue;
                }
            }
            continue;
        }
/* A B C D E */
    }
}
