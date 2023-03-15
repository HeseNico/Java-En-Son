package Day26_LocalTime;

import java.time.LocalDateTime;

public class C04 {

    public static void main(String[] args) {

        LocalDateTime  ldt= LocalDateTime.now();
        System.out.println(ldt); //2023-03-09T19:52:40.595616300
        System.out.println(ldt.toLocalDate()); // 2023-03-09 sadece tarihi aliyor
    }
}
