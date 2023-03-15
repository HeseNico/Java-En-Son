package Day12_forLoops;

import java.util.Scanner;

public class C03_forloops2 {

    public static void main(String[] args) {

        /*
        Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
         sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
         Bitis degeri baslangic degerinden kucuk olsa da program calissin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Baslangic degeri girin");

        int bas= scan.nextInt();

        System.out.println("Bitis degeri girin");
        int bit= scan.nextInt();

        int sayilartoplami=0;


        if (bas<bit){

            for (int i = bas; i <=bit; i++) {
                sayilartoplami +=i;

            }

        }else { //baslangic degeri bitisten buyukse
            for (int i = bas; i >=bit; i--) {
                sayilartoplami +=i;

            }

        }
        System.out.println("Sayilar toplami : " +sayilartoplami);
    }
}
