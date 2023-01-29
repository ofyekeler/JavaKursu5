package Mentoring.mentoring_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrayList {
    public static void main(String[] args) {

        // ArrayList: Dinamik bir yapısı olan istediğimiz kadar ekleme ve çıkarma yapabileceğimiz bir classdır.
        // Arraylerin listi olarak düşünebiliriz

        List<Integer> list = new ArrayList<>();  // bu şekilde de tanımlayabiliriz.

        ArrayList<Integer> numbers = new ArrayList<>();  // data type olarak  primitive kabul etmiyor
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("numbers ilk hali : " + numbers);
        numbers.add(1,55);  // verilen index e 55'i ekler
        numbers.set(4, 87);  // verilen indexdeki elemanı 87 ile değiştirir.
        System.out.println("numbers son hali: " + numbers);
        System.out.println("uzunluk: " + numbers.size());  // uzunluğu verir
        boolean varMi = numbers.contains(30);  // listemde 30 var mı?
        System.out.println("var mı: " + varMi); // true

        numbers.remove(3);   // 3. index deki elemanı siler
        System.out.println(numbers);

        numbers.remove((Object)(10)); // 10 u siler
        System.out.println("son hali: "  + numbers);

        numbers.clear();
        System.out.println("listenin en son hali: " + numbers);

        //**************************************************


        // Array i ArrayListe dönüştürebiliriz

        String[] arr = {"Java", "Python", "C++"};

        // 1.yöntem
        ArrayList<String > list1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list1);

        // 2.yöntem
        ArrayList<String> list2 = new ArrayList<>();

        for (String i : arr ){
            list2.add(i);
        }
        System.out.println("listeye atılmış hali: " + list2);

        //************************************************

        // ArrayListi Arraye dönüştürelim.

        ArrayList<String> diller = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));


        String[] arr1 = new String[diller.size()];

        //1.yöntem
//        diller.toArray(arr1);  // diziye döndürmüş olduk.
//        System.out.println("dizi hali: " + Arrays.toString(arr1));

        //2.yöntem
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = diller.get(i);
        }
        System.out.println("ikinci yöntem ile atama:  " + Arrays.toString(arr1));


    }
}
