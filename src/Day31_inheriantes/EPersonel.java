package Day31_inheriantes;

public class EPersonel {

    String isim="Personel isim Belirtilmemis";
    String unvan="Personel unvan belirtilmemis";
    boolean izindeMi;


    public void standartMaas(){

        System.out.println("Personel Asgari Ucrt : " + 8500);
    }
    public void ozelSigorta(){
        System.out.println("Personelden katki alinarak Ozel sigorta yapilir");
    }
}
