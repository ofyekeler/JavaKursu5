package Projelerim.Proje_04.Veritabani;

import Projelerim.Proje_04.Modeller.Calisanlar.Calisan;

import java.util.ArrayList;

public class Calisanlar {


    // Buradaki calisanList static cünkü proje calismaya basladiği anda oluşması lazım. Bunu bir veritabani
    // gibi görebiliriz. Calisanlarimizin hepsi bu liste icerisinde yer alacak.
    private static ArrayList<Calisan> calisanList = new ArrayList<>();

    // Calisanlari almak icin basit bir getter method
    public static ArrayList<Calisan> getCalisanList() {
        return calisanList;
    }

    // Bir çalışan eklemek için gerekli method.
    public static void addACalisan(Calisan calisan) { calisanList.add(calisan); }

    // Bir çalışan silmek için gerekli method.
    public static void deleteACalisanWithId(String calisanId) {
        for (int i = 0; i <calisanList.size() ; i++) {
            if (calisanList.get(i).getCalisanId().equalsIgnoreCase(calisanId)){
                calisanList.remove(i);
            }
        }
    }

    // Departman kodu verilerek, konsola sadece o departmanda calisanlari yazdirmak için
    public static void printDepartmandakiCalisanlar(String departmanKodu) {
        for (Calisan calisan : getCalisanList()) {
            if (calisan.getDepartman().getDepartmanKodu().equalsIgnoreCase(departmanKodu)) {
                System.out.println(calisan);
            }
        }
    }
    // Calisanlari konsola yazdirmak için
    public static void printCalisanlar() {
        for (Calisan calisan : calisanList) {
            System.out.println(calisan);
        }
    }
}
