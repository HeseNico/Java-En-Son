package Day18_;

import java.util.Arrays;

public class C02_StringSplitmetodu {
    public static void main(String[] args) {

        // bir stringi istedigimiz parcalara ayirmak icin kullanilir


        String str="Java candir can, bundan suphesi olan var mi?";

        // str kac kelimedir?

        String[] kelimeler =str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [Java, candir, can]

        System.out.println("Kelime sayisi : " + kelimeler.length);

        // en uzun kelime kac harflidir?

        int enuzunkelimelength=kelimeler[0].length();

        for (int i = 0; i < kelimeler.length ; i++) {

            if (kelimeler[i].length()>enuzunkelimelength){
                enuzunkelimelength=kelimeler[i].length();
            }

        }
        System.out.println("En uzun kelimenin karekter sayisi : " +enuzunkelimelength);





    }
}
