package Mentoring.mentoring_5;

public class Java2DOrnek {
    public static void main(String[] args) {

        // ayları dört mevsim göre konumlandıralım 2D Array ile


        String[][] mevsim = new String[4][3];

        mevsim[0][0] = "Mart";
        mevsim[0][1] = "Nisan";
        mevsim[0][2] = "Mayıs";
        mevsim[1][0] = "Haziran";
        mevsim[1][1] = "Temmuz";
        mevsim[1][2] = "Ağustos";
        mevsim[2][0] = "Eylül";
        mevsim[2][1] = "Ekim";
        mevsim[2][2] = "Kasım";
        mevsim[3][0] = "Aralık";
        mevsim[3][1] = "Ocak";
        mevsim[3][2] = "Şubat";

        for (int i = 0; i < mevsim.length; i++) {
            System.out.println(i+1 + " .mevsim için aylar");
            for (int j = 0; j < mevsim[i].length; j++) {
                System.out.println(mevsim[i][j]);
            }
            System.out.println();
        }


    }
}
