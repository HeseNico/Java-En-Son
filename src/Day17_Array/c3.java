package Day17_Array;

public class c3 {
    public static void main(String[] args) {
           /*
        Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        ve varsa kac kere kullanildigini yazdiran bir method olusturun
         */

        int[] arr = {2, 4, 5, 5, 7, 8, 9, 10};


        elemansayisiyazdir(arr,5);//2
        elemansayisiyazdir(arr,10);//1



    }
    public static void elemansayisiyazdir(int[] arr , int aranansayi){

        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i] == aranansayi){

                sayac++;
            }


        }
        System.out.println("aranan sayi : " + sayac);
    }
}
