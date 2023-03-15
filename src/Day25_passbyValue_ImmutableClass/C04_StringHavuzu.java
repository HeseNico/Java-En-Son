package Day25_passbyValue_ImmutableClass;

public class C04_StringHavuzu {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Java";
        String str3=new String("Java");
        String str4="Ja" + "va";
        String s   ="Ja";
        String t   ="va";
        String str5= s.concat(t);

        System.out.println(str1.equals(str5));
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1.equals(str5)); // true

        System.out.println("===========");

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4); // true
        System.out.println(str1 == str5); // false

        // Stringlerde esitligi eguals ile kullaniriz
        // yoksa boyle hata verebilir referans veya asci codlarini alabilir

        /*
        == hem referansi hem de degeri karsilastirir
        equals() ise sadece degerleri karsilastirir

        eger String havuzunda, hem referasnsi hem degeri ayni olan Stringler == ile
        karsilastirilirsa sonuc RTE verir

        ancak new keyword kullanilarak
         */
    }
}
