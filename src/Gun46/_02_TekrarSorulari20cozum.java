package Gun46;

public class _02_TekrarSorulari20cozum {
    public static void main(String[] args) {

        int [][] arr=new int [2][4]; // 2. boyut yani sütun aşağıda yeniden boyutlandırılıyor.

        arr[0]=new int []{1,3,5,7}; // satır 0 ; bu satırı yeniden oluşturuyor.
        arr[1]=new int []{1,3};    // satır 1 ; bu satırı yeniden oluşturuyor.

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("***************"); // 2. yöntem

        for (int [] a : arr) { // arr SATIRLARDAN oluşuyor.
            for (int i : a) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
