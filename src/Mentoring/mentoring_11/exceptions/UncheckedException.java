package Mentoring.mentoring_11.exceptions;

public class UncheckedException {
    public static void main(String[] args) {


        // Error : programda aldığımız hatalardır ve müdahale edemediğimiz kontrol edemediğimiz hatarlardır( OutOFMemoryError, NoClassDeffoundError)

        // Exception : Programın normal akışını bozan yakalanabilen, müdahele ve kontrol edelibileceğimiz hatalardır
        // 1 - Compile Error, Exception : Program çalışmadan önce derleme zamanında aldığımız hatalardır
        // 2. Runtime Error, Exception : Program çalıştıktan sonra çalışma zamanı içindeki hatalardır.

        // checked exception - compile time da try-cath blokları ile veya throws keywordu ile kontrol edilen exception dır.

        // UncheckedException - run time da kod çalıştıktan sonra fırlatılan hatalardır. Program akışını
        // bozacak bir öngürünüz varsa try-catch bloklarıyla handle edebilirsiniz ancak kodu fix etmek daha sağlık bir çözümdür.

        int x = 6;
        int y = 0;
        int z = x / y;
        System.out.println(z);  // UncheckedException - ArithmeticException

    }
}
