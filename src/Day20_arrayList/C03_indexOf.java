package Day20_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();

        isimler.add("Hilal");
        isimler.add("Hasan");
        isimler.add("Mujde");
        isimler.add("Sevgi");
        isimler.add("Memocan");

        System.out.println(isimler);//[Hilal, Hasan, Mujde, Sevgi, Memocan]

        // 2.indexteki elementi yazdririn

        System.out.println(isimler.get(2)); ///Mujde

        // Sevgi nin indexini yazdirin derse

        System.out.println(isimler.indexOf("Sevgi")); // 3 indexte oldugunu verdi
        System.out.println(isimler.lastIndexOf("Sevgi")); // sondan baslar ve oldugu yeri yazdirirz 3

        // peki olmayan bir ismin indexsini istersek

        System.out.println(isimler.indexOf("efe")); // olmayanin indexi -1 dir daima
        System.out.println(isimler.lastIndexOf("efe")); // olmayanin indexi -1 dir daima

        isimler.add("efe");
        isimler.add("Hasan");
        System.out.println(isimler);// [Hilal, Hasan, Mujde, Sevgi, Memocan, efe, Hasan]
        // iki hasan var simdi lastindexOf sondan baslar , index is ebastan baslar

        System.out.println(isimler.indexOf("Hasan")); // 1 index [Hilal, Hasan, Mujde, Sevgi, Memocan, efe, Hasan]
        System.out.println(isimler.lastIndexOf("Hasan")); // 6 index [Hilal, Hasan, Mujde, Sevgi, Memocan, efe, Hasan]



    }
}
