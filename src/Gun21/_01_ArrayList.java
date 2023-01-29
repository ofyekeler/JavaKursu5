package Gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {

        // dizi, array: boyut sayısı sabitti, sonradan değiştirilemez.
        int [] dizi=new int[5];
        // Burada ise, boyut dinamik (artırılabilir7azaltılabilir)
        // Eleman ekledikçe uzak, sildikçe kısalır.
        // ArrayList: boyutunu başta vermene bile gerek yok,
        // boyutu başlangıçta 0, eleman ekledikçe artar, sildikçe kısalır.

        ArrayList<Integer> integerList=new ArrayList<>(); // bunların uzunluğu 0 (sıfır)
        ArrayList<String> stringList=new ArrayList<>();
        ArrayList<Double> doubleList=new ArrayList<>();

        ArrayList<String> isimler=new ArrayList<>();
        System.out.println("isimler = " + isimler); // Array.toString demene gerek yok yazdırırken.

        isimler.add("Ahmet");  // uzunluk burada 1(bir) oldu.
        isimler.add("Metin");  // uzunluk 2
        isimler.add("Hacer");  // uzunluk 3
        isimler.add("Aynur");  // uzunluk 4
        // burada eklenen halkalar zincirin sonuna ekleniyor, araya girmiyor.

        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size= " + isimler.size()); // "size" dizideki eleman (vagon)sayısını gösterir

        isimler.add(1, "Muhammed"); // burada ise zincir halkasının
                                                 // 1. sırasına (arasına) ekledi (add),
        System.out.println("isimler = " + isimler);

        isimler.set(1,"Zafer"); // verilen indexdeki elemanı değiştirir.
                                // silip kendisini ekler
        System.out.println("isimler = " + isimler); // "Muhammed" gitti "Zafer" geldi

        boolean varMi= isimler.contains("Metin"); // içeriyor mu, var mı.
        System.out.println("Metin varMi = " + varMi);

        isimler.remove("Metin");  // ilk "Metin" i siler
        System.out.println("isimler = " + isimler);

        isimler.remove(1); // rakam verilirse index ine göre siliyor
        System.out.println("isimler = " + isimler);

        // isimler.remove((Object)1); deseydik index 1 i değil rakam olan 1'i silerdi.
        
        int indexOfAynur= isimler.indexOf("Aynur");
        System.out.println("indexOfAynur = " + indexOfAynur); // index numarasını verir

        String ilkEleman= isimler.get(0); // veriilen index teki değeri (kelime yi) verir
        System.out.println("ilkEleman = " + ilkEleman);

        isimler.clear(); // herşeyi temizliyor
        System.out.println("isimler = " + isimler);

/*
isimler = []
isimler = [Ahmet, Metin, Hacer, Aynur]
isimler.size= 4
isimler = [Ahmet, Muhammed, Metin, Hacer, Aynur]
isimler = [Ahmet, Zafer, Metin, Hacer, Aynur]
Metin varMi = true
isimler = [Ahmet, Zafer, Hacer, Aynur]
isimler = [Ahmet, Hacer, Aynur]
indexOfAynur = 2
ilkEleman = Ahmet
isimler = []
*/
    }
}
