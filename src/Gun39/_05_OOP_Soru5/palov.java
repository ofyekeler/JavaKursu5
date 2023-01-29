package Gun39._05_OOP_Soru5;

public class palov implements IFood{
    @Override
    public void taste() {
        System.out.println("Çocukların vazgeçilmezi.");
    }
    @Override
    public double ucret() {
        return 25;
    }
    void fry(){
        System.out.println("Pirinç ve şehriye kavruldu.");
    }
    void boil(){
        System.out.println("Kısık ateşte pişirildi.");
    }
}
