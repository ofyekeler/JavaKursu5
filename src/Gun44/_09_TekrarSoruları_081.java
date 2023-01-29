package Gun44;

public class _09_TekrarSoruları_081 {
    public static void main(String[] args) {
        String[]strs={"A","B"};
        int idx=0;
        for (String s:strs) {
            strs[idx].concat(" element "+idx);
            idx++;
        }
        for(idx=0; idx<strs.length;idx++){
            System.out.print(strs[idx]);
        }
        // What is the result?
/* AB */
    }
}
