package Day13_methodOlusturma;

import java.util.Scanner;

public class C06_MethodKullanma {

    public static void main(String[] args) {

        // verilen bir stringin Paliodrome olup olmadigini yazdirin
        // palidron: duzden ve tersten ayni sekilde yazilan (Kabak,12321)

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");

        String metin= scan.nextLine();

        String tersmetin=C05_StringiTersecevirme.stringtersinecevir(metin);

        if (metin.equals(tersmetin)){
            System.out.println("Girilen metin PALINDROME");
        }else {
            System.out.println("Girilen metin PALINDROME degil");
        }
    }
}
