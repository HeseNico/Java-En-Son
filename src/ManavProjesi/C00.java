package ManavProjesi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C00 {
    public static void main(String[] args) {


     int[] arr = {3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};

        List<Integer> benzersizelementlistesi=new ArrayList<>();

        for (int each:arr) {

            if (!benzersizelementlistesi.contains(each)){
                benzersizelementlistesi.add(each);

            }
        }
        System.out.println(benzersizelementlistesi);

        arr=new int[benzersizelementlistesi.size()];

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length ; i++) {

            arr[i]=benzersizelementlistesi.get(i);

        }
        System.out.println(benzersizelementlistesi);
    }
}
