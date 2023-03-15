package Day21_arraylist_foreachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArrayElementleriniBenzersizYapma {
    public static void main(String[] args) {

        /*
        Soru 1- Verilen bir array’de tekrar eden elementler icin,
                mukerrer olanlari silip, tum elemanlardan sadece 1 tane yapip
                eski array’e yeni halini atayip yazdirin.
         */

        Integer[] arr = {3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};

        List<Integer> benzersizelementListesi=new ArrayList<>();

        // arr deki herbir elementi kontrol edelimm
        // listede yoksa ekle varsa eklemeyelim

        for (int each: arr
             ) {


            if(!benzersizelementListesi.contains(each)){
                benzersizelementListesi.add(each);

            }
        }


        System.out.println(benzersizelementListesi);

        arr=new Integer[benzersizelementListesi.size()];

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length ; i++) {

            arr[i]=benzersizelementListesi.get(i);
            System.out.println(Arrays.toString(arr));

        }/// hata loop icinde yapiyoruz disinda olmasi gerek

    }
}
