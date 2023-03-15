package Day13_methodOlusturma;

import java.util.Scanner;

public class C04_Methodkullanma {
    public static void main(String[] args) {

        // Kullanicidan ondan kucuk iki pozitif tamsayi alip
        // faktoryel degerlerini toplayin

        Scanner scan=new Scanner(System.in);
        System.out.println("10dan kucuk 2 adet pozitif tam sayi girin");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        int sonuc= C03_faktoryel.faktoryelhesapla(sayi1)
                + C03_faktoryel.faktoryelhesapla(sayi2);

        System.out.println(sonuc);
    }
}
