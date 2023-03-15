package Day22_constructor;

public class C03_hemsireRunner {

    public static void main(String[] args) {

        /*
        Bir obje olusturrken parametre olarak hic bir deger girilmezse olusturulan obje
        olusturuldugu clasdaki variablelero atanan degerleri alir
         */

        C02_hemsire hemsire1=new C02_hemsire();

        System.out.println(hemsire1.evlimi);//""
        System.out.println(hemsire1.yas); // 0
        System.out.println(hemsire1.izindeMi);// false
        System.out.println(hemsire1.isim);//null

        hemsire1.isim="Haso";
        System.out.println(hemsire1.isim);
    }
}
