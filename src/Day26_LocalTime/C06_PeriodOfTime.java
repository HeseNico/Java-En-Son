package Day26_LocalTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class C06_PeriodOfTime {

    public static void main(String[] args) {

        LocalDate dogumtarihi=LocalDate.of(1995,1,28);
        LocalDate bugun = LocalDate.now();

        System.out.println(Period.between(dogumtarihi, bugun)); //P33Y5M17D // P28Y1M9D hilalin

        System.out.println("Yas  : " + Period.between(dogumtarihi,bugun).getYears()); // Yas  : 28
        System.out.println("Gun  : " + Period.between(dogumtarihi,bugun).getDays()); //  Gun  : 9




    }
}
