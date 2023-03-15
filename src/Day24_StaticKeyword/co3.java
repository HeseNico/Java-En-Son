package Day24_StaticKeyword;

import java.util.Arrays;

public class co3 {
    public static void main(String[] args) {

        int [] arr={3,4,5,6};
        elementleriArtir(arr,3);
        elementlertoplami(arr);

    }
    public static void elementleriArtir(int[] arr, int artismiktari){

        for (int i = 0; i < arr.length ; i++) {

            arr[i] +=artismiktari;

        }
        System.out.println("Artis miktari sonrasi : " + Arrays.toString(arr));

    }
    public static void elementlertoplami(int[] arr){

        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {
            toplam +=arr[i];

        }
        System.out.println(toplam);
    }

}
