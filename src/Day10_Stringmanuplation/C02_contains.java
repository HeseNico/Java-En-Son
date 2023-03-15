package Day10_Stringmanuplation;

public class C02_contains {
    public static void main(String[] args) {
        // icermek demek
        String str="Java ogren, isi kap";
        System.out.println(str.contains("Java"));// bu icerik "Java icerir sorusunu sorar // true evet icerir
        String s="ka";
        System.out.println(str.contains(s)); // variable tirnak icine alamayiz // true
        System.out.println(str.contains("a")); // varmi yokmu varsa true yoksa false // true

        System.out.println(str.contains(" ")); // bosluklar var // true
        System.out.println(str.contains("")); // hiclik aile ve araisnda hiclik var
        System.out.println(str.contains("java")); // false java yok Java var

    }
}
