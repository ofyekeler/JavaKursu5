package Gun44;

public class _03_TekrarSorulari_021 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4}; // index: 0,1,2,3  4. element yok
        int i=0;
        do {
            System.out.print(arr[i]+" ");
            i++;
        }while (i< arr.length+1); // burada +1 olması işi bozdu.
/* 1 2 3 4 followed by an ArrayIndexOutOfBoundsException */
    }
}
