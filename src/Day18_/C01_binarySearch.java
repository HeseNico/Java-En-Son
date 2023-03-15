package Day18_;

import java.util.Arrays;

public class C01_binarySearch {
    public static void main(String[] args) {

        // Verilen bir arrayde istenen bir elemanin olup olmadigini bulur

        int[] arr = {4, 9, 1, 5, 11, 3, 7, 4, 6};

        System.out.println(Arrays.binarySearch(arr, 5));  //-2
        System.out.println(Arrays.binarySearch(arr, 11)); //11
        System.out.println(Arrays.binarySearch(arr, 1));  // -1
        System.out.println(Arrays.binarySearch(arr, 7));  //-2

        // Array de binarysearchen () metodunun duzgun calismasi icin
        // oncelikle sort() calistirilmalidir

        Arrays.sort(arr);

        System.out.println(Arrays.binarySearch(arr, 5));  //-2    indextekiler simdi dogru verildi 4
        System.out.println(Arrays.binarySearch(arr, 11)); //11    indextekiler simdi dogru verildi 8
        System.out.println(Arrays.binarySearch(arr, 1));  // -1   indextekiler simdi dogru verildi 0
        System.out.println(Arrays.binarySearch(arr, 7));  //-2    indextekiler simdi dogru verildi 6
        System.out.println(Arrays.binarySearch(arr, 4)); // ilk denk gelen indexi verir
        System.out.println(Arrays.binarySearch(arr, 2)); // Aranan element yoksa verilen elementi - olaralk yazar


        // olmayan bir elemenyt aratilirsa once arrayde olsaydi nerede olurdu bunu buluyoruz
        // sonra olmasi gereken siranin - isaretli degerini veriyoruz
        // bu mantikla en kucuk elementten daha kucuk butun sayilar icin -1
        // en buyuk elementten  buyuk olan butun sayilar icinde -length -1 degeri donduurur

    }
}
