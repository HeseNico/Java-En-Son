package Day03_Scanner;

import java.util.Scanner;

public class C02_ {
    public static void main(String[] args) {

        /*
        Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        girilen bilgiler : J Doe, 44
         */

        Scanner scan= new Scanner(System.in);

        // Tek bir aciklama ile 3 bilgiyide alabiliriz

        System.out.println("Lutfen isninizi, soyisminizi ve yasinizi giriniz" +
                "\nHer bilgiden sonra ENTER'a basiniz");

        char isimIlkharf=scan.nextLine().charAt(0);
                /*
                Scanner methidlarinda nextchar yok bunun icin once
                 kullanicinin girisine gore next veya nextline yazip
                sonra charAt(0) yazariz
                parantez icnde 0 olmak istedigimiz indextir ve javada index 0 dan baslar
                 */

        String soyisim= scan.nextLine();
        double yas= scan.nextDouble();

        System.out.println("Girilen bilgiler : " + isimIlkharf +" "+soyisim+", "+yas);
    }
}
