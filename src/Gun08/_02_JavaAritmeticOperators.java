package Gun08;

public class _02_JavaAritmeticOperators {
    public static void main(String[] args) {

        int sayac=0;

        sayac=sayac+1; // sayacın değerini 1 tane artırıyor. :  1
        sayac++; // sayacın değeri 1 tane daha arttı.  ;  2

        System.out.println("sayac = " + sayac);

        ++sayac;  // sayacın seğerini 1 tane daha artırıyor.
                  // bu üçü de aynı işlemi yapıyor.

        System.out.println("sayac = " + sayac);

        sayac=sayac-1;
        sayac--;
        --sayac;

        System.out.println("sayac = " + sayac);

        /* sayac = 0 */

        /* ********************************************** */

        int toplam=5+sayac;

        toplam=5+sayac++;
        System.out.println("toplam = " + toplam); // toplam=5+sayac   sonra  sayac=sayac+1
                            // toplam: 5, sayac: 1 oldu.
        toplam=5+ ++sayac;
        System.out.println("toplam = " + toplam); // sayac=sayac+1    sonra  toplam=5+sayac
        System.out.println("sayac = " + sayac);

        /* toplam = 5
           toplam = 7
           sayac = 2 */

        // ÖZET: Sayi++ lar sağda ise önce işlem sonra artış.
        //       ++Sayi lar solda ise önce artış sonra işlem.

        /* toplam=toplam+sayac;
           sayac=sayac+1
                         yerine
           toplam=toplam+ sayac++  */
        /* sayac=sayac+1
           toplam=toplam+sayac;

           toplam=toplam+ ++sayac */

    }
}
