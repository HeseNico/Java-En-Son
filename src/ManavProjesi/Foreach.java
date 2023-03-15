package ManavProjesi;

public class Foreach {
    public static void main(String[] args) {

        int[] arr = {1, 5, 4, 7, 8, 9, 6, 3, 2, 5};

        int toplam = 0;

        for (int each : arr) {

            toplam += each;
        }
        System.out.println(toplam);

        // 3 ile bolunenleri yazdir

        for ( int each:arr) {

            if (each%3==0)  System.out.print(each + " ");


        }

        int sayac=0;

        for (int each:arr) {

            if (each %2!=0 )
                sayac++;

        }
        System.out.println("tek sayac adeti : " + sayac);

    }
}
