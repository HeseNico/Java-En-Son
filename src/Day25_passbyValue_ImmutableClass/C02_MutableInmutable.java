package Day25_passbyValue_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class C02_MutableInmutable {

    public static void main(String[] args) {

        /*
        String ve wrapper claslar immutable olduklari icin degistirilemezler
        ancak Array ve List mutable olduklari icin
        atama yapmasakta metod kullaninca degerleri degisir.
         */

        String str="Java gun gectikce dahada keyifi oluyor";

        str.substring(5);
        str.substring(3,15);
        str.startsWith("Java");
        str.toLowerCase();
        System.out.println(str);// Java gun gectikce dahada keyifi oluyor


        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(8);

        System.out.println(sayilar); // [5, 8]

        sayilar.set(0,7);
        sayilar.remove(1);

        System.out.println(sayilar); // [7]
    }
}
