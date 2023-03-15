package Day08_nestedIfStatementsTernary;

import java.util.Scanner;

public class C03_NestedIf {
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
        // Bu soruda yasi ana degisken yapalim


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Yasinizi  giriniz" );
        int yas= scan.nextInt();
        System.out.println("Lutfen cinsiyetinizi yaziniz" + "Kadin icin: K , Erkek icin : E giriniz");
        char cinsiyet=scan.next().charAt(0);

        if ( yas<16 || yas>80){
            System.out.println("Gecersiz yas");
        }else if (yas<60){
            if (cinsiyet=='k' || cinsiyet=='K'){
                System.out.println("Emekli olmaniz icin " +(60-yas)+ " Yil daha calismalisiniz");
            }else{
                System.out.println("Gecersiz cinsiyet");
            }

        }else if(yas<65){
            if (cinsiyet=='e' || cinsiyet=='E'){
                System.out.println("Emekli olmaniz icin " +(65-yas)+ " Yil daha calismalisiniz");
            }else {
                System.out.println("Gecersiz cinsiyet");
            }

        }else{
            System.out.println("Artik emeklisin ");
        }

    }
}
