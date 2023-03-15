package Day16_Scope_arrays;

import java.util.Arrays;

public class C03_ArrayElementleriniyazdirma {

    public static void main(String[] args) {

        int[] arr={3,5,6,7,8,1,2};
        //tum arayi yazdir
        System.out.println(Arrays.toString(arr));

        // Arrayin tum elementlerini yanayana aralarinda bir bosluk olarak yazdirirn

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");  // 3 5 6 7 8 1 2  bunlar arrayin elementleri

        }


    }
}
