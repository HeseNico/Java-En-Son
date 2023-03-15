package Day26_LocalTime;

import java.time.LocalDate;

public class C02_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        System.out.println(tarih); // 2023-03-09

        System.out.println(tarih.isLeapYear()); // artik yilmi diye sorar // false

        LocalDate tarih2=LocalDate.of(2020,10,10);
        System.out.println(tarih2.isLeapYear()); // true

        System.out.println(tarih.plusWeeks(20)); // 20 hafta sonra 2023-07-27

        System.out.println(tarih.withYear(1923).withMonth(5)); // 1923-05-09

        System.out.println(tarih.getDayOfYear());// bugun yilin kacinci gunu verir.

        System.out.println(tarih.getMonth()); // MARCH
        System.out.println(tarih.getMonthValue()); // 3

        LocalDate trih=LocalDate.of(1989,9,20);
        System.out.println(trih.getDayOfWeek()); // WEDNESDAY
        LocalDate taarih=LocalDate.of(1995,1,28);
        System.out.println(taarih.getDayOfWeek()); // SATURDAY


    }
}
