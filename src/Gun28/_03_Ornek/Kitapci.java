package Gun28._03_Ornek;


public class Kitapci {
    // Book class yazınız.fields: name, publishYear(yayın yılı),author(yazar)
    // 3 adet Consructor ekleyiniz.
    // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
    // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.

    public static void main(String[] args) {

        Kitap kit1=new Kitap();
        kit1.name="Harry Poter";
        kit1.author="JK Rowling";
        kit1.publishYear=1997;

        System.out.println("kit1 = " + kit1);
/*
kit1 = Kitap{name='Harry Poter', publishYear=1997, author='JK Rowling'}
*/
    }
}
