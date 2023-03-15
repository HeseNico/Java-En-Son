package ManavProjesi;

import java.util.Arrays;
import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        // Yapmanız için:
        // ( x * y ) pozitif döndürürse True yazdıran bir java programı yazın
        // değer. Else, (x * y) negatif bir değer döndürürse False değerini yazdırır.

        // Adım 1: Programınız "Lütfen ilk sayıyı girin" diye sormalıdır
        // 1. sayı içinsayı ve "Lütfen ikinci sayıyı girin"  2. sayı için.

        // Adım 2: x ve y'nin çarpımı olup olmadığını kontrol etmek için if koşulunu oluşturun
        // değerler pozitif veya negatiftir.

        // 3. Adım: Pozitif bir değerse - kullanıcı, negatifse True değerini alır
        // değer - kullanıcı False alır.

        // ÖNEMLİ: Bir Tarayıcı sınıfı kullanılmalıdır


        //Scanner scan =new Scanner(System.in);
        //System.out.println("Lutfen ilk sayiyi giriniz : ");
        //int sayi1= scan.nextInt();


        //System.out.println("Lütfen ikinci sayıyı girin" );
        //int sayi2= scan.nextInt();
        //
        //if (sayi1*sayi2>0){
        //    System.out.println("True");
        //} else if (sayi1*sayi2<0) {
        //    System.out.println("False");
        //}else {
        //    System.out.println("Gecersiz");
        //}
        String s="Hello";

        String t= new String(s);

        if ("Hello".equals(s)) System.out.println("one");

        if(t==s)System.out.println("two");

        if(t.equals(s)) System.out.println("three");

        if("Hello"==s)System.out.println("four");

        if("Hello"==t)System.out.println("five");
    }
}
