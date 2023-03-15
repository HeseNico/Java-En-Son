package Day13_methodOlusturma;

public class C03_faktoryel {

    public static void main(String[] args) {

        // Verdigimiz bir sayinin faktoryelini hsaplayip
        // sonucu bize donduren bir method olusturun

        int sonuc=faktoryelhesapla(5);
        System.out.println(sonuc);
        /*
        Method olusrturma asamalari
        1- public static standart (simdilik)
         2-olusturdugumuz methiod bize bir sonuc dondurecekce
        dondurecegi sonjucu data turu nu yazar
        3- method ismi
        4- merthdd parantesi icine metoda gondermemiz gereken
        bilgileri hangi variable ile gnderecegimizi yazaruiz
        (int sayi) parametresi denir
        5- dondurulmesi istenen islemi yap
        6- return keyword kullanilarak doondurulmesi istenen degeri dondurur
         */
    }

    public static int faktoryelhesapla(int sayi){ //5

        int faktoryel=1;
        for (int i = sayi; i >=1 ; i--) {

            faktoryel*=i;

        }

        return faktoryel;
    }

}
