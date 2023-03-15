package Day25_passbyValue_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        System.out.println(sayilar);

        elementleriartir(sayilar);
       // elementleriartir(); metoduna calistirdiktan sonra
        System.out.println("element artir medodundan sonra : " +sayilar);

        yenilisteAta(sayilar);
        System.out.println("yeni liste ata medodundan sonra : "+ sayilar);

    }

    public  static  void elementleriartir(List<Integer> sayilar){
        // tum elementleri 2 katina cikar


        for (int i = 0; i <sayilar.size() ; i++) {
            sayilar.set(i, 2* sayilar.get(i));

        }
        System.out.println("Elementleri artir methodou : " + sayilar);
    }
    public static void yenilisteAta(List<Integer> sayilar){
        // sayilar listesinie yeni bir list degeri atayip
        sayilar=new ArrayList<>();

        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);

        System.out.println("yeni Liste atamedodunda : " + sayilar);

    }
}




