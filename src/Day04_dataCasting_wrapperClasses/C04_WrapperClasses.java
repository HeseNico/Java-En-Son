package Day04_dataCasting_wrapperClasses;

public class C04_WrapperClasses {
    public static void main(String[] args) {

        /*
        // non-primitive data turlerinin hazir metodu VARDIR
        // primitive data turlerinin hazir metodu YOKTUR
        // java primitive data turleri icin kolayca gecis yapabilecekleri non-primitive data turleri olusturmustur.

        int ===> Integer
        char ==> Character
        byte ==> Byte
        boolean ==>Boolean
         */

        Integer sayi=10;
        // int ile atadigimiz degerleri atayabiliyoruz
        // arti olark hazir metodlari var.

        // variable olusturmadan da bazi metodlari kullanabiliyoruz
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        String sonucStr="345";

        System.out.println(sonucStr+10);  // Metin ifadeler yanyana yazar toplama yapmadi

        // bu degere 10 ekle

       // int sonuc=(int) sonucStr;
        // bu durumda Wrapper classlar imdata yetisir

        int sonuc = Integer.parseInt(sonucStr);
        System.out.println(sonuc+10);

        // value0f ve parseInt toplama yapar.

        char krk='3';

        System.out.println(Character.isDigit(krk)); // true demesi lazim

        System.out.println(Character.isLetter(krk)); // false



    }
}
