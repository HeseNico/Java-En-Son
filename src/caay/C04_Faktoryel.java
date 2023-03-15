package caay;

public class C04_Faktoryel {
    public static void main(String[] args) {

        int sayi=6;
        int faktor=1;
        System.out.print("6! = ");

        for (int i = sayi; i >=1 ; i--) {
            faktor *=i;
           if (i!=1){
               System.out.print(i + " * ");
           }else{
               System.out.print(i+ " ");
           }

        }
        System.out.print("= "+ faktor);
    }
}
