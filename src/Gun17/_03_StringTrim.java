package Gun17;

public class _03_StringTrim {
    public static void main(String[] args) {

        // trim: kırpmak demektir. String başındaki ve sonundaki boşlukları alır.

        String text="     Merhaba Dünya     ";

        System.out.println("Orijinal Hali=->" + text+"<-");
        System.out.println("Trim'li Hali=->" + text.trim()+"<-");

        /* Orijinal Hali=->     Merhaba Dünya     <-
            Trim'li Hali=->Merhaba Dünya<-               */

    }
}
