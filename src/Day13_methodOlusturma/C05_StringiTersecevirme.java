package Day13_methodOlusturma;

public class C05_StringiTersecevirme {
    public static void main(String[] args) {

        // Verilen bir Stringi tersine cevirip
        // bize donduren bir method olusturun

        System.out.println(stringtersinecevir("Java Candir"));
        System.out.println(stringtersinecevir("anlasildimi"));

    }

    public static String stringtersinecevir(String metin){//Java

        String tersmetin="";

        for (int i = metin.length()-1; i >=0 ; i--) {

            tersmetin +=metin.charAt(i);


        }
        return tersmetin;
    }
}
