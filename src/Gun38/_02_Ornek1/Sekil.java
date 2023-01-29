package Gun38._02_Ornek1;

public abstract class Sekil {
    private String name;

    public abstract double alan(); // soyut
    public abstract double cevre(); // soyut

    public void ciz(){
        System.out.println(name+" isimli şekil çizildi.");
    }

    @Override
    public String toString() {
        return "Sekil: " +
                "\nname='" + name + '\'' +
                "\nalan='" + alan() + '\'' +
                "\ncevre='" + cevre() + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}