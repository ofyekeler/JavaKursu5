package Gun38._01_Abstract_Class;

public class Ford extends BinekOto{
    // extend üzerine gel, çıkan pencerede IMPLEMENT METHODS a tıkla (OK)
    // Tekrar extend in üzerine gel, çıkan pencerede CREATE CONSTRUCTOR MATCHING SUPER'e tıkla. (OK)

    public Ford(String marka, int uretimYili, int vitesAdedi) {
        super(marka, uretimYili, vitesAdedi);
    }
    @Override
    int HizlanmaSurei() {
        return 0;
    }
}
