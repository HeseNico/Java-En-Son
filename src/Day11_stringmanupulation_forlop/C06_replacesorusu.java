package Day11_stringmanupulation_forlop;

public class C06_replacesorusu {

    public static void main(String[] args) {

        /*
        Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        input1 : “15.30 €” , input2 : “11.40 €”
        output : 36.70 €
         */

        String input1="15.30 €";
        String input2="11.40 €";

        // inputlarda digit olmayan herseyi yok edelim

        input1 = input1.replaceAll("\\D","");
        input2 = input2.replaceAll("\\D","");
    }
}
