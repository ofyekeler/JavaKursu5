package Projelerim.Proje_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Proje_02 {

    public static void main(String[] args) {

        // Scanner Class tanimlayin...
        Scanner scan = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        // Banka Islemleri Listesi tanimlayin..."Para_Yatir", "Para_Cek", "Transfer", "Hesap_Ac"...
        List<String> actions = new ArrayList<>(Arrays.asList("Para_Yatir", "Para_Cek", "Transfer", "Cikis"));

        // Banka musterileri kullanici adi listesi tanimlayin..."User1", "User2", "User3"...
        List<String> users = new ArrayList<>(Arrays.asList("User1", "User2", "User3"));

        // Banka musterileri sifreleri listesi tanimlayin..."password1", "password2", "password3"...
        List<String> passwords = new ArrayList<>(Arrays.asList("password1", "password2", "password3"));

        // Banka musterilerine ait banka hesap numaralari listesi tanimlayin.."1234", "5678", "9999"
        List<String> account = new ArrayList<>(Arrays.asList("1234", "5678", "9999"));

        // Banka musterilerine ait banka hesaplarinda bulunan para miktarlarini tanimlayin...200, 1000, 5000
        List<Integer> funds = new ArrayList<>(Arrays.asList(200, 1000, 5000));

        // TODO ONEMLI NOT : Yukarida gireceginiz listelerdeki veriler index numarasina gore birbirleri ile iliskilidir
        // TODO Mesela -> 'User1' in passwordu 'password1', hesap numarasi '1234' ve hesabiundaki para miktari '200' dur...

//         Sonsuz bir dongu icerisinde kullanicidan username ve password girmesini isteyelim...
//         Konsoldan girilen username ve passwordu confirmUsernameAndPassword() methodunu cagirarak teyit edelim...
//         Eger dogru username ve password girilmis ise "Basarili bir sekilde giris yaptiniz" mesaji yazdirarak yapmak istedigi islemi soralim ...
//         Kayitli olmayan username ve password girilmis ise "Sistemde kayitli boyle bir kullanici bulunamadi.. Tekrar deneyin" mesaji
//         gosterip kullaniciyi tekrar username ve password girisine geri dondurelim..

        boolean dogru1 = true;

        while (dogru1 == true) {

            Scanner oku = new Scanner(System.in);
            System.out.println("Kullanıcı adı giriniz : ");
            String userName = oku.nextLine();
            System.out.println("Şifrenizi giriniz : ");
            String password = oku.nextLine();

            dogru1 = confirmUsernameAndPassword(users, passwords, userName, password);
        }


//        Secim hatali ise "Basarili bir secim yapmadiniz..." ikazi vererek tekrar secim yapmasini isteyelim..
//        Dogru bir secim yapildiginda kullanici tarafindan secilen islem SWITCH Statements vasitasiyla koda
//        aktarilsin
//        Case 1:"Bu bankamatik gecici olarak para yatirma islemine kapalidir...Uzgunuz" ikazi versin..
//        Case 2:"Hangi hesaptan para cekmek istiyorsunuz?" diye kullaniciya sorsun
//        Hesap numaralarini yukaridaki List ten alarak ekrana yazdirin..Kullanici sectigi hesap numarasini tuslasin..
//        "Ne kadar para cekmek istiyorsunuz?" diye soralim..Kullanici girdisini alalim...
//        asagida bulunan withdraw() methodunu cagirarak hesaptan para cekme islemini tamamlayalim...
//        tekrar islemler dongusune geri donelim...
//        Case 3:"Bu islemi su an gerceklestiremiyoruz..." diyerek basa donsun..
//        Case 4:System.exit(1);
//        buradaki kodu
//        case 4
//        e aynen kopyalayip yapistirin...
//        default:
//        "Basarili bir secim yapmadiniz..." mesaji versin..

        boolean dogru2 = true;

        while (dogru2 == true) {


            System.out.println("Yapmak istediginiz islemi seciniz...");
            for (int i = 0; i < actions.size(); i++) {
                System.out.println(actions.get(i) + " - " + (i + 1));
            }
            int userChoice = scan.nextInt();

            switch (userChoice) {
                case 1: {
                    System.out.println("Bu bankamatik gecici olarak para yatirma islemine kapalidir...Uzgunuz");
                    break;
                }
                case 2: {

                    String hesapno;
                    for (int i = 0; i < account.size(); i++) {
                        System.out.println(account.get(i));
                    }
                    do {
                        System.out.println("Hangi hesaptan para cekmek istiyorsunuz?");
                        hesapno = scanStr.nextLine();

                        if (!account.contains(hesapno))
                            System.out.println("Yanlış hesap numarası girdiniz...");
                    } while (!account.contains(hesapno));

                    System.out.println("Ne kadar para cekmek istiyorsunuz?");
                    int miktar = scan.nextInt();
                    withdraw(account, funds, hesapno, miktar);
                    break;
                }
                case 3: {
                    System.out.println("Bu islemi su an gerceklestiremiyoruz...");
                    break;
                }
                case 4:
                    System.exit(1);

                default: {
                    System.out.println("Basarili bir secim yapmadiniz...");
                }

            }
        }

    }

    private static void withdraw(List<String> accounts, List<Integer> funds, String chosenAccount, int amountToWithdraw) {

        /*
        Bu method parametre olarak aldigi accounts (hesaplar) ve funds (hesapta bulunan para miktarlari) listelerinde bulunan degerleri
        kullanici tarafindan girilen degerler ile birlikte kullanabilmek icin olusturulmusutur...
        Mesela : Kullanici 1234 numarali hesaptan para cekmek istemis ise, hangi hesaptan para cekilecegini ve cekilecek para miktarini
        hesap bakiyesinden dusebilmek icin hangi index numarali hesap oldugu bulunmali, ayni index e sahip para miktari funds listesinden
        eksiltilerek kullaniciya hesabinda kalan para miktari belitilmalidir..

        Eger kullanici hesap numarasini yanlis girmisse veya hesabinda bulunan para miktari yeterli degilse
        "Beklenmedik bir hata olustu...Iyi gunler dileriz..." ikazi vermelidir...

         */

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).equals(chosenAccount)) {

                if (amountToWithdraw <= funds.get(i)) {
                    funds.set(i, (funds.get(i) - amountToWithdraw));
                    System.out.println("Kalan miktar= " + funds.get(i));
                } else
                    System.out.println("yeterli bakiyeniz bulunmamaktadır.");
            }

        }
    }

    private static boolean confirmUsernameAndPassword(List<String> users, List<String> passwords, String username, String password) {

    /*
        Kullanici yukarida olusturdugumuz kullanici adi ve password lerden birini girmez ise bu method FALSE dondurmelidir..
        Buna gore verile parametreleri kullanarak kullanici teyitini yapiniz..
     */
        boolean dogrumu = true;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).equals(username) && passwords.get(i).equals(password)) {
                System.out.println("Basarili bir sekilde giris yaptiniz...");

                dogrumu = false;
            }
        }
        if (dogrumu == true) {
            System.out.println("Sistemde kayıtlı böyle bir kullanıcı bulunmadı.. Tekrar deneyin");
        }
        return dogrumu;
    }
}