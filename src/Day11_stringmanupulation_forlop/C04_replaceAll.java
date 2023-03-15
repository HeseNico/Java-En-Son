package Day11_stringmanupulation_forlop;

public class C04_replaceAll {
    public static void main(String[] args) {

        String str="J1a23va34 5C54and65ir87";

        // str daki sayilari method ile temizleyin

        /*
        Eger degistirmek istedigimiz metin tek bir metin degil
        ortak ozleligi olan farkli metinlerse

        -- tum sayilar
        -- sayi olmayanlarin tumu
        -- veya tum spaceler
        -- veya space olmayan tum karekterler gibi
        bu ortak ozellikleri belirtmek icin java regex tanimlamistir
         */
        System.out.println(str.replaceAll("\\d", ""));
    }
}
