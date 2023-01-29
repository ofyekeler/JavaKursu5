package Gun44;

public class _05_TekrarSorulari_041 {
    public static void main(String[] args) {
        String[] strs=new String[2];
        int idx=0;
        for(String s : strs){
            strs[idx].concat(" element "+idx); // null a concat tarzı ekleme yapamazsın.
                                                   // kendisinin odacığı bile yok. yapsan da eşitlemen lazımdı.
            idx++;                                // strs[idx]="element"+idx; diyebiliriz.
        }
        for (idx=0; idx<strs.length; idx++){
            System.out.println(strs[idx]);
        }
/* NullPointerException is thrown at runtime */

        // foreach yerine fori tarzı döngü oluştursaydık..
//        for (int i = 0; i < strs.length; i++) {
//            System.out.print(strs[i]);
//        }
//        olsaydı, -> nullnull yazdırırdı.
    }
}
