package Day24_StaticKeyword;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_passByValue {

    public static void main(String[] args) {

        int[] arr={3,4,5};

        elementleriArtir(arr,4);

        System.out.println("method call dan sonra arr : " + Arrays.toString(arr));

    }

    public static void elementleriArtir(int[] arr, int artismiktari){

        for (int i = 0; i <arr.length ; i++) {

            arr[i] += artismiktari;

        }
        System.out.println("methodda array : "+ Arrays.toString(arr));
    }
}
