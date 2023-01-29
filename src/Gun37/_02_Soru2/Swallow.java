package Gun37._02_Soru2;

public class Swallow extends Animal implements IFlying{

    @Override
    public String food() {
        return "Kırlangıç solucan yer.";
    }

    @Override
    public String flying() {
        return "Kırlangıç orta yükseklikte uçar.";
    }
}
