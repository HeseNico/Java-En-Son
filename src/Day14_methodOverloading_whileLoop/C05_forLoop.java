package Day14_methodOverloading_whileLoop;

public class C05_forLoop {
    public static void main(String[] args) {

        /*
        Baslangic ve bitis degeri belli olan
        veya kac kere tekrar edilecegi bilinen
        loop'larda for loop ideal olarak kullanilabilir
        ancak tekrar sayisi belli olmayan baslangis veya bitisi baska
        bir variable bagli olan durumlarda forloop yerine
        while loop tercih edilir
         */

        // 50 ve 100 arasindaki (sinirlar dahil) sayilari toplayin

        int toplam=0;

        for (int i = 50; i <=100 ; i++) {
            toplam+=i;

        }
        System.out.println("Toplam : " +toplam);

        /// forloop'ta baslangic degeri bitis sarti ve artis var ama hepsi i ye bagli

        // ayni soruyu whileloop ile yapalim
        // forloop'ta 3 seyi takip ederiz
        //1-baslangic degeri 2- bitis sarti 3- artis veya azalis sekli


        toplam=0;
        int sayi=50;
        while (sayi<=100){
            toplam+=sayi;

            sayi++;


        }
        System.out.println("while ile toplam :"+ toplam);
    }
}
