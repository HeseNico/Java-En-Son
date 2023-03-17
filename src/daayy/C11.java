package daayy;

import java.util.Scanner;

public class C11 {
    public static void main(String[] args) {

      /*
      : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        basariyla kaydedildi" yazdirin
        - ilk harf kucuk harf olmali
        - son karakter rakam olmali
        - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali
       */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre= scan.nextLine();


        int haso=0;

        if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z'){
            haso++;
        }else {
            System.out.println("Sifrenin ilk karekteri kucuk olmalidir");

        }

        char sonharf=sifre.charAt(sifre.length()-1);

        if (sonharf>='0' && sonharf<='9'){
            haso++;
        }else {
            System.out.println("Son harf rakam olmali");
        }
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
        }else {
            haso++;
        }
        if (sifre.length()>=10){
           haso++; // burda flagg demek ondan buyuk ise tamam degilse else gec
        }else {
            System.out.println("Sifre uzunlugu en az 10 karakter olmali");
        }
        if (haso==4){
            System.out.println("Sifre tamadir");
        }

    }
}
