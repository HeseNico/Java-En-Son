package Day09_Swich_StringManupulation;

public class C06_charAt {
    public static void main(String[] args) {

        String str="Java Candir";

        System.out.println(str.charAt(0)); // ilk harfi yazar

        // 6 harfi istediginde

        System.out.println(str.charAt(5)); // C yazdirdi . cunku 0j1a2v3a4bosluk 5c
        //sondan 2ci harfi yazdir

        System.out.println(str.charAt(11-2)); // 11 karekter oldugu icin -2 yapiyoruz

        // sondan 1 harf yaz
        System.out.println(str.charAt(11-1)); // r yi verir

        System.out.println(str.charAt(10)); // 11 hata veriyor

        // str=23;  hemen altini cizer int atayamazsin diyor
        /*
        javada 2 turlu hata ile karsilasabiliriz
        1 syntax olarak hatali yazilan kodlari java compile edrken anlar ve altini kirmizi cicer
        str = 23; eger biz String bir degere int atanamayacagini bilir ve altini kirmizi cizer
        CompileTimeError(CTE) diyoruz
        2- Bazende syntax te sorun olmaz Java calistiktan sonra farkeder str.charAt(11) : burada
        verilen str dan karekter istiyor
        compile time da str uzunlugunu Java anlamaz ama calisinca 11 indexi farkedrer ve exception firlatir
        RunTimeError (RTE) deriz
         */
    }
}
