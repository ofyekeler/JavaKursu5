package Gun45;

public class _02_TekrarSoruları_11_cozum {
    public static void main(String[] args) {

        String names[]={"Thomas","Peter","Joseph"};
        String pwd[]=new String[3];
        int idx=0;

        try {
            for (String n : names) {
                pwd[idx] = n.substring(2,6);
                idx++;
            }
        }catch (Exception e){
            System.out.println("Invalid Name");
        }
        for (String p : pwd) {
            System.out.println(p);
        }
/*
Invalid Name
omas
null
null
*/
    }
}