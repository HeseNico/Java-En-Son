package Day25_passbyValue_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class Co2 {
    public static void main(String[] args) {

        /*
        String ve Wrapper Classlar immutable olduklari icin degstirilemezler

        Ancak Array ve List leri atama yapmasakta metod kullaninca
        degerleri degisir cunku muatbel dir

         */

        String str="Java guzeldir dostum";
        str.substring(2);
        str.toLowerCase();
        str.contains("noooolo");

        System.out.println(str); // Java guzeldir dostum
        // Burda atama yaptigimiz halde yazdirinca str degismedi
        // cunku String bir immutable dir degistirilemez


        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(8);
        sayilar.add(5);
        sayilar.add(7);
        System.out.println(sayilar); // [8, 5, 7]

        sayilar.set(1, 4); // set demek 1 indextekini 4 yap demek
        System.out.println(sayilar); // [8, 4, 7]

        sayilar.remove(0);
        System.out.println(sayilar); // [4, 7]


    }
}
