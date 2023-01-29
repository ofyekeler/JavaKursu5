package Projelerim.Proje_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Proje_03 {

  /*
     Bu proje %90 bir onceki projeden alinmistir... Ufak degisiklikler mevcuttur.. ClASS yapisinin sizlere sagladigi kolayligi
     bu proje ile daha iyi anlayacaksiniz... Bu class gerekli kodlamalar yapildiginda video da gorulen sonucun aynisini verecek
     sekilde duzenlenmelidir...
        - not :  Tek degisiklik = Bir onceki proje de her kullanicinin 1 tek hesap numarasi vardi... Burada her musteriye 2 adet
                 hesap tanimlanmasini istiyoruz...
              :  Ayrica musteriye ait hesaplar listelenirken gecen hafta yapilan hatayi giderecek sekilde her kullanicinin kendi banka
              hesaplarinin listelenmesini saglayiniz...
     * Bu Class da KIRMIZI olarak gorulen kodlar sizin tarafinizdan eklenecek kodlar ile calisir hale gelecekler...
     * Sizlerden asagida belirtilen-kullanilmis Class lari ayri ayri olusturmanizi ve asagida tanimli methodlarin icini doldurmanizi bekliyoruz...
     */


    public static void main(String[] args) {

        // Scanner Class tanimlayin...
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);

        // Banka Islemleri (Actions) Class indan bir liste olusturun...4 adet islem tanimlayin "Para_Yatir", "Para_Cek", "Transfer", "Cikis"...

        List<Actions> actions = new ArrayList<>();

        Actions action1=new Actions();action1.description="Para_Yatir";
        Actions action2=new Actions();action2.description="Para_Cek";
        Actions action3=new Actions();action3.description="Transfer";
        Actions action4=new Actions();action4.description="Cikis";
        actions.add(action1);actions.add(action2);actions.add(action3);actions.add(action4);

        // Her musteri (Customer) icin 2 adet hesap (Account) tanimlayin.. Hesap sinifi hesap numarasi ve hesaptaki para miktarini icermeli...

        Customer mst1 = new Customer();
        mst1.username = "user1";
        mst1.password = "password1";
        Account hesap1 = new Account();
        hesap1.number = "1111";
        hesap1.bakiye = 0;
        Account hesap2 = new Account();
        hesap2.number = "2222";
        hesap2.bakiye = 0;
        mst1.hesaplar(hesap1);
        mst1.hesaplar(hesap2);

        Customer mst2 = new Customer();
        mst2.username = "user2";
        mst2.password = "password2";
        Account hesap3 = new Account();
        hesap3.number = "3333";
        hesap3.bakiye = 0;
        Account hesap4 = new Account();
        hesap4.number = "4444";
        hesap4.bakiye = 0;
        mst2.hesaplar(hesap3);
        mst2.hesaplar(hesap4);

        // Banka musterilerini Customer sinifindan objeler olusturarak liste olarak tanimlayin...Customer sinifinda bir musteriye ait
        // username, password ve birden fazla hesap (Account) bulunmalidir...Buna gore bu musterileri burada tanimlayin...

        ArrayList<Customer> musteriler = new ArrayList<>();
        musteriler.add(mst1);
        musteriler.add(mst2);

        // Asagidaki kodda KIRMIZI olarak gorulen yerler sizin olustiracaginiz siniflar ve yukarida tanimlayacaginiz objeler ile
        // normal olarak calisacaktir...

        Customer aktifKullanici;
        Account secilenHesap;

        while (true) {
            System.out.print("Please enter your username: ");
            String username = scan.nextLine();
            System.out.print("Please enter your password: ");
            String password = scan.nextLine();

            // -> Bu methodu asagida hangi kullanicinin giris yaptigini belirlemek maksadiyla kullanacaksiniz, olusturun...
            aktifKullanici = confirmUsernameAndPassword(musteriler, username, password);

            if (aktifKullanici != null) {
                System.out.println("Basarili bir sekilde giris yaptiniz");
                break;
            }
            System.out.println("Sistemde kayitli boyle bir kullanici bulunamadi.. Tekrar deneyin");
        }

        // Actions starts here
        while (true) {
            System.out.println("Yapmak istediginiz islemi seciniz...");
            for (int i = 0; i < actions.size(); i++) {
                System.out.println(actions.get(i).description + " - " + (i + 1));

            }
            int userChoice = scan.nextInt();

            switch (userChoice) {

                case 1: {
                    // Para yatirma ozelligini aktif hale getirin...
                    /*
                    Kullaniciya ait hesaplari listeleyerek hangi hesap numarasina para yatirmak istedigini sorun...
                    Kullanicinin sectigi hesap numarasi hatali ise ikaz ederek tekrar basa dondurun...
                    Secim confirmAccountNumber(currentCustomer, chosen); methodu tarafindan dogrulanirsa
                    Ne kadar para yatirmak istedigini sorun...
                    Ve kullanicinin girdisini alarak hesaptaki para miktarini arttirin...
                     */

                    while (true) {
                        System.out.println("Lutfen para yatırmak istediginiz hesap numarasini giriniz...:");

                        for (Account account : aktifKullanici.accounts) {
                            System.out.println(account.number);
                        }
                        String chosenAccount = scan1.nextLine();

                        secilenHesap = confirmAccountNumber(aktifKullanici, chosenAccount);

                        if (secilenHesap != null) {
                            System.out.println("Ne kadar para yatirmak istiyorsunuz?");
                            break;
                        }
                        System.out.println("Hatalı seçim yaptınız tekrar deneyiniz");
                    }
                    //System.out.println(" Ne kadar para yatirmak istiyorsunuz?");
                    int yatirilanPara = scan.nextInt();
                    secilenHesap.bakiye += yatirilanPara;
                    break;

                }

                case 2: {

                    while (true) {
                        // Burada artik sadece o kullaniciya ait banka hesaplari listeleniyor... CLASS kullanmainin faydalari...
                        System.out.println("Lutfen para cekmek istediginiz hesap numarasini giriniz...: ");
                        for (Account account : aktifKullanici.accounts) {
                            System.out.println(account.number);
                        }
                        String secim = scan.next();
                        // confirmAccountNumber() methodunu kullanicinin dogru hesap bilgileri girdigini teyit etmek amacli kullanacaksiniz..
                        secilenHesap = confirmAccountNumber(aktifKullanici, secim);
                        if (secilenHesap == null) {
                            System.out.println("Hatali hesap numarasi girdiniz...");
                            continue;
                        }
                        System.out.println("Lutfen cekmek istediginiz para miktarini giriniz...: ");
                        int cekilecekPara = scan.nextInt();
                        // withdraw() methodunu kullanicinin hesabinda yeterli bakiye varsa bakiyesinden paranin dusulmesi,
                        // Yeterli bakiye yoksa kullanicinin uyarilmasi maksadiyla kullanacaksiniz...Olusturun
                        if (!withdraw(secilenHesap, cekilecekPara)) {
                            System.out.println("Yeterli bakiyeniz bulunmamaktadır...");
                            break;
                        }break;
                    }break;
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

    // TODO - Asagidaki 3 methodun return tipini ve icerigini tanimlayin ki yukarida olmasi gerektigi gibi sonuc versinler...

    public static Customer confirmUsernameAndPassword(List<Customer> users, String username, String password) {

        Customer activeUser = new Customer();
        activeUser = null;

        for (int i = 0; i < users.size(); i++) {
            if (username.equals(users.get(i).username) && password.equals(users.get(i).password)) {
                activeUser = users.get(i);
            }
        }
        return activeUser;
    }

    public static Account confirmAccountNumber(Customer currentUser, String chosenAccount) {

        Account chosenaccount = new Account();
        chosenaccount=null;

        for (int i = 0; i < currentUser.accounts.size(); i++) {
            if (currentUser.accounts.get(i).number.equals(chosenAccount)) {
                chosenaccount = currentUser.accounts.get(i);
            }}

        return chosenaccount;
    }

    public static boolean withdraw(Account chosenAccount, int amountToWithdraw) {

        boolean dogrumu = false;

        if (chosenAccount.bakiye - amountToWithdraw >= 0) {
            chosenAccount.bakiye = chosenAccount.bakiye - amountToWithdraw;
            System.out.println("Lutfen paranizi aliniz hesabınızda toplam " + chosenAccount.bakiye + " euro kalmistir...");
            dogrumu = true;
        }
        return dogrumu;
    }
}