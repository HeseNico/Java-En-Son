package Day25_passbyValue_ImmutableClass;

import java.util.Locale;

public class C03_InmutableClasses {

    public static void main(String[] args) {

         /*
            Java'da bir class ve oclass'dan olusturulan objeler
            ya mutable'dir, ya da immutable'dir.
            Java metinsel ifadeleri atayabilecegimiz 3 class olusturmustur

            String  --- immutable
            StringBuilder --- mutable
            StringBuffer --- mutable

            immutable bir class'dan olusturulan objeler de immutable'dir
            String immutable oldugundan

            ayni str objesine yeni deger atandiginda Java eski degeri DEGISTIREMEZ
            bunun yerine istenen yeni degere sahip yeni bir obje olusturur
            ve str 'in pointer'ini yeni objeye yoneltir.
            kullanilmayan eski objeler
            Garbage Collector tarafindan toplanmak uzere beklerler
         */

        String str="Java candir";

        str=str.toLowerCase();
        System.out.println(str); // java candir

        str=str.toUpperCase(); // JAVA CANDIR

        // asagdaki kod calistiginda java kac obje olusturur

        String s="Hava"; // bir tane burdan olusturur

        for (int i = 0; i <100 ; i++) { // 100 tanede burdan toplam 101 obje olusturur.

            s= s + " . ";

        }
        System.out.println(s);
    }
}
