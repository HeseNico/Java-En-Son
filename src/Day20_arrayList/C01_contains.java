package Day20_arrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class C01_contains {
    public static void main(String[] args) {

        // uzun bir listeyi javada list olark kaydetsek istersek


        int[] arr={2,3,4,5,6,7,8,9,0,};


        List<Integer> sayilar =new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);



        System.out.println(sayilar.contains(3));
        System.out.println(sayilar.get(2));// get bize verilen indexteki sayiyi getirri
        // yani get (2) yazince 2 indextekini yazdirir yani 4



    }
}
