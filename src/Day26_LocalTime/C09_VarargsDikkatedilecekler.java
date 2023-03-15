package Day26_LocalTime;

import java.util.Arrays;

public class C09_VarargsDikkatedilecekler {
    public static void main(String[] args) {
        // Verilen sayilardan ilki haric digerlerini toplasin
        // Sonra toplam ile ilk sayiyi carpip yazdirsin

        topla(2, 3, 4, 5, 6, 7);

       /*
       son sayiyi ayirsak olur mu?

        Varargs eklenen tum paramtreleri kendisi almak ister
        Buyuzden bir metodda parametre olarak Varargs kullanilacaksa
        en son parametre olarak Varargs kullanilirmalidir

        Bir metodda parametre olarak iki Vararg s kullanilabilir mi?
        kullanilamaz cunku varargs son parametre olmalidir
        2 varargs olursa biri sonuncu olamayacagi icin CTE verir
        */
    }

/*
    public static void topla(int... a) {

        System.out.println(Arrays.toString(a));

        int toplam = 0;

        for (int each : a) {
            toplam += each;

        }
        System.out.println(" Toplam : " + toplam);
    }
    Dikkat edilecekler
    1-
    // 2 metod icinHer nekadar parametre saysi farkli olsada
    // Varargs in yapisindan dolayi int a , int ... b ile int ...b arasinda
    // argument kabulu acisindan fark yoktur
 */

    public static void topla(int c, int... a) {

        System.out.println(Arrays.toString(a));

        int toplam = 0;

        for (int each : a) {
            toplam += each;

        }
        System.out.println("Istenen Islem Sonucu : " + toplam*c);
    }
}
