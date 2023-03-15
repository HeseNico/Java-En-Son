package Day26_LocalTime;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime saat1= LocalTime.of(13,15); // 20:15
        System.out.println(saat1);

        LocalTime saat=LocalTime.now(); // 18:56:28.062922300
        System.out.println(saat);
        // LocalTime suanki saat degil ne zaman calistririsan o saati verir
        // canli bir ssaaat degil
        // kodun ilerleyen kisminda ne kdr sure gectigini gormek icn
        // saati yeniden gerekirse yeni bir LocalTime objesi olustrmliyiz

        System.out.println(saat.getHour()); // 18
        // get metodlari Localtime objesinin saat dk saniye ve nanao degerlerini getirir/
        System.out.println(saat.getMinute()); //57

        System.out.println(saat.plusHours(2).plusMinutes(10)); // 21:08:56.046170100

        System.out.println(saat.minusMinutes(10).minusSeconds(10)); // 18:49:41.309017900

        System.out.println(saat.withSecond(0).withNano(0)); // 19:01  // 19:01:28.329640400 bunlari 0 yaptik

        System.out.println(saat.compareTo(saat1)); // -1

        System.out.println(saat.compareTo(saat)); // 0
        // bu saati baska bir saatle karsilastiri ayniysa 0 degilse -1 yazar
        // pozitif olunca 1 de verebilir

        System.out.println(saat.isAfter(saat1)); // saat saat1 den sonrami true

        System.out.println(saat.isBefore(saat1)); // false
    }
}
