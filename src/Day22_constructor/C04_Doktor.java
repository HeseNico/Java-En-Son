package Day22_constructor;

public class C04_Doktor {

    C04_Doktor(){
        System.out.println("parametresiz constructor");
    }


    String isim;
    String soyisim;
    String adres;
    int yas;
    boolean izindeMi;
    char evlimi;
    int ekmesaiucreti=30;

    public int mesaiUcretiHesapla(int mesaisaati){
        return mesaisaati*ekmesaiucreti;
    }
}
