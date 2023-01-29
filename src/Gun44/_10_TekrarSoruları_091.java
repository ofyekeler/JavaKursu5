package Gun44;

public class _10_TekrarSoruları_091 {
    public static void main(String[] args) {
        int[]intArr={8,16,32,64,128};

        // Which two code fragments, independently, print each element in this array? (Choose two.)

/* A */ // out of bounds hatası : runtime error
        // for(int i: intArr) //i= 8,16,32,64,128
        // System.out.println(intArr[i]+" ");

/* B */ for(int i:intArr){
            System.out.print(i+" "); // foreach de "i" kullanırız. fori de "intArr[i]" kullanırız.
        }

/* C */ // compile  hatalı compile error
        // for(int i=0: intArr){
        //   System.out.println(intArr[i] + " ");
        //   i++;
        // }
        // System.out.println();   // sadece indexleri yazar

/* D */ // for (int i = 0; i < intArr.length; i++) {
        //   System.out.print(i+" "); // 0,1,2,3,4
        // }

        System.out.println();
/* E */ for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]+" ");
        }

/* F */ // compile  hatalı compile error
        // for(int i; i< intArr.length ; i++){
        //  System.out.println(intArr[i]);
        // }
    }
}
