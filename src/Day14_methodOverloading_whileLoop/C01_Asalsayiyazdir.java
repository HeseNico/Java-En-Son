package Day14_methodOverloading_whileLoop;

public class C01_Asalsayiyazdir {
    public static void main(String[] args) {

        asalMiYazdir(20);
        asalMiYazdir(35);
        asalMiYazdir(23);
        asalMiYazdir(2);

    }

    public static void asalMiYazdir(int sayi){

        int flag=0;

        for (int i = 2; i <sayi ; i++) {

            if (sayi%i==0){
                flag++;
                break;
            }

        }
        if (sayi==2){
            System.out.println("Grilen 2 sayisi bir asal sayidir");
        }
        else if (flag==0){
            System.out.println("Grilen " +sayi+ " sayisi asal bir sayidir");
        }else {
            System.out.println("Grilen " +sayi+ " sayisi asal bir sayi degil");
        }

    }
}
