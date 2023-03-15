package daayy;

public class C03_hemsirerunner {
    public static void main(String[] args) {


        C02_hemsire hemsire1=new C02_hemsire();

       // hemsire1.isim="Hilal";
       // hemsire1.soyisim="Bicak";
       // hemsire1.yas=27;

        System.out.println(hemsire1.isim);//null  // Henuz atanmamis ... atadiktan sonra nul yerine yazilir
        System.out.println(hemsire1.yas);// 0
        System.out.println(hemsire1.soyisim);//null
        System.out.println(hemsire1.izindeMi);// false

        hemsire1.isim="Hilal";
        System.out.println(hemsire1.isim);// Isim atatyip yazdirdik Artik Hilal yazar
        hemsire1.yas=28;
        System.out.println(hemsire1.yas);// 28 yazar artik

    }
}
