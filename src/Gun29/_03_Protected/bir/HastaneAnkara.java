package Gun29._03_Protected.bir;

public class HastaneAnkara {
    public static void main(String[] args) {
        Doctor dok1=new Doctor();
        dok1.adi="ismet";
        dok1.bolumu="Dahiliye";
        dok1.hastaneAd="Ankara Hastanesi";
            // dok1.SicilNo  PRIVATE

        Doctor dok2=new Doctor("Mehmet");

    }
}
