package Day02_dataTurleri;

import java.util.Scanner;

public class C05_ {

    public static void main(String[] args) {

        // kullanicidan bir sayi alin
        // ve sayinin karesini yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin");
        double girilenSayi= scan.nextDouble();
        System.out.println("Girilen sayinin karesi : " + girilenSayi*girilenSayi);
    }
}
