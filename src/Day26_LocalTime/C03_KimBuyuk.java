package Day26_LocalTime;

import java.time.LocalDate;
import java.util.Scanner;

public class C03_KimBuyuk {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ilk kisinin ismi");
        String isim1 = scan.nextLine();
        System.out.println("ikinci kisinin isimini girin");
        String isim2 = scan.nextLine();

        System.out.println(" ilk kisinin dogum darihi g-a-y olarak girin");
        int gun = scan.nextInt();
        int ay  = scan.nextInt();
        int yil = scan.nextInt();

        LocalDate tarih1= LocalDate.of(yil,ay,gun);

         gun = scan.nextInt();
         ay  = scan.nextInt();
         yil = scan.nextInt();

         LocalDate tarih2=LocalDate.of(yil,ay,gun);

        System.out.println(tarih2.isAfter(tarih1) ?
                            "Buyuk olsan isim1 " + isim1 :
                            "Buyuk olan isim 2 " + isim2);
    }
}
