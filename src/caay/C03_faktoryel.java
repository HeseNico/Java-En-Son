package caay;

import java.util.Scanner;

public class C03_faktoryel {

    public static void main(String[] args) {

        int sayi=5;
        int faktoryel=1;

        for (int i = sayi; i >=1 ; i--) {
            faktoryel *=i;


        }
        System.out.println(sayi + "! "+ faktoryel);

    }
}
