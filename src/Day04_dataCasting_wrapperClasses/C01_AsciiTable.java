package Day04_dataCasting_wrapperClasses;

public class C01_AsciiTable {
    public static void main(String[] args) {


        /*

        24==>  11000
         a==>  97
         b==>  98

         ahmet
         */

        System.out.println(5 + 'a'); // 5 + 97

        char ilkHarf = 101;

        System.out.println(ilkHarf);


        // Kullanicinin verdigi harften bir sonraki harfi yazdir

        char girilenChar= 'f';
        System.out.println(girilenChar+1); // 102 + 1

        // biz 103 degil 103 karsiligi olan char ifadeyi yazdirmak istersek explicit casing yapmaliyiz

        System.out.println("Girilen harfin bir sonrasi "+(char) (girilenChar+1));

        girilenChar='M';

        System.out.println(girilenChar-2);




    }
}
