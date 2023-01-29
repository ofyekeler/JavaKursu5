package Gun28._02_Ornek;

public class Kitapci {
    public static void main(String[] args) {

        // Book class yazınız.fields: name, publishYear(yayın yılı),author(yazar)
        // 3 adet Consructor ekleyiniz.
        // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
        // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.

            Kitap kit1=new Kitap();
            kit1.name="Harry Poter";
            kit1.author="JK Rowling";
            kit1.publishYear=1997;

            Kitap kit2=new Kitap("yüzükler",1954,"JRR Tolkien");
            Kitap kit3=new Kitap("üzüm ve çay", 2000);

            System.out.println("kit1 = " + kit1); // 'kit1.toString()' var aslında. GİZLENMİŞ.
                                                  // Kitap CLASS ında ki 4. metodda döndürdük ve yazdırdık.
            System.out.println("kit2 = " + kit2);
            System.out.println("kit3 = " + kit3);
/*
kit1 = Harry Poter JK Rowling 1997
kit2 = yüzükler JRR Tolkien 1954
kit3 = üzüm ve çay  2000
*/
    }
}
