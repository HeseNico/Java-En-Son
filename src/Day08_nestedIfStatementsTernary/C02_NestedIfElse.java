package Day08_nestedIfStatementsTernary;

import java.util.Scanner;

public class C02_NestedIfElse {
    public static void main(String[] args) {

       /*
       Kullanicidan once cinsiyeti ve yasini alin,
       Kadin, 60 yas ve uzeri ,Erkek 65 yas uzeri "emekli olabilirsin " yazdirin veya
       Cinsiyet ve yasini dikkate alarak
       “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin
       //Hatali giris yapilirsa kullaniciyi uyar

        */

        // 2 degisken vvar 1 yas digeri cinsiyet
        // Ana yapimizi bir degiskenin uzerine kurariz.
        // Bu soruda cinsiyeti ana degisken yapalim


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Yasinizi  giriniz" );
        int yas= scan.nextInt();
        System.out.println("Lutfen cinsiyetinizi yaziniz" + "Kadin icin: K , Erkek icin : E giriniz");
        char cinsiyet=scan.next().charAt(0);

        if (cinsiyet=='k' || cinsiyet=='K'){
            if (yas>60){
                System.out.println("Emekli olabilirsiniz");
            }else if (yas<60){
                System.out.println("Emekli olmaniz icin " +(60-yas)+ "Yil calismalisiniz");
            }

        }else if (cinsiyet=='e' || cinsiyet=='E'){
            if (yas>65){
                System.out.println("Emekli olabilirsiniz");
            }else if (yas<65){
                System.out.println("Emekli olmaniz icin " +(65-yas)+ "Yil calismalisiniz");
            }

        }else{
            System.out.println("Gecersiz cinsiyet tekrar giriniz");
        }

    }
}
