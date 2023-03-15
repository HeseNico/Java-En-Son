package Day15_doWhileLoop_scope;

import java.util.Scanner;

public class C04_dowhileloop {

    public static void main(String[] args) {

        //Kullanicidan toplanmak uzere sayilar alin
        // kullaniciya bitirmek icin sifira basmasini soyleyin
        // kullanici sifira bastiginda sifir haric
        // kac sayi girildigini ve toplamlarini yazdirin

        Scanner scan=new Scanner(System.in);
        int girilensyi=1;
        int toplam=0;
        int sayiadeti=0;

        while (girilensyi!=0){

            System.out.println("toplanmak uzere tam sayi giriniz " +
                    "\nBitirmek icin 0 basiniz");

            girilensyi= scan.nextInt();
            if (girilensyi!=0){
                toplam +=girilensyi;
                sayiadeti++;
            }

        }
        System.out.println("Girilen " + sayiadeti + "adet sayinin toplami " + toplam );
    }
}
