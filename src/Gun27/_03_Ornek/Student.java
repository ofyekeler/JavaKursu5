package Gun27._03_Ornek;

import java.util.ArrayList;

public class Student {
    String name;
    int maxHour;
    ArrayList<Lessons> lessonList=new ArrayList<>();

    public void addLesson(Lessons lessn){

        int momTotHour=0;

        for (Lessons d:lessonList) {
            momTotHour+=d.hour;    }

        if (momTotHour+lessn.hour<=maxHour)
            lessonList.add(lessn);
        else
            System.out.println("Kredi sınırı aşılmıştır. "+"Eklenmeyen Ders: "+lessn.name);
    }
    public void lessonsPrint(){

        System.out.println("\n*** Transkript ***");
        System.out.println("Sayın "+name);
        System.out.println("Aldığınız dersler aşağıdadır.");
        for (Lessons d: lessonList)
            System.out.println(d.name+" "+d.hour);
    }
    public static void universityRules(){ // öğrenciyi değil öğrencilerin tamamını, yani TİPİ ilgilendirdiğinden
                                            // STATIC metod yaptık
        System.out.println("Kural 1: ");
        System.out.println("Kural 2: ");
        System.out.println("Kural 3: ");
        System.out.println("Kural 4: ");
        System.out.println("Kural 5: ");
    }
}
