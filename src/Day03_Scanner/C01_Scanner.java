package Day03_Scanner;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        /*
        Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen Isminizi giriniz");
        // System.out.println deki ln alt satira gecmesini saglar
        // yanlizca print yazarsak yan yana yazar hepsini alt satira gecmez

        String isim= scan.next();

        System.out.println("Lutfen soy isminizi girin");

        String soyisim = scan.next();

        System.out.println("lutfen yasinizi giriniz");

        double yas= scan.nextDouble();

        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz : " + soyisim);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Kayit basariyla tamamlanmistir : ");

        /*
        kullanici istedigimiz data turunde bilgi girisi yapmazsa kodumuzda hata olusur ve calisma durur
        ileride kullanici hatalarina karsi nasil tedbir alicaz ogrenecez

         */


    }
}
