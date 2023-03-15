package Day14_methodOverloading_whileLoop;

public class C04_methodOverloading {
    public static void main(String[] args) {

        /*
        Java overloading kurallari
        1- isim ve parametreleri birden fazla method olusturulamaz
        2- data turleri farkli olan parametrelerin yerlerini degistirrisek
        java yeni bir methodn olarak kabul eder(int, double yerine )(double,int)


        Overloading olan claslarda Java hangi metodun calistirilacagina su sekilde karar verir

        1- cagrilan ismde method varmi?
        2-method call da kullanilan argument (parantez ici)ile yazilanlar metodlardaki
        parametrelerin %100 uyumlu oldugu varmi
        3-argument ile parametre ayni olmasa bile verilen argumentleri
        kabul edecek parametre varmi?
        4-Casting ile birden fazla metodu kullanabiliyorsa
        daha az casting ile calisacak metodu kullanir.
         */

        topla(3,5);
        topla(3.4,2.3);
        //topla("ali","veli"); // bu String bir deger bu yuzden double ve int atama yapapmm
        // bu CTE verir . Bu argumnetleri kabul edecek parametre yok
        topla('a','b');// charda isci kodlarini almis ve toplamis
        // char burda yok ama char variablelar asci tablede int gibi olabilir
        topla(3f,4f); //2 double calisir 7.0

        topla(3f,4);// kontrol ediyorum 3f doubler alir 4 ise hepsi alir
        //java  kendisini enaz yorani alir.2 metotda 2 casting yapar ama
        // 4 te zaten int var tek casting yapar


    }

    public static void topla(int a , int b){
        System.out.println("Iki tamsayinin toplami : " +(a+b));
    }

    public static void topla(double a ,double b){
        System.out.println("Iki tamsayinin toplami : " +(a+b));
    }
    public static void topla(int sayi1, double sayi2){
        System.out.println("int ve double sayilarin toplami : " +(sayi1+sayi2));

    }
    public static void topla(double sayi1, int sayi2){
        System.out.println("double ve int sayilarin toplami : "+(sayi1+sayi2));
    }
}
