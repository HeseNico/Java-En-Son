package Day11_stringmanupulation_forlop;

public class C03_replace {

    public static void main(String[] args) {

        // Bunun anlami harf veya cumleyi degistirebiliriz

        String str= "Java candir";

        System.out.println(str.replace('J', 'H'));

        System.out.println(str.replace("a", ""));

        System.out.println(str.replace("Java", "x"));

        System.out.println(str.replace("v", "yaya"));

        System.out.println(str.replace("Java", "1236"));

        // str daki spaceleri yok edin derse

        str=str.replace(" ", "");
        System.out.println(str);//Javacandir

        System.out.println(str.replaceFirst("a", ""));// burda yanliz ilk a degisir//Jva Candir

    }
}
