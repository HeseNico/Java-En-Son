package Day17_Array;

import java.util.Arrays;

public class c1 {
    public static void main(String[] args) {

        /*
         Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip
          bize donduren bir method olusturun.
         Eski array’i yeni haliyle kaydedin.
         */

        int[] arr={3,4,5,6};

        arr=arrayelenmetleiniartir(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] arrayelenmetleiniartir(int[] ilkarr, int artis){

        for (int i = 0; i <ilkarr.length ; i++) {

            ilkarr[i] +=artis;
            
        }

        return ilkarr;
    }
}
