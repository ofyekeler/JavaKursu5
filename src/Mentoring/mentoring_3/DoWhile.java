package Mentoring.mentoring_3;

public class DoWhile {
    public static void main(String[] args) {

        int control = 3;

        do {
            System.out.println("java");
            control++;

        }while (control < 3);  // değer tanımladık ancak koşul sağlanmadığı halde döngü bir kez çalıştı!!

        //*****************************************************

        while (control < 3){
            System.out.println("java");  // while döngüsünde koşul sağlanmazsa döngü çalışmaz
            control++;
        }
    }
}
