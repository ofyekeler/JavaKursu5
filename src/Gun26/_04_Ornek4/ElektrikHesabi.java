package Gun26._04_Ornek4;

/*2.Adım*/public class ElektrikHesabi {
    int toplamTuketim=0;
    double birimFiyat=0.7;
    double fatura=0;

/*5.Adım*/public void tuketimEkle(int aylikTuketim){

        toplamTuketim+=aylikTuketim;
    }
/*6.Adım*/public void toplamTuketimYaz(){
        System.out.println("toplamTuketim= " + toplamTuketim);
    }
/*6.Adım*/public void faturaYaz(String isim){
        double toplamTutar=toplamTuketim*birimFiyat;
        System.out.println("************************");
        System.out.println("       Faturanız        ");
        System.out.println("************************");
        System.out.println("Müşteri= " + isim);
        System.out.println("toplamTuketim = " + toplamTuketim+" mW");
        System.out.println("toplamTutar = " + Math.round(toplamTutar)+" USD");
        System.out.println("************************");
    }
}
