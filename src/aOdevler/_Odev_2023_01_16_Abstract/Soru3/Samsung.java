package aOdevler._Odev_2023_01_16_Abstract.Soru3;

public class Samsung extends Phone{
    @Override
    public void options(String hafiza, String ekran) {
        if(hafiza.contains("256GB") && ekran.contains("5.5inch")) { card.add("$1000"); }
        else if(hafiza.contains("256GB") && ekran.contains("7.5inch")) { card.add("$1200"); }
        else if(hafiza.contains("512GB") && ekran.contains("5.5inch")) { card.add("$1300"); }
        else if(hafiza.contains("512GB") && ekran.contains("6.5inch")) { card.add("$1400"); }
    }
}
