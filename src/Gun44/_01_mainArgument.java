package Gun44;

public class _01_mainArgument {
    public static void main(String[] args) {
        // String[] args   nedir?

        // windows "cmd" diyince komut satırı açar. Bazı komutları çalıştırırken parametreler veririz.
        // Bunun gibi...

        for (String s : args)
            System.out.println("s = " + s);
        // Önce çalıştır. Sonra, RUN -> Edit Configurations (yapılandırmaları düzenle) tıkla.
        // application'dan class ı bul ve PROGRAM ARGUMENTS bölümüne parametreleri (bir iki üç) yaz.
/*
s = bir
s = iki
s = üç
*/
    }
}
