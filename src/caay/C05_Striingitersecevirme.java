package caay;

public class C05_Striingitersecevirme {
    public static void main(String[] args) {

        // Kullanicidan bir string alip
        // stringi tersine cevirip kaydedin

        String input= "Java Candir";
        String output="";

        for (int i = input.length()-1; i >=0 ; i--) {

            output += input.charAt(i);

        }
        System.out.println(output);

    }
}
