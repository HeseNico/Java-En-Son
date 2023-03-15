package Day11_stringmanupulation_forlop;

public class C05_replaceAll {
    public static void main(String[] args) {

        String str= "   J&ava54 C+an01dir,,,   ";
        str=str.trim();

        // str Java Candir haline getirin

        str=str.replaceAll("\\d","");

        str=str.replaceAll(" ", "5");

        str=str.replaceAll("\\W","");

        str=str.replaceAll("5", " ");



        System.out.println(str);
    }
}
