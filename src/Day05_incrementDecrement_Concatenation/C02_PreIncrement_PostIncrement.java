package Day05_incrementDecrement_Concatenation;

public class C02_PreIncrement_PostIncrement {
    public static void main(String[] args) {




        /*
        Eger sayinin degeri sadece 1 artacak veya azalacaksa
        artirip sonra yazdirma/atama
        yazdirip sonra artirma/atama
        islemlerini tek satird yapabiliriz
         */

        // a"nin degerini 1 artir ve yeni degerini olusturacagiz b variablenin atayin

        int a=20;

        int b = ++a; // once artirir sonra atama yapar
       // a++;
        //int b = a;

        System.out.println("a: " + a +", b : " + b);

        // a"nin degerini b ye atayin sonra a" nin degerini 1 artir

        a=20;
        b=a++; // once atama yapar sonra artirir

       // b=a;
       // a++;

        System.out.println("a: " + a +", b : " + b);

        // Bu islemleri istersek tek satirda yapabiliriz

        // arin degerini yazdirin degerini 1 artir

        a=20;
        System.out.println("a : " + a);
        a++;

        a=20;
        System.out.println("a : " + a);
        System.out.println(" bir sonraki a: " + a++);

        // anin degerini 1 azalt ve sonra deegeri yaz


        System.out.println(--a);
    }
}
