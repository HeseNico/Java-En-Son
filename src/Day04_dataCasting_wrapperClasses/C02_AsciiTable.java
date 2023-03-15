package Day04_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C02_AsciiTable {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz");

        char girilenHarf= scan.next().charAt(0);

        System.out.println("Girilen harf : " + girilenHarf +
                          "");

    }
}
