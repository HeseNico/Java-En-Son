package Day16_Scope_arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {

        String[] isimler={"Hasan","Berke","Hilal"};// Java bunu kabul etmez
        // [] javaya bunun bir array oldugunu ifade eder
        int[] sayilar={3,4,5,6,7,5,4,3,2,2};
       // char karekterler = {'e','d','v'}; bundada yine koseli parantez birakip gider
        char[] karekterler = {'e','d','v'}; // bak giiti

        // Array non-primitive data turlerindendir
        // Eger arrayi liste seklinde olusturmayip
        // new keyword kullaniyorsak
        // uzunlugunu yazmak zorundayiz

        String[] arr = new String[5]; // suan itiraz var ama 5 yazdik gitti

        // Bir array tanimlanan uzunluktan daha fazla veya az eleman alamaz

        // bir arrayi yazdirmak istersek
        System.out.println(isimler);//[Ljava.lang.String;@7b23ec81 verdi
        // arrayler direk yazdirilamazlar

        System.out.println(Arrays.toString(isimler));//[Hasan, Berke, mustafa]
        System.out.println(Arrays.toString(sayilar));//[3, 4, 5, 6, 7, 5, 4, 3, 2, 2]

        System.out.println(Arrays.toString(arr));// 5 tane null [null, null, null, null, null]

        int[] a=new int[7];

        System.out.println(Arrays.toString(a));//[0, 0, 0, 0, 0, 0, 0]

        // array deki elementlere nasil ulasiriz? index ile

        a[0]=4;
        System.out.println(Arrays.toString(a));// [4, 0, 0, 0, 0, 0, 0] 0 indexine atama yapti
        a[5]=8;
        System.out.println(Arrays.toString(a));// [4, 0, 0, 0, 0, 8, 0] 5 indexine atama yapti

        //sayilar arrayinin 4 indexsini elementi yazdirin

        //  int[] sayilar={3,4,5,6,7,5,4,3,2,2};
        System.out.println(sayilar[4]); // 7 yazdi

        // String[] isimler={"Hasan","Berke","mustafa"};
        System.out.println(isimler[0]); // Hasan 1 index ban abir string verdi
        System.out.println(isimler[2]); // Hilal 2 index
    }
}