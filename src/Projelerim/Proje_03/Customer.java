package Projelerim.Proje_03;

import java.util.ArrayList;

// Her musteri (Customer) icin 2 adet hesap (Account) tanimlayin..
// Hesap sinifi hesap numarasi ve hesaptaki para miktarini icermeli...
public  class Customer {
    public String username;
    public String password;

    public ArrayList<Account> accounts = new ArrayList<>();

    public void hesaplar (Account hesap){
        accounts.add(hesap);
    }
}
