package Gun29._02_PrivateErisim;

public class Calisan {
    int id;         // default (kendi paketindkilere erişim izni veriyor)
    String name;    // default
    String surname; // default
    private String password;// private ('PRIVATE' yapınca kendi paketinden dahi çağırılamıyor.

    // şifreyi kontrol ederek atamak için..

    public void sifreAta(String sifre){
        if (sifre.length()<8){
            System.out.println("zayıf şifre");
        }
        else {
            password=sifre; // başka "password" olmadığı için 'THIS' kullanmadık.
            System.out.println("Şifre başarıyla atandı");
        }
    }
    public  void sifreGoster(){
        System.out.println("****"+password.substring(4));
    }
}
