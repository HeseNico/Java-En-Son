package Day18_;

public class C05_MDA {

    public static void main(String[] args) {

        int[][] arr={{3,5,7},{1,2,3,4},{1,2},{7}};

        // Toplam element sayisi kactir

        int elementsayisi=0;
        for (int i = 0; i < arr.length ; i++) {

           elementsayisi += arr[i].length;


        }
        System.out.println("Top Element sayisi : " + elementsayisi);

        // Tum elementlerin toplamini bulun

        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                toplam +=arr[i][j];

            }

        }
        System.out.println("Elementlerin toplami : " + toplam);
    }
}
