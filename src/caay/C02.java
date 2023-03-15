package caay;

import java.util.Scanner;

public class C02 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sayi giriniz");

        int bas= scan.nextInt();
        int bit=scan.nextInt();
        int toplam=0;

        if (bas<bit){
            for (int i=bas;i<=bit;i++){
                toplam=toplam+i;
            }
        }else {
            for (int i = bas; i < bit; i--) {
                toplam +=i;
            }
        }
        System.out.println("Sayilarin toplamı:"+toplam);
    }
}
