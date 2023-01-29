package Gun04;

public class _02_TipDonusumlari {
    public static void main(String[] args) {
        byte ogrNot1=98;
        byte ogrNot2=98;
        byte ogrNot3=100;
        byte ogrNot4=98;

        int toplam=ogrNot1; // byte --> int atınca problem çıkarmadı (genişletme/widening casting)
        // çünkü byte için hafızada ayırılan, zaten int e sığar, sığdığı için kabul ederim.
        // çünkü veri kaybı olma ihtimali hiç yok.

        ogrNot1 = (byte)toplam; // int-->byte atınca dur bi bakalım dedi. (daraltma/narrowing casting)
        // büyük hafıza ayırılmış bir alan, küçük bir hafıza ayırılmış alana atma işlemi var.
        // veri kaybı ihtimali var mı? Evet.
        // bu kodu yazmak istiyorsan toplamın soluna (byte) yazmalısın.

        System.out.println("ogrNot1 = " + ogrNot1); // 127 nin altında bir sayı olduğu için
                                                    // veri kaybı olmadı.

    }
}
