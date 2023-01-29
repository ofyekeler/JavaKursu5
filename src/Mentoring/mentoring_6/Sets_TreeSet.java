package Mentoring.mentoring_6;

import java.util.Iterator;
import java.util.TreeSet;

public class Sets_TreeSet {
    public static void main(String[] args) {

        // TreeSet : elemanları sıralı bir şekilde saklar. null değişkene izin vermez. NullPointerExeption hatası alıyoruz

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
//        numbers.add(null);  // tanımlayamıyoruz
        System.out.println(numbers);


        // set in kendi sırasına nasıl ise ona göre erişir
        Iterator iter = numbers.iterator();  // iterator() fonksiyonu ile set içinde elemanlara ulaşıyoruz.

        while (iter.hasNext()){

            System.out.println(iter.next());  // set içindeki elemana next() ile ulaşıp yazdırdık.
        }



    }
}
