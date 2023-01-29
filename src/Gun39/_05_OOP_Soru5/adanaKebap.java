package Gun39._05_OOP_Soru5;

public class adanaKebap implements IFood{

    @Override
    public void taste() {
        System.out.println("Etin en güzel hallerinden biridir.");
    }
    @Override
    public double ucret() {
        return 75;
    }
    void marinade(){
        System.out.println("Et bir gün öncesinde özel baharatlarla terbiye edildi.");
    }
    void grill(){
        System.out.println("Kömür ateşinde yavaş pişirildi.");
    }
}
