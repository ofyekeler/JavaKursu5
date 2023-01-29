package Mentoring.mentoring_11.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    public static void main(String[] args) throws FileNotFoundException {


        // burada try-catch kullanabiliriz ya da deklarasyon satırına throws keywordu ile FileNotFoundException hata türünü ekleyebiliriz.

        String path = "src/Mentoring/mentoring_11/exceptions";

        FileInputStream file = new FileInputStream(path);


    }
}
