package Day25_passbyValue_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class Co1 {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);

        System.out.println(sayilar); // [3, 4, 5]
        elementleriartir(sayilar);
        elementleriyeniyao(sayilar);
        System.out.println(sayilar);
    }

    public static void elementleriartir(List<Integer> sayilar){

        for (int i = 0; i <sayilar.size() ; i++) {

            sayilar.set(i, 2*sayilar.get(i));

        }
        System.out.println(sayilar);


    }

    public static void elementleriyeniyao(List<Integer> sayilar){

        sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(4);
        System.out.println(sayilar);
    }



}
