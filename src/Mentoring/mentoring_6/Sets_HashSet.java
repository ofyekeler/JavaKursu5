package Mentoring.mentoring_6;

import java.util.HashSet;

public class Sets_HashSet {
    public static void main(String[] args) {

        // HashSet: Hızlı çalışır, benzersiz ögeler içerir, ekleme sırasını gözetmez kendi algoritmasına göre çalışır
        // null değere izin verir.

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(8);
        numbers.add(5);
        numbers.add(3);  // aynı değerden ekleyemedik
        numbers.add(null);

        System.out.println(numbers);

        for (int i = 0; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " set içinde var");
            } else {
                System.out.println(i + " set içinde yok");
            }
        }

        System.out.println("---------------------");
        //**********************************************

        HashSet<String> hs = new HashSet<>();
        hs.add("ankara");
        hs.add("istanbul");
        hs.add("mersin");
        hs.add("izmir ");
        System.out.println("listenin ilk hali:  " + hs);
        hs.remove("mersin");
        boolean b = hs.contains("istanbul");
        System.out.println("istanbul var mı: " + b);
        System.out.println("listenin son hali: " + hs);


    }
}
