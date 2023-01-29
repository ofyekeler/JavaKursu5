package Gun47;

public class _08_MarkList {
    int num;

    public static void graceMarks(_08_MarkList obj4) {
        obj4.num += 10;
    }

    public static void main(String[] args) {
        _08_MarkList obj1 = new _08_MarkList(); // elimizde bir insan (nesne, hafıza) oluştu.
        _08_MarkList obj2 = obj1;     // obj2 ise obj1 e atandı, yeni bir memory oluşmadı.
        _08_MarkList obj3 = null;    // hücre oluştu ama nesne oluşmadı, doğmamış çocuk gibi

        obj2.num = 60;     // değer ataması oldu, yeni bir nesne hücresi oluşmadı
        graceMarks(obj2);
        /* Cevap : Toplam 1 adet hafıza oluştu */
    }
}
