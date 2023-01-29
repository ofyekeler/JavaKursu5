package Mentoring.mentoring_11.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class try_catch_finally {
    public static void main(String[] args) {

        // finally-> exception olsada olmasada java tarafından calıştıraln blokdur.

        try {
            String path = "src/Mentoring/mentoring_11/exceptions";

            FileInputStream file = new FileInputStream(path);

        }catch (FileNotFoundException e){
            System.out.println("dosya bulunamadı");
        }finally {
            System.out.println("Burası her zaman çalışır");
        }

    }
}
