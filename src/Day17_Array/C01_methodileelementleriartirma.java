package Day17_Array;

import java.lang.reflect.Array;

public class C01_methodileelementleriartirma {
    public static void main(String[] args) {

        /*
         Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
         Eski array’i yeni haliyle kaydedin.
         */
        int[] arr = {3, 4, 5, 6};
        arr=methodileElementleriArttir(arr,2);



    }
    public static int[] methodileElementleriArttir(int[] ilkarr, int artis){

        for (int i = 0; i < ilkarr.length ; i++) {
            ilkarr[i] +=artis;

        }
        return ilkarr;

    }
}
