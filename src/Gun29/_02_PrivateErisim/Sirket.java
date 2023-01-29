package Gun29._02_PrivateErisim;

public class Sirket {
    public static void main(String[] args) {
        Calisan cal1=new Calisan();
        cal1.id=1;
        cal1.name="ismet";
        cal1.surname="temur";
        // cal1.password="1234";
        // Calisan class ındaki password PRIVATE olduğu için
            // kendi paketinden dahi çağıramıyor.
        cal1.sifreAta("1234");
/*
zayıf şifre
*/
        cal1.sifreAta("M123_sdf23");
        cal1.sifreGoster();
/*
Şifre başarıyla atandı
****_sdf23
*/
    }
}
