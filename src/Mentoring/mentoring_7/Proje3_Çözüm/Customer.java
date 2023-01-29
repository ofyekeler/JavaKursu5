package Mentoring.mentoring_7.Proje3_Çözüm;

import java.util.List;

public class Customer {
    String username;
    String password;
    List<Account>accounts;

    public Customer(String username, String password, List<Account> accounts) {
        this.username = username;
        this.password = password;
        this.accounts = accounts;
    }
}
