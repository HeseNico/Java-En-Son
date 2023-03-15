package Day18_;

public class C04 {

    public static void main(String[] args) {

        String[][] siniflar={{"A","B","G","M"},{"F","P","A","V"},{"K","D","Q"}};

        System.out.println(siniflar[0][2]);
        // Q u Y yap
        //atama yapilacak
        siniflar[2][2]="Y";
        System.out.println(siniflar[2][2]);

        // ilk sinifin mevcudunu yazdirin


        System.out.println(siniflar[0].length); // array olugumdam dolayi lenght alirsan mevcudu verir

        // siniflarda toplam kac kisi oldugunu yazdirin

        int toplamOgrncisayisi=0;

        for (int i = 0; i <siniflar.length ; i++) {

            toplamOgrncisayisi+=siniflar[i].length;

        }
        System.out.println("Toplam Ogr Sayisi : " + toplamOgrncisayisi);
    }
}
