package Day21_arraylist_foreachLoop;

public class C04_karelerinToplami {
    public static void main(String[] args) {

        /*
        Soru 2- Verilen int array’deki her elementin karelerini alip,
                karelerinin toplamini yazdiran bir method olusturun.
         */

        int[] hsn={3,2,5};

        karelerintoplami(hsn);
    }

    public static void karelerintoplami(int[] hsn){


        int toplam=0;


        for (int each:hsn
             ) {
            toplam += each*each;
        }
        System.out.println(toplam);
    }

}
