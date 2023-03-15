package Day10_Stringmanuplation;

public class C03_startsWith_endswith {
    public static void main(String[] args) {
        // ile baslar demek
        //baslangigi bunlami basliyor demek startWith() ile baslar

        String str="Java harika";

        System.out.println(str.startsWith("java")); // false

        System.out.println(str.startsWith("Ja")); // true

        System.out.println(str.startsWith(str)); // true

        System.out.println(str.startsWith("")); // true

        System.out.println(str.startsWith("lo")); // false

        // Sonu bununlami bitiyor demeke .endsWith ile yapiyoryuz
        System.out.println(str.endsWith("a"));// true

        System.out.println(str.endsWith(""));// true

        System.out.println(str.endsWith(str.substring(str.length() - 1)));
    }
}
