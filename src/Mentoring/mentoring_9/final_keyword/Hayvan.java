package Mentoring.mentoring_9.final_keyword;

public class Hayvan {

    String ad;

    final int yas = 5;

    public Hayvan(String ad) {
        this.ad = ad;
    }

    public void hareket(){
        System.out.println("tırmalar");
    }

    public final void uyku(){
        System.out.println("günün yarısında uykuyla geçirir");
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "ad='" + ad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
