package Day18_;

import java.util.Arrays;

public class c01 {
    public static void main(String[] args) {


        int[][] arr = {{13, 25, 37}, {41, 12, 23, 34}, {1, 2}, {7}};

        // 20 ile 40 arasinda olan sayilarin toplamini bulun

        int tplm=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length ; j++) {

                if (arr[i][j]>=20 && arr[i][j]<=40){

                    tplm +=arr[i][j];
                }

            }

        }
        System.out.println(tplm);
    }
}
