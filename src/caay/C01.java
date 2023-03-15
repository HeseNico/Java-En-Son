package caay;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        // for (int i = 20; i <10 ; i++) {
        //     System.out.println(i + " ");
//
        // }


        // burda sonsuza gider Buna sonsuz Loop denir.

        // for (int i = 0; i < ; i--) {

        //     System.out.println(i+ " ");
        // }


        int bas = 20;
        int bit = 40;
        int sayitoplam = 0;

        if (bit < bas) {
            System.out.println("Baslangic bitisten kucuk olmali");
        } else {
            for (int i = bas; i <= bit; i++) {
                sayitoplam +=i;

            }
        }
        System.out.println("sayilarin toplami : " + sayitoplam);
    }
}
