package Day25_passbyValue_ImmutableClass;

public class Co3 {
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
            ayni str objesine yeni deger atandiginda Java eski degeri DEGISTIREMEZ.

            Bunun yerine istenen yeni degere sahip yeni bir obje olusturur
            ve str 'in pointer'ini yeni objeye yoneltir.
            Kullanilmayan eski objeler  Garbage Collector tarafindan toplanmak uzere beklerler

         */



        String str="Java candir";
        str=str.toUpperCase();
        System.out.println(str); // JAVA CANDIR
        str=str.toLowerCase();
        System.out.println(str); // java candir
        str=str.substring(5);
        System.out.println(str); // candir
        str=str.concat("Gel baba"); // concat ekleme yapar
        System.out.println(str); // candirGel baba



        String s="Java";

        for (int i = 0; i <100 ; i++) {

           s=s + ".";

        }
        System.out.println(s);




    }
}
