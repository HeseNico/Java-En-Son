package Day29;

public class C02_EncapsulationKullanim {
    public static void main(String[] args) {

        C01_ obj= new C01_();

        obj.isim="Hasan";
        System.out.println(obj.isim); // read yetkisi


        obj.setSayi(40); // write yetkisi
        System.out.println(obj.getSayi()); // read yetkisi


        /*
        Bir clas uyesinin public olmasi ile privet yapilip
        getter ve setter metodlarinin olusturmasi islevsel acisinidan
        ayni sonucu olusturur.

        Bazi developerlar set(write) ve get(read) yetkilerinin kullanildigini vurgulamak icin
        ikinci yontemi tercih ederler.
         */
    }
}
