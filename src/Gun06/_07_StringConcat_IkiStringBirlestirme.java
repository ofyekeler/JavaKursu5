package Gun06;

public class _07_StringConcat_IkiStringBirlestirme {
    public static void main(String[] args) {
        // concat: bir string i diğerine birleştiriyor.

        String s1="Merhaba";
        String s2="Dünya";

        System.out.println("Birleşik Hali= " + s1 + s2);
         /* Birleşik Hali= MerhabaDünya */

        System.out.println("birleşik hali= "+ s1.concat(s2) ); // Birleşmiş hali
        System.out.println("birleşik hali= "+ s1.concat(" ").concat(s2) );
        System.out.println("birleşik hali= "+ s1.concat(" "+s2) );

        /* birleşik hali= MerhabaDünya
           birleşik hali= Merhaba Dünya
           birleşik hali= Merhaba Dünya */
    }
}
