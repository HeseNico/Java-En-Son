package ManavProjesi;

import java.time.LocalDate;
import java.util.Scanner;

public class C00000 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen birinci kisinin isminizi giriniz : ");
        String isim1 = scan.nextLine();

        System.out.println("Lutfen ikinci kisinin ismini giriniz : ");
        String isim2 = scan.nextLine();

        System.out.println(" Birincisinin dogum tarihini gun, ay, yil olarak giriniz");

        int gun = scan.nextInt();
        int ay = scan.nextInt();
        int yil = scan.nextInt();

        LocalDate tarih1 = LocalDate.of(yil, ay, gun);

        System.out.println("Ikinci kisinin dogum tarihi gun, ay,yil olarak giriniz");

        gun = scan.nextInt();
        ay = scan.nextInt();
        yil = scan.nextInt();

        LocalDate tarih2 = LocalDate.of(yil, ay, gun);

        System.out.println(tarih2.isAfter(tarih1) ? "Buyuk olan : " + isim1 : "Buyuk olan : " + isim2);

    }
}
