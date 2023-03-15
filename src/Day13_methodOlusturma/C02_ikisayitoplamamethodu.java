package Day13_methodOlusturma;

import java.util.Scanner;

public class C02_ikisayitoplamamethodu {

    public static void main(String[] args) {

        // once yazdiran method yapalim
        // Kullanicidan 2 sayi alip toplamalarini yazdiran
        // bir method olusturun

        // Method main methodun disinda olustururlur
   ikisayitopla();
   ikisayitopla();// methodlar cagirilmadan calismaz 2 defa cagirdik 2 kez calisir
        // ilk iki sayi toplar sonra 2 tane ister onu da ayri topla
    }
    // Method main methodun disinda clasin icinde olustururlur

    public static void ikisayitopla(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Toplamak uzere 2 sayi girirniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("Iki sayinin toplami : " + (sayi1+sayi2));
    }
}
