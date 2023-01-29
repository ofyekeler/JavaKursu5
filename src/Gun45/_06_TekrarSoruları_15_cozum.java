package Gun45;

public class _06_TekrarSoruları_15_cozum {
    public static void main(String[] args) {
        int data []={2010,2013,2014,2015,2014};
        int key=2014;
        int count=0;
        for (int e : data) {
            if (e!=key){
                continue;
      //        count++;
            }
        }
        System.out.println(count+"Found");
/* COMPILE ERROR */
    }
}
