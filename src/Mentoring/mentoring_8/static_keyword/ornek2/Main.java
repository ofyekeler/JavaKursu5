package Mentoring.mentoring_8.static_keyword.ornek2;

public class Main {
    public static void main(String[] args) {


        // static keyword methodlar kullanarak doğum günü pastası yapalım

        dogumGunuPastasi.kime("Zahid");
        dogumGunuPastasi.aroma();
        dogumGunuPastasi.kacGram(3000);
        dogumGunuPastasi.kacKatli(3);


        dogumGunuPastasi dg = new dogumGunuPastasi();
        System.out.println(dg.mesajYaz());

    }
}
