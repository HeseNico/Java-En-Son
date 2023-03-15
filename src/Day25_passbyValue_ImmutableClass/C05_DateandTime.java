package Day25_passbyValue_ImmutableClass;

import java.time.LocalTime;

public class C05_DateandTime {
    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();

        System.out.println(saat);

        System.out.println(saat.getNano());
        System.out.println(saat.getMinute());

        int toplam=0;

        int baslamasuresiNano= saat.getNano();

        for (int i = 1; i <10000 ; i++) {
            toplam+=i;

        }
        LocalTime saatson= LocalTime.now();
       int bitisSyresiNaso=saatson.getNano();


        System.out.println(bitisSyresiNaso-baslamasuresiNano);

    }
}
