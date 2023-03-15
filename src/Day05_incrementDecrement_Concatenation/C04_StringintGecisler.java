package Day05_incrementDecrement_Concatenation;

public class C04_StringintGecisler {
    public static void main(String[] args) {

        String s1="423";

        // s1 i int ra cevirmek istersek

        int sayi= Integer.parseInt(s1); // 423 oldu

        System.out.println(sayi++); // once 423 yazacak sonra artiracak

        int a=20;
        int b=40;

        // bu iki sayiyi kullanarak 2040 yazdirin

        System.out.println(a+b); // 60 yazdirir ama ben 2040 istiyorum

        // herhangi birsayiyi Stringe cevirmek istersen hiclik("") yazin

        System.out.println(a+""+b);
        System.out.println(""+a+b);

    }
}
