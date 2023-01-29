package Gun46;

public class _04_TekrarSoruları22cozum {
    public static void main(String[] args) {

        String [][] chs =new String[5][2];
        chs[0]=new String[2];
        chs[1]=new String[5];
        int i=97;

        System.out.println("chs.length = " + chs.length);
        System.out.println("chs[0].length = " + chs[0].length); // 0.Satır uzunluğu
        System.out.println("chs[1].length = " + chs[1].length); // 1.Satır uzunluğu
        System.out.println("chs[2].length = " + chs[2].length); // 2.Satır uzunluğu
        System.out.println("chs[3].length = " + chs[3].length); // 3.Satır uzunluğu
        System.out.println("chs[4].length = " + chs[4].length); // 4.Satır uzunluğu


        for (int a = 0; a < chs.length; a++) {
            // for (int b = 0; b < chs.length; b++) {
/* hata giderildi */ for (int b = 0; b < chs[a].length; b++) {
                chs[a][b]=""+i; // 0'ıncı satırın 4. elemanı yok.
                i++;
            }
        }
        for (String [] ca : chs) {
            for (String c : ca) {
                System.out.print(c+" ");
            }
            System.out.println();
        }
/* "ArrayIndexOutOfBoundsException" is thrown at runtime. */
// hata giderildikten sonra yazdırma şekli;
/*
97 98
99 100 101 102 103
104 105
106 107
108 109
*/
    }
}
