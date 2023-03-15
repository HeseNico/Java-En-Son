package Day21_arraylist_foreachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {

        Integer[] arr = {3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};


        // arr tum elementlerini topla
        int toplam=0;

        for (int each: arr
             ) {
            toplam+=each;
        }
        System.out.println(toplam);
        // arr in elementlerinden 3 ile bolunenleri yazdir
        for (int each: arr
             ) {
            if ( each%3==0) System.out.print(each + " ");
        }
        System.out.println(" ");

        // arr icindeki teksayilarin sayisi nedir
        int sayac=0;
        for (int each: arr
             ) {
            if (each%2!=0) sayac++;
        }

        System.out.println("Tek sayi adeti : "+ sayac);
    }
}
