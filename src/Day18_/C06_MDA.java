package Day18_;

public class C06_MDA {
    public static void main(String[] args) {

        int[][] arr={{3,5,7},{1,2,3,4},{1,2},{7}};
        // arrayde kac tane cift sayi oldugunu bulunuz

        int sayac=0;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

               if (arr[i][j]%2==0){
                   sayac++;
               }

            }

        }
        System.out.println("cift sayi adeti : " + sayac);
    }
}
