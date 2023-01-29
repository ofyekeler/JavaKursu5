package Gun31._01_Enum_SabitDeger;

public class Ornek1 {
    public static void main(String[] args) {
        // Verilen bir ay no'ya göre ayın gün sayısını veren programı yazınız.

        int ayNo=5;

        switch (ayNo){
            case 2: System.out.println(28); break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println(31); break;
            case 4:
            case 6:
            case 9:
            case 11: System.out.println(30); break;
        }
        // okunabilirlik ve kontrollü yazılım yok, tanımlama yetersiz.
        // numaradan gitmeye çalıştık, zorluklarla karşılaştık.
        // bunun yerine isimden gitmeye çalışalım.

        String ayAd="Mayıs";
        switch (ayAd){
            case "şubat": System.out.println(28); break;
            case "Ocak":
            case "mart":
            case "Temmuz":
            case "AGUSTOS":
            case "ekim":
            case "Aralık": System.out.println(31); break;
            case "NİSAN":
            case "Haziran":
            case "Eylül":
            case "Kasım": System.out.println(30); break;
        }
        // Kontrol zor, hataya açık.

        // Boolean True 1, False 0

        /*
         Kullanıcı Tipi : Role :
         Student, Teacher, Admin, Mentor
         if (kullanici == Role.Student) {
         }
         else {
         }
        */
    }
}
