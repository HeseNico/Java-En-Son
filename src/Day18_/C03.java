package Day18_;

import java.util.Arrays;

public class C03 {

    public static void main(String[] args) {

        int[][] arr={{3,4,5},{2,3},{1}};// {3,4,5}o index . {2,3} 1 index .{1}2 index
        // int[][] iki katli array belirtir
        // ilk koseli parantez ana array outterarray kontrol eder
        // ikinci koseli parantez ise icerdeki arraylari innerarrayler kontrol eder

        System.out.println(arr[1][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[2].length);
        System.out.println(arr[1]); // [I@7b23ec81

        System.out.println(Arrays.toString(arr[1])); // [2, 3]
        System.out.println(Arrays.toString(arr)); // [[I@6acbcfc0, [I@7b23ec81, [I@5f184fc6]
        System.out.println(Arrays.deepToString(arr)); // [[3, 4, 5], [2, 3], [1]]

        System.out.println(arr.length);

    }
}
