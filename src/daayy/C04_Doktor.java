package daayy;

public class C04_Doktor {


    String isim="Henuz atanmamis";
    String soyisim="Henuz atanmamis";
    String adres;
    char evliMi;

    int yas;
    boolean izindeMi;
    int ekmesaiUcreti=30;

    public int mesaiUcretiHesapla(int mesaiSaati){
        return mesaiSaati*ekmesaiUcreti;
    }
}
