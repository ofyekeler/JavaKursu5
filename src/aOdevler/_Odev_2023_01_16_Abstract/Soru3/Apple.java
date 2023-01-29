package aOdevler._Odev_2023_01_16_Abstract.Soru3;

public class Apple extends Phone{
    @Override
    public void options(String hafiza, String ekran) {
        if(hafiza.contains("64GB") && ekran.contains("5.5inch")) { card.add("$750"); }
        else if(hafiza.contains("64GB") && ekran.contains("6.5inch")) { card.add("$850"); }
        else if(hafiza.contains("128GB") && ekran.contains("5.5inch")) { card.add("$950"); }
        else if(hafiza.contains("128GB") && ekran.contains("6.5inch")) { card.add("$1200"); }
    }
}
