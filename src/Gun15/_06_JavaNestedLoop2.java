package Gun15;

public class _06_JavaNestedLoop2 {
    public static void main(String[] args) {

        // 5. sorunun farklı bir çözüm yöntemi:
        // (zor bir yöntem, anlamazsan da kafana takma)

        int sinir=0;
        boolean altTaraf=false;

        for(int satir=1 ; satir<=5 ; satir++)
        {
            if(altTaraf==false)
                sinir=satir;
            else
                sinir=6-satir;
            for (int j=0 ; j<sinir ; j++)
                System.out.print("*");

            System.out.println();

            if (altTaraf==false && satir == 5)
            {
                satir=1;
                altTaraf=true;
            }
            if (altTaraf==false && satir == 5)
                break;
        }
        /* *
           **
           ***
           ****
           *****
           ****
           ***
           **
           * */
    }
}
