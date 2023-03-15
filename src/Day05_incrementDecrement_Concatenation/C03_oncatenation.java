package Day05_incrementDecrement_Concatenation;

public class C03_oncatenation {

    public static void main(String[] args) {

        // Bir string baska bir String veya baska bir data tururnden bir veriable ile
        // + isareti ile birlestirilebilir


        String a="Java";
        String b="haso";

        System.out.println(a+b);

        System.out.println(a + " " +b);

        int c=10;

        int d=20;

        System.out.println(a+c+d); // java1020 yazdi ama istedigimiz java 30 olaasiydi

        // eger String ile baska data turundeki bir deger toplanirsa Java sonucu String yapar

        // Peki Java 30 yazmak istersek paranteze almaliyiz

        System.out.println(a+(c+d)); // java30

        System.out.println(a+c*d); // islem onceligi c*d de yani 200 aile topla Java 200

        System.out.println(d+c+a); // 30Java // oncelik daima soldan baslar ayrica vcarpma ve usleer oncelikli daima




    }
}
