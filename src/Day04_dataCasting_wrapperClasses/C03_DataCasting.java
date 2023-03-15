package Day04_dataCasting_wrapperClasses;

public class C03_DataCasting {
    public static void main(String[] args) {


        int a=20;
        int b=6;
        System.out.println(a/b); // 20/3 = 3

        // Java bolunen iki sayi tam sayi ise sonucun da tamsayi kismini verir

        double c=6;

        System.out.println(a/c); // 20/3= 3.333333333333333
        // int/double oldugundan double sonucundan verir

        // bolunen sayilarin data turleri farkli ise sonucu daha genis olanin cinsinden verir

        float d=6f;
        System.out.println(a/d); // 20/6 = 3.333333 // floattta f yazilma zorunlulugu var

        // float virgulden sonra 6 rakan yazar

        // a/b isleminin sonucu ondalikli olarak nasil yazdirabiliriz

        System.out.println((double) (a/b)); // 3.0

        // islem onceligi (a/b) dedir
        // Java oncelikle a/b islemini yapar ve sonucu 3 bulur
        // sonra double oldugundan 3 u double cast eder3.0 bulur.
         // bolme isleminin sonucunun double olmasi icin isleme girenlerden birisi double iolmalidir.


        System.out.println((double) a/b);

        System.out.println(a/ (double)b);

         // ikisindede ayni sonucu verdi
         // yani ikisinden birtanesi double olmasi yeterli.

        int e=1467;

        System.out.println(e=e/10); // 146 e ve 10 da int oldugundan tam sayi olarak 146 yazar

        System.out.println(e);  // 146  enin degeri 146 burda

        e=e/10; //14.6 // ikiside int oldugunda tam sayi yazar

        System.out.println(e);

        e=e/10;

        System.out.println(e);

        e=e/10;

        System.out.println(e); // 1467 10 boldukce ondalik sayi git gide 1 kalir birdaha bolunce 0 kalir



    }
}
