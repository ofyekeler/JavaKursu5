package Gun28._03_Ornek;

public class Kitap {
    String name;
    int publishYear;
    String author;

    // sağ tuş -> generate -> constructor -> seç -> OK (kısayol)(en üste tıklarsan BOŞ açar)
    public Kitap(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    public Kitap() {
    }

    public Kitap(String name, int publishYear) {
        this.name = name;
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", author='" + author + '\'' +
                '}';
    }
}
