package Gun45;

public class _01_TekrarSorular─▒_10_cozum {
    public static void main(String[] args) {
        String names[]={"Thomas","Peter","Joseph"};
        String pwd[]=new String[3];
        int idx=0;

        try {
            for (String n : names) {
                pwd[idx] = n.substring(2,6);
                System.out.println(pwd[idx]);
                idx++;
            }
        }catch (Exception e){
            System.out.println("Invalid Name");
        }
/*
omas
Invalid Name
*/
    }
}
