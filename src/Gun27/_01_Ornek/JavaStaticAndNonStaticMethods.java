package Gun27._01_Ornek;

public class JavaStaticAndNonStaticMethods {
    public static void main(String[] args) {

        int sayi=345;
        String strSayi=String.valueOf(sayi);
        int intSayi=Integer.parseInt(strSayi);

        Utility ut=new Utility();
/*nesneye 'ut' ait*/ String strSayi2= ut.getString(sayi);

/*Class a ait*/ String strSayi3=Utility.getString2(sayi);
// CLASS ını (Utility) yazmadan metodu çağıramıyorsun.
    }
}
