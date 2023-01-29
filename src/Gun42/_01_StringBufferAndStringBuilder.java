package Gun42;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        // String eklemelerde Yazılımın hızlı çalışması için bir sistem inşa edilmiştir "StringBuilder".
        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır. Yapısı gereği hızlı çalışır.

        /* **** +, concat, StringBuilder 3 model in hızı test edilecek **** */

        long startTime = System.currentTimeMillis();
        String test1="";
        for (int i = 0; i < 10000; i++) {
            test1+=" merhaba";
        }
        System.out.println("+ için süre = " + (System.currentTimeMillis()-startTime)+" ms");

        startTime= System.currentTimeMillis();
        String test2="";
        for (int i = 0; i < 10000; i++) {
            test2=test2.concat(" merhaba");
        }
        System.out.println("concat için süre = " + (System.currentTimeMillis()-startTime)+" ms");

/* * */ startTime= System.currentTimeMillis();
        StringBuilder test3=new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            test3.append(" merhaba");
        }
        System.out.println("Builder için süre = " + (System.currentTimeMillis()-startTime)+" ms");
/*
      + için süre = 5824 ms
 concat için süre = 3138 ms
Builder için süre = 4 ms
*/
        System.out.println("***********************\n\n");
        /* *** StringBuilder ı biraz yakından tanıyalım *** */
        StringBuilder sb = new StringBuilder();
        sb.append("Bugün "); // kendine ekleme, atama gerektirmez, (concat da gerekirdi)
        sb.append("hava ");
        sb.append("güzel");
        System.out.println("sb = " + sb);

        System.out.println("sb.length() = " + sb.length());

        sb.append(4); // eklenen her şeyi toString hali var ise çevirerek ekler.
        System.out.println("sb.append() = " + sb);

        sb.reverse(); // tersine çevirir.
        System.out.println("sb.reverse = " + sb);
        sb.reverse(); // tekrar tersine çevirerek normal haline getirdim.

        sb.delete(0,5); // 0 (index) dahil 5 hariç olmak üzere siler.
        System.out.println("sb.delete() = " + sb);

        sb.deleteCharAt(3); // sadece belirtilen index deki karakteri siler.
        System.out.println("sb.deleteCharAt() = " + sb);

        sb.insert(0, "Bugün "); // 5 nolu index e kelime yi ekle : araya ekleme
        System.out.println("sb.insert() = " + sb);

        sb.replace(3,8,"bu"); // verilen aralığı str ile değiştirir. 3 dahil 8 hariç
        System.out.println("sb.replace() = " + sb);

        String strSb=sb.toString(); // StringBuilder dan String e çevirir.

        /* *** StringBuffer / Paralel Test *** */
        StringBuffer sBuffer = new StringBuffer(); // tamamen StringBuilder ile aynı.
                // tek farkı, paralel çağırılan yazılımlarda StringBuffer kullanılır.
                // 1. ve 2. satırın aynı anda çalışması gibi.
    }
}
