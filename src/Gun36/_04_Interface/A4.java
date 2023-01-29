package Gun36._04_Interface;
// 1 class 1 den fazla Interface i implement edebilir
public class A4 implements IGosterir,IYazdirir{
    // hem karasal hem de uydu yayını gibi
    // ya da hem benzinli hem de elektrikli araba gibi
    @Override
    public void goster() {
        System.out.println("Gösterdi");
    }
    @Override
    public void yazdir() {
        System.out.println("Yazdırdı");
    }
}
