package Day22_constructor;

import Day21_arraylist_foreachLoop.C04_karelerinToplami;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_constructor {

    public static void main(String[] args) {
        /*
        Bir obje ancak bir classtan olusturulabilir.
        Bir objeyi olusturdugumuz class ayni zamandaa o objenin data turudur.
        (Bir insan hem baba hem hoca olabilir )

        Her obje olusturdugu classin ozlelliklerini tasir
        ozellik ne demek

        Eger bir programda ortak ozelliklere sahip objeler uretmek uzere
        tasarkladiginiz bir class varsa main method olmasi sart degildir

        Bu claslar kaliphane gibi calisir
        Yani o clastan ayni ozelliklere sahib objeler uretmemizi saglar


         */

        Scanner scan=new Scanner(System.in); // scan in data turu Scannerder

        List<String> isimler=new ArrayList<>(); // bunu

        C04_karelerinToplami oble=new C04_karelerinToplami();
        // her klastan obje uretilebilir
        Random rnd=new Random();

        C02_hemsire hemsire1=new C02_hemsire();// bunun avantaji hemsire1. dedigim zaman tum bilgilerri verir

        System.out.println(hemsire1.mesaiUcretiHesapla(5));

        // Random , String , List ,Scanner bunlar hepsi bir clas

        // en basta clas isimleri sonra obje isimleri var = sag tarafi new var
        // sonra klas ismi ama yaninda () var buda metod olurbiz buna 'C04_karelerinToplami();'
        // contructor deriz.
        //Contructor ne metor ne clas ne variable
        // medota benzer ama degil.


        /*
        Constructor, bir sınıfın örneklerinin oluşturulması sırasında çağrılan bir özel bir yöntemdir.
        Constructorlar, örnek değişkenlerinin ilk değerlerini belirlemek ve
        başka hazırlıklar yapmak için kullanılırlar.
        Java'da bir sınıf tanımlandığında, sınıfın bir constructor'ı varsayılan olarak tanımlanır.
        Bu varsayılan constructor, sınıfın adıyla aynıdır ve parametre almaz.
        Eğer sınıf içinde kullanıcının istediği özelliklere göre constructor'lar tanımlanırsa,
        varsayılan constructor silinir.
        Constructorlar, sınıfların örneklerinin oluşturulması sırasında otomatik olarak çağrılırlar ve
        örnek değişkenlerinin başlangıç değerlerini belirlemek için kullanılırlar.
        Bir sınıfın birden fazla constructor'ı olabilir ve farklı parametreler alabilirler.
        Bu sayede, kullanıcılar farklı özelliklerdeki örneklerin oluşturulmasını sağlayabilirler.
         */


    }
}
