package Gun31._02_Ornek;

public class _1_Soru {
    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER(username, role, statu) class ı tanımlayınız

   // enum Role {ADMIN, MUDUR, SATIS, PERSONEL}
   // enum Statu {AKTIF, PASIF}

    // 1- Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // 2- kullanıcısı tanımlayınız.
    // 3- UserSilme isimli fonksiyona bu userları gönderiniz.
    // 4- ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim

    public static void main(String[] args) {

    User user1 = new User("ismet",Role.ADMIN,Statu.AKTIF);
    User user2 = new User("mehmet",Role.MUDUR,Statu.PASIF);
    User user3 = new User("ayşe",Role.SATIS,Statu.AKTIF);

    userSil(user1);
    userSil(user2);
    userSil(user3);

        System.out.println("user1 = " + user1);
    }
/*3*/public static void userSil(User user){
/*4*/   if (user.role == Role.ADMIN)
        {
            System.out.println(user.userName+" - Admin silinemez.");
        }
    }
}
