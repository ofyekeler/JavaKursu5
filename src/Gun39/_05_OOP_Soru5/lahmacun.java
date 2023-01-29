package Gun39._05_OOP_Soru5;

public class lahmacun implements IFood{
    @Override
    public void taste() {
        System.out.println("Mükemmel yerli pizza.");
    }
    @Override
    public double ucret() {
        return 30;
    }
    void dough(){
        System.out.println("Mayalı hamur hazırlandı.");
    }
    void addMeat(){
        System.out.println("Özel kıyma eklendi.");
    }
    void bake(){
        System.out.println("Odun ateşinde pişirildi.");
    }
}
