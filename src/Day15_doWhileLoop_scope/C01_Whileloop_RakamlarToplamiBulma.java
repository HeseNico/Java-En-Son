package Day15_doWhileLoop_scope;

import java.util.Scanner;

public class C01_Whileloop_RakamlarToplamiBulma {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("rakamlari toplanacak pozitif tam sayi giriniz");
        int girilensayi= scan.nextInt();

        int sayi=girilensayi;
        int birlerbasamagi=0;
        int rakamlartoplami=0;

        while (sayi>0){ //sayi!=0 da yazabiliriz javanin farkli yollari var


            birlerbasamagi=sayi%10;
            rakamlartoplami+=birlerbasamagi;
            sayi/=10;


        }
        System.out.println("Girilen " + girilensayi + "nin rakamlar toplami : " + rakamlartoplami);
    }
}
