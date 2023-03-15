package Day09_Swich_StringManupulation;

public class C04_equals {
    public static void main(String[] args) {

        // equal'in kelime anlami esittir
        String str1="Java";
        String str2="JAVA";
        String str3="java";
        String str4="JaVa";


        System.out.println(str1.equals(str2));// Bu ikisi ayni degil bize false yazdirir // false verir
        System.out.println(str1.equalsIgnoreCase(str4)); // true verir


        // Eger buyuk kucuk dikkat etmeden ayniysa equalsIgnoreCase() yapmaliyiz
        // bu ne demek "JAVA"="Java"="jAvA" nasil yazilirsa yazilsin yeterki ayni olsun //true verir
        String str5="java";
        String str6="Ja";
        String str7="va";
        String str8=str6.concat(str7);
        System.out.println(str8); // Java yazar

        System.out.println(str1==str5); // java ==java true verir
        System.out.println(str1==str8); // Java== Java false yazar
        /*
        == ile Stringleri karsilastirirsak hem metin degerine hem referanslarina bakar
        equals ile string karsilartirisak sadece metin degerine bakar

        == ile stringleri karsilastirdigimizda bekledigimizden farkli sonclar alabliriz.
        buyuzdn 2 stringi karsilastricadaksak == degil equals kullaniriz
         */



    }
}
