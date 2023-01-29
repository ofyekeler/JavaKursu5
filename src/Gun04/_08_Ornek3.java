package Gun04;

public class _08_Ornek3 {
    public static void main(String[] args) {
        // String olarak verilen 2 adet bağış parasının toplamını yazınız.

        String bagis1= "500";
        String bagis2= "1500";

        int bagis1sayi=Integer.parseInt(bagis1);
        int bagis2sayi=Integer.parseInt(bagis2);

        int toplam=bagis1sayi+bagis2sayi;
        System.out.println("toplam = " + toplam);

        // toplam = 2000

    }
}
