package Day26_LocalTime;

public class C07_Varargs {
    public static void main(String[] args) {


         // Verilen iki sayiyi toplayip yazdiran bir metod olusturun


        topla(5,9);
        topla(5,9,4);


    }

    public static void topla(int a, int b){
        System.out.println(a+b);

    }
    public static void topla(int a, int b,int c){
        System.out.println(a+b+c);

    }
}
