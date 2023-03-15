package Day09_Swich_StringManupulation;

public class C07_lenght {
    public static void main(String[] args) {
         // uzunluk demek

        String str="Java gun gectikce guzellesiyor";

        // bu cumledeki karekter sayisiniz yazdirin

        System.out.println(str.length()); // 30 karekterli oldugunu yazar

        // bu cumledeki son karekteri yazzdirin

        System.out.println(str.charAt(30-1));
        System.out.println(str.charAt(str.length()-1));

        // sondan 3 karekteri yazdir

        System.out.println(str.charAt(str.length()-3));


    }
}
