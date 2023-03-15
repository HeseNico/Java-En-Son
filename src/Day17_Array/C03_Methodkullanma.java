package Day17_Array;

public class C03_Methodkullanma {

    public static void main(String[] args) {

        /*
        Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        ve varsa kac kere kullanildigini yazdiran bir method olusturun
         */

        int[] arr1 = {2, 4, 5, 5, 7, 8, 9, 10};

        elemanSayisiYazdir(arr1, 4);

       // String[] arr2={"E","E","H","K"};
        //elemanSayisiYazdir(arr2,"E");// "E" int aranansayi degilsitring cunku
    }

    public static void elemanSayisiYazdir(int[] arr, int arananSayi) {

        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i]==arananSayi) {
               sayac++;

           }
        }
        System.out.println(sayac);
    }
}
